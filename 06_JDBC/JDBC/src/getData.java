import java.sql.*;

public class getData {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/employees"; //jdbc:mysql://localhost:3306/?user=root
        String username = "root";
        String password = "root";
        String query = "select * from emplyees;";
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
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Job title :"+ job_title);
                System.out.println("salary : " + salary);
            }
            rs.close();
            stmt.close();
            con.close();

        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}
