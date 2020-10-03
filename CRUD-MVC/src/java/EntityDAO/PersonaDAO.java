package EntityDAO;

import Config.Conexion;
import Entity.Persona;
import Interface.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona persona = new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona> list = new ArrayList<Persona>();
        String sql="SELECT * FROM persona";
        try{
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Persona per = new Persona();
                per.setCodigo(rs.getInt("per_id"));
                per.setDocumento(rs.getString("per_documento"));
                per.setNombre(rs.getString("per_nombre"));
                list.add(per);
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return list;
    }

    @Override
    public Persona lis(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
