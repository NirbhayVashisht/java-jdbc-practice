//following program will show how to use prepared statements

import java.sql.*;

public class Part5 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String pass = "abc12";

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try{
            //step 1: get a connection
            con = DriverManager.getConnection(url,user,pass);

            //step 2: prepare statement
            stmt = con.prepareStatement("select * from company where numberofemp > ? and cname = ? ");

            //step 3: set the parameters
            stmt.setDouble(1,9000);
            stmt.setString(2,"HCL");

            //step 4: execute a query
            rs = stmt.executeQuery();

            //step 5: display result
            display(rs);

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }finally {
            if (rs != null) {
                rs.close();
            }

            if (stmt != null) {
                stmt.close();
            }

            if (con != null) {
                con.close();
            }
        }
    }

    private static void display(ResultSet myRs) throws SQLException {
        while (myRs.next()) {
            String companyname = myRs.getString("cname");
            String cityname = myRs.getString("ccity");
            double numberofemp = myRs.getDouble("numberofemp");

            System.out.printf("%s, %s, %.2f,\n", companyname, cityname,numberofemp);
        }
    }
}
