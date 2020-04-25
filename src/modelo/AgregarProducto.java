
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AgregarProducto {
    
   //--------------VARIABLES-----------------------------
private Conexion SQL = new Conexion();
private Connection conn = SQL.Conectar();
private ArrayList <Productos> info=new ArrayList();

  //--------------CONSULTAR----------------------------
    public void Insertar(String cod,String sec,String nom,Double pre,String pai){
    String SentenciaSql="INSERT INTO productos (CÓDIGOARTÍCULO, SECCIÓN, NOMBREARTÍCULO, PRECIO, PAÍSDEORIGEN) VALUES (?,?,?,?,?)";
        Productos p;       
       //"SELECT * FROM productos WHERE CóDIGOARTÍCULO='"+codigo+"'"
     
       // create the mysql insert preparedstatement
      PreparedStatement preparedStmt;
    try {
        preparedStmt = conn.prepareStatement(SentenciaSql);
        
      preparedStmt.setString(1, cod);
      preparedStmt.setString(2, sec);
      preparedStmt.setString(3, nom);
      preparedStmt.setDouble(4, pre);
      preparedStmt.setString (5, pai);
      preparedStmt.execute();
      conn.close();
    } catch (SQLException ex) {
        System.out.println("No pudo insertar"+ex);
    }
      

       
    }
 //--------------------------------------------------------------------------------
 
    
}
