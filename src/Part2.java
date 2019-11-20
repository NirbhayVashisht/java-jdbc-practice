//this is Part 1 of the series
/* In the following program we are inserting data into mysql database in java*/

import java.sql.*;

public class Part2 {
    public static void main(String[] args) {
        String username = "root";
        String password = "abc12";
        String url = "jdbc:mysql://localhost:3306/employee";

        try{
            //step 1: get a connection
            Connection myConn = DriverManager.getConnection(url,username,password);

            //step 2: create a statement
            Statement myStmt = myConn.createStatement();

            //step 3 : execute sql query
            String sql = "insert into company "+" (cname , ccity , numberofemp)"
                            +"values('Microsoft', 'Delhi' , '1000')";
            myStmt.executeUpdate(sql);

            System.out.println("Insert completed");

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
