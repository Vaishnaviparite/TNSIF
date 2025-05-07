package DayFourteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded successfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PNQ07", "root", "root");
            System.out.println("Connection created successfully");

            Statement stmt = con.createStatement();
            System.out.println("Statement create successfully");

            ResultSet rs = stmt.executeQuery("Select * from student");

            System.out.println("STDID \t NAME \t SUBJECT \t DURATION");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4));
            }
            stmt.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}