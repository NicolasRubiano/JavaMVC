
package modelo;

import java.sql.*;
import java.util.*;


public class CargaSecciones {
       
   //--------------VARIABLES-----------------------------
private Conexion SQL = new Conexion();
private Connection conn = SQL.Conectar();
private ArrayList <String> arraySecciones=new ArrayList();

  //--------------CONSULTAR----------------------------
    public ArrayList <String> consultar(){
            
       //"SELECT * FROM productos WHERE CóDIGOARTÍCULO='"+codigo+"'"
    try {
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery("SELECT DISTINCTROW SECCIÓN FROM productos");
       
       while (rs.next()) {  
     
       arraySecciones.add(rs.getString(1));
         
       }
       stmt.close();
       return arraySecciones;
        
    } catch (SQLException ex) {
        System.out.println("Error al conectar"+ex);
    }
        
        return arraySecciones;
    }
    
    
    
}
