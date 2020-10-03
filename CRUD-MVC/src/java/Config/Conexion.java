package Config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/registro", "root", "");
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    
    public Connection getConexion(){
        return con;
    }   
}
