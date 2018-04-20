package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROBIN
 */
public class DbConnection {
    
    private Connection connection;
    
    public DbConnection()throws ClassNotFoundException, SQLException{
        if(connection == null){
            Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PMS","root","sky13001167");
        }
    }
     
    public boolean setData(String sql) throws SQLException{
        boolean isExecuted = false;
        if(connection != null){
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            isExecuted = true;
    }
        closeConnection();
        return isExecuted;
    }
    
    public ResultSet getData(String sql) throws SQLException{
     ResultSet resultset = null;
      if(connection != null){
          Statement statement = connection.createStatement();
          resultset = statement.executeQuery(sql);
      }
      return resultset;
    }
    
    
    
    private void closeConnection() throws SQLException{
        if(connection != null){
            connection.close();
        }
    }
}
