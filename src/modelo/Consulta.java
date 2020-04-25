
package modelo;

import java.sql.*;
import java.util.*;


public class Consulta {
    
   //--------------VARIABLES-----------------------------
private Conexion SQL = new Conexion();
private Connection conn = SQL.Conectar();
private ArrayList <Productos> info=new ArrayList();
private String ConsultaSQL;
  //--------------CONSULTAR----------------------------
    public ArrayList <Productos> consultar(String seccionSeleccionada){
    if(seccionSeleccionada=="TODOS"){
        ConsultaSQL="SELECT * FROM productos ORDER BY SECCIÓN";
    }else{
       ConsultaSQL="SELECT * FROM productos WHERE SECCIÓN='"+seccionSeleccionada+"'"; 
    }
        Productos p;       
       //"SELECT * FROM productos WHERE CóDIGOARTÍCULO='"+codigo+"'"
    try {
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(ConsultaSQL);
       
       while (rs.next()) {  
       p=new Productos(rs.getString(1), rs.getString(2), rs.getString(3),rs.getDouble(4), rs.getString(5));
       info.add(p);
       
       }
       stmt.close();
       return info;
        
    } catch (SQLException ex) {
        System.out.println("Error al conectar"+ex);
    }
        
        return info;
    }
 //--------------------------------------------------------------------------------
 

}
