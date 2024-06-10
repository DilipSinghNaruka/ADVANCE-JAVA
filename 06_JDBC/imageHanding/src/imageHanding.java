import java.io.*;
import java.sql.*;

public class imageHanding {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/imagedatabase";
        String username  = "root";
        String password = "root";
        String image_path = "E:\\Computer Science\\University Content\\8th Semester\\ADVANCE JAVA\\10_JDBC\\imageHanding\\src\\Screenshot 2024-05-18 103119.png";
        String folder_path = "E:\\Computer Science\\University Content\\8th Semester\\ADVANCE JAVA\\10_JDBC\\imageHanding\\src\\";
        String Insertquery = "INSERT INTO image_table(image_data) VALUES(?)";
        String retrivequery = "SELECT image_data from image_table where image_id = (?)";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully ");


        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        //Insert a image in database
//        try{
//            Connection connection = DriverManager.getConnection(url,username,password);
//            System.out.println("Connection succesfull ");
//            FileInputStream fileInputStream = new FileInputStream(image_path);
//            byte[] imagedata = new byte[fileInputStream.available()];
//            fileInputStream.read(imagedata);
//            PreparedStatement preparedStatement = connection.prepareStatement(Insertquery);
//            preparedStatement.setBytes(1, imagedata);
//            int affactedRows = preparedStatement.executeUpdate();
//            if(affactedRows>0){
//                System.out.println("Image inserted Successfull");
//            }else{
//                System.out.println("Image not inserted ");
//            }
//
//        }catch (SQLException | FileNotFoundException e){
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // retrieve data from database
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection succesfull ");
            PreparedStatement preparedStatement = connection.prepareStatement(retrivequery);
            preparedStatement.setInt(1,1);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                byte[] image_data = resultSet.getBytes("image_data");
                String retrieveImage_path = folder_path+"exter.png";
                OutputStream outputStream = new FileOutputStream(retrieveImage_path);
                outputStream.write(image_data);
                System.out.println("image add successfully ! ");

            }else{
                System.out.println("Image not found ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}