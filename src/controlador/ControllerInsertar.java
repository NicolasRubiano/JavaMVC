
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.AgregarProducto;
import vista.Marco;

public class ControllerInsertar implements ActionListener{
private Marco marco;
    
    public ControllerInsertar(Marco elMarco) {
        marco = elMarco;
      
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       //To change body of generated methods, choose Tools | Templates.
       AgregarProducto a=new AgregarProducto ();
       String cod=marco.jTextField1.getText();
       String sec=marco.jTextField2.getText();
       String nom=marco.jTextField3.getText();
       String pre=marco.jTextField4.getText();
       String pai=marco.jTextField5.getText();       
   a.Insertar(cod, sec, nom, Double.parseDouble(pre), pai);
   
   marco.jTextField1.setText("");
   marco.jTextField2.setText("");
   marco.jTextField3.setText("");
   marco.jTextField4.setText("");
   marco.jTextField5.setText("");

    }
    
}
