package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bellas
 */
public class ConnectionFactory {
    
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String USER = "jdbc:mysql://localhost:3306/db_locadora";
    private static final String PASSWORD = "root";
    private static final String URL  = "";
    
//<editor-fold defaultstate="collapsed" desc="Pegando conexão"> 
    
    public static Connection getConnection(){
        
        try {
            
            Class.forName(DRIVE);
            
            return DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            throw new RuntimeException("Erro na conexão do banco", ex);
            
        }
        
    }
    
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Fechando conexões">
    
    public static void closeConnection(Connection con){
        
        if (con != null) {
            
            try {
                
                con.close();
                
            } catch (SQLException ex) {
                
                throw new RuntimeException("Erro ao fechar conexão 1", ex);
                
            }
            
        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        if (stmt != null) {
            
            try {
                
                stmt.close();
                
            } catch (SQLException ex) {
                
                throw new RuntimeException("Erro ao fechar conexão 2", ex);
                
            }
            
            closeConnection(con);
            
        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        if (rs != null) {
            
            try {
                
                rs.close();
                
            } catch (SQLException ex) {
                
                throw new RuntimeException("Erro ao fechar conexão 3", ex);
                
            }
            
        }
        
        closeConnection(con, stmt);
        
    }
    
//</editor-fold>
    
}
