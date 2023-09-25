/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo26.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo26.entidades.Alumno;
import universidadgrupo26.entidades.Inscripcion;
import universidadgrupo26.vistas.Materia;

/**
 ** @author Marisa
 */
public class InscripcionData {
    private Connection con=null;
    private MateriaData md= new MateriaData();
    private AlumnoData ad = new AlumnoData();

    public InscripcionData() {
        this.con=Conexion.getConexion();
       
    }
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, idNota) VALUES (?,?,?)";
       
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                insc.setIdInscripcion(1);
                JOptionPane.showMessageDialog(null, "Inscripción registrada");
           
            }
        ps.close();
        } catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "error al ingresar a la tabla de inscripcion");
           
        }
       
    }
   
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql= "UPDATE inscripcion SET nota=? WHERE idAlumno=? and idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
           
            int filas=ps.executeUpdate();
            if(filas>0){
            JOptionPane.showMessageDialog(null, "Nota actualizada");
           
            }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ingresar a la tabla de inscripcion");
           
        }

    }
   
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
    String sql = "DELETE FROM inscripcion WHERE idAlumno=? and idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
           
            int filas = ps.executeUpdate();
            if(filas>0){
            JOptionPane.showMessageDialog(null, "Inscripción borrada exitosamente");
            }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ingresar a la tabla de inscripcion");
           
        }
   
    }
  /* 
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion>cursadas=new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
     
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Inscripcion insc = new Inscripcion();
            insc.setIdInscripcion(rs.getInt("idInscripto"));
            Alumno alu= ad.buscarAlumno(rs.getInt("idAlumno"));
            Materia mat= md.buscarMateria(rs.getInt("idMateria"));//está el metodo?
            insc.setAlumno(alu);
            insc.setMateria(mat);
            insc.getNota(rs.getDouble("nota"));
            cursadas.add(insc);
           
            }
           ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ingresar a la tabla de inscripcion");
        }
        return cursadas;
    }
*/
   
    /*
     public List<Inscripcion> obtenerInscripcionPorAlumno(int idAlumno){
        ArrayList<Inscripcion>cursadas=new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno=?";
     
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
            Inscripcion insc = new Inscripcion();
            insc.setIdInscripcion(rs.getInt("idInscripto"));
            Alumno alu= ad.buscarAlumno(rs.getInt("idAlumno"));
            Materia mat= md.buscarMateria(rs.getInt("idMateria"));//está el metodo?
            insc.setAlumno(alu);
            insc.setMateria(mat);
            insc.getNota(rs.getDouble("nota"));
            cursadas.add(insc);
           
            }
           ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al ingresar a la tabla de inscripcion");
        }
        return cursadas;
    }
     */
    /*
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
   
           ArrayList<Materia> materia = new ArrayList<>();
           
           String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion"
                   + "materia WHERE inscripcion.idMateria = materia.idMateria"
                   +"inscripcion.idAlumno=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Materia materia = new Materia();
            materia.idMateria(rs.getInt(idMateria));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("año"));
            materias.add(materia);
            }
            ps.close();
     
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion ");
        }
        return materias;
                 
    }
   
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
    ArrayList<Materia> materias = new ArrayList<>();
   
    String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not int"
            + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
   
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
           
                Materia materia = new Materia();
                materia.idMateria(rs.getInt(idMateria));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla de inscripcion");
           
           
        }
   
    } */

   
    public List<Alumno> obtenerAlumnoPorMateria(int idMateria){
        ArrayList<Alumno> alumnosMateria = new ArrayList<>();
    String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado"
            + "FROM inscripcion i, alumno a WHERE i.idAlumno=a.idAlumno AND id.Materia=? AND estado=1";
   
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, idMateria);
           
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fecha de nacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
               
            }
           
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla de inscripcion");
   
   
}
        return alumnosMateria;
   
    }

   
} 


