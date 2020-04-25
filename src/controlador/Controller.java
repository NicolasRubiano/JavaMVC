
package controlador;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import vista.*;
import modelo.*;


public class Controller extends WindowAdapter implements ActionListener {
   //--------------VARIABLES-----------------------------
   private Marco elMarco; 
   private ArrayList <Productos> infoRecuperada=new ArrayList();
   private ArrayList <String> arraySeccionesRec=new ArrayList(); 
    //--------------CONSTRUCTOR-----------------------------

    public Controller(Marco elMarco) {
        this.elMarco = elMarco;
      
    }


    
 //--------------METODO ACCION DE EVENTO-----------------------------

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        ArrayList<Object[]> nuevo=new ArrayList<Object[]>();
        Consulta c=new Consulta();
        infoRecuperada=c.consultar(elMarco.jComboBox1.getSelectedItem().toString());
       
      

        for (Productos p:infoRecuperada) {
            String cod=p.getCodigoArticulo();
            String sec=p.getSeccion();
            String nom=p.getNombreArticulo();
            String pre=Double.toString(p.getPrecio());
            String pai=p.getPaisOrigen();
            nuevo.add(new Object[]{cod,sec,nom,pre,pai});
        }
        elMarco.EnviarDatos(nuevo);

    }


     //--------------------------------------------------------------

    @Override
    public void windowOpened(WindowEvent e) {
       CargaSecciones cS=new CargaSecciones();
       arraySeccionesRec=cS.consultar();
        for (String s:arraySeccionesRec) {
           elMarco.jComboBox1.addItem(s);
        }
        
    }

    
}
