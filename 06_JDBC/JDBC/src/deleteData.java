

import java.sql.*;

public class deleteData {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/employees"; //jdbc:mysql://localhost:3306/?user=root
        String username = "root";
        String password = "root";
        String query = "DELETE FROM emplyees where id = 2;";
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
                System.out.println("data delete Sucessfully !");
            }else{
                System.out.println("data is not Delete !");
            }

            stmt.close();
            con.close();

        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}
