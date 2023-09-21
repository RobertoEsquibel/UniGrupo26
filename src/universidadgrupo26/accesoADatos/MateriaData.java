/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo26.accesoADatos;

import com.sun.jndi.cosnaming.CNCtx;
import universidadgrupo26.entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class MateriaData {

private Connection con = null ;
public MateriaData(){
    con = Conexion.getConexion();
    }
public void guardarMateria(Materia materia){
    String sql = " INSERT INTO materia (idMateria, nombre , anio, estado) VALUES (?,?,?,?)";
    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, materia.getIdMateria());
        ps.setString(2, materia.getNombre());
        ps.setInt(3, materia.getAnioMateria());
        ps.setBoolean(4, materia.isActivo());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()){
            materia.setIdMateria(rs.getInt("idMateria"));
            JOptionPane.showMessageDialog(null,"Materia añadida con exito");
        }
        ps.close();
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de materia"+ ex.getMessage());
    }
}
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT  nombre, anio FROM materia WHERE idMateria = ? AND estado = 1 ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia"+ ex.getMessage());
        }
        return materia;
    }
    
    
}


