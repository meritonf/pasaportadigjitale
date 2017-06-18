
package theClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DB {
   
    private static final String HOSTNAME = "DESKTOP-78UICGB";
    private static final String DATABASE = "passport";
    
    public static final String CONNECTION_STRING = "jdbc:sqlserver://" + HOSTNAME + ";databaseName=" + DATABASE + ";integratedSecurity=true";
    
    public static Connection getConnection() throws SQLException {
    
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            return DriverManager.getConnection(CONNECTION_STRING);
        }
        catch(ClassNotFoundException ex) {
        
            return null;
        }
    }
    
    public static Admin login(String username, String password) {
    
        Admin result = null;
        
        try {
        
            Connection sqlConn = DB.getConnection();
            Statement stmt = sqlConn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM admin WHERE username='" + username + "'");
            
            rs.next();
            
            if(rs.getRow() != 0) {
           
                String dbPasswordHash = rs.getString("password");
                String dbSalt = rs.getString("salt");
                
                String typedPasswordHash = hashClass.getPasswordHash(password + dbSalt);
                
                if(typedPasswordHash.equals(dbPasswordHash)) {
                
                    result = new Admin(rs);
                }
                else {
                
                    //invalid password
                }
            }
            else {
            
                //invalid username
            }
            
            rs.close();
            stmt.close();
            sqlConn.close();
        }
        catch(SQLException ex) {
        
            //DB error
        }
        
        return result;
    } 
    
  
    
    public static ArrayList<Person> getAllPassports() throws SQLException {
    
        ArrayList<Person> result = new ArrayList<>();
        
        Connection sqlConn = DB.getConnection();
        Statement stmt = sqlConn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM passports");

        while(rs.next()) {

            result.add(new Person(rs));
        }

        rs.close();
        stmt.close();
        sqlConn.close();

        return result;
    }

    public static ArrayList<Person> getVisaPassports() throws SQLException {
    
        ArrayList<Person> result = new ArrayList<>();
        
        Connection sqlConn = DB.getConnection();
        Statement stmt = sqlConn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM passports WHERE passport_type='Visa'");

        while(rs.next()) {

            result.add(new Person(rs));
        }

        rs.close();
        stmt.close();
        sqlConn.close();

        return result;
    }
    
    public static ArrayList<Person> getPersons() throws SQLException {
    
        ArrayList<Person> result = new ArrayList<>();
        
        Connection sqlConn = DB.getConnection();
        Statement stmt = sqlConn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM klienti");

        while(rs.next()) {

            result.add(new Person(rs));
        }

        rs.close();
        stmt.close();
        sqlConn.close();

        return result;
    }
    
    public static ArrayList<Person> searchClient(String personalNumber) throws SQLException {

        ArrayList<Person> result = new ArrayList<>();
        
        Connection sqlConn = DB.getConnection();
        Statement stmt = sqlConn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM klienti WHERE numri_personal='" + personalNumber + "'");

        while(rs.next()) {

            result.add(new Person(rs));
        }

        rs.close();
        stmt.close();
        sqlConn.close();

        return result;
    }
    
}