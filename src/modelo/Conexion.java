
package modelo;

import java.sql.*;

public class Conexion {
    
    Connection conect=null;
    String driver="org.gjt.mm.mysql.Driver";
    String url="jdbc:mysql://localhost/javase";
    String user="root";
    String password="";
//------------------METODO CONEXIÓN CON LA BASE DE DATOS------------------    
    public Connection Conectar(){
        
         try{
            Class.forName(driver);
            
            conect=DriverManager.getConnection(url, user, password);
                         
            return conect;
            
         }catch(Exception e){   
            System.out.println("Error en la conexion");
         }
         
     return conect;
    }
    
}
