
import java.sql.*;

public class insertData {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/employees"; //jdbc:mysql://localhost:3306/?user=root
        String username = "root";
        String password = "root";
        String query = "INSERT INTO emplyees(id,name,job_title,salary)VALUES(2,'suray','FrontEnd developer', 200000);";
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
                System.out.println("data inserted !");
            }else{
                System.out.println("data is not inserted !");
            }

            stmt.close();
            con.close();

        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}
