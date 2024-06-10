

import java.sql.*;

public class updateData {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/employees"; //jdbc:mysql://localhost:3306/?user=root
        String username = "root";
        String password = "root";
//        String query = "UPDATE emplyees\n" +
//                " SET job_title ='All rounder', salary = 250000.0," +
//                " WHERE id=2;";
        String query = "UPDATE emplyees " +
                "SET job_title='All rounder', salary=250000.0 " +
                "WHERE id=2;";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully !");

        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully ! ");
            Statement stmt = con.createStatement();
            int rowsaffected = stmt.executeUpdate(query);
            if(rowsaffected>0){
                System.out.println("data update Sucessfully !");
            }else{
                System.out.println("data is not update !");
            }

            stmt.close();
            con.close();

        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}
