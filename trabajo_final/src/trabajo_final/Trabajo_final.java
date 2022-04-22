package trabajo_final;
import java.sql.Connection;        
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Trabajo_final {
    public static final String url = "jdbc:mysql://localhost:3306/pfinal";
    public static final String user = "root";
    public static final String clave = "";
    
    public static Connection conexionf(){
        Connection conectar = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(url,user,clave);
        
        }catch(ClassNotFoundException | SQLException e){
            System.err.println(e.getLocalizedMessage());
        
        
        }
        return conectar;
    
    
    
    }

 
    public static void main(String[] args) {
        login_main.main(args);
        
    }
    
}
