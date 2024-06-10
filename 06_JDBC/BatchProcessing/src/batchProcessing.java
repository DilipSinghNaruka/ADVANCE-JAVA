import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class batchProcessing {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees";
        String username  = "root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully ");


        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            connection.setAutoCommit(false);
            System.out.println("Connection succesfull ");
            String query = "INSERT INTO employees(name,job_title,salary)VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner scanner = new Scanner(System.in);

            while(true){
                System.out.println("Name : ");
                String name = scanner.next();
                System.out.println("Job title : ");
                String job_title = scanner.next();
                System.out.println("Salary : ");
                double salary = scanner.nextDouble();
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,job_title);
                preparedStatement.setDouble(3,salary);
                scanner.nextLine();
                preparedStatement.addBatch();
                System.out.println("Add more Values Y/N");
                String decision = scanner.next();
                if(decision.toUpperCase().equals("N")){
                    break;
                }


            }
            int[] batchResult = preparedStatement.executeBatch();
            connection.commit();
            System.out.println("Batch execute succesfull ");


        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}