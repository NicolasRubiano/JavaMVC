/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import controlador.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import vista.*;
import modelo.*;



public class PROJECT1_MVC {


   
    public static void main(String[] args) {
    
   Marco m=new Marco();
   
   m.jButton1.addActionListener(new Controller(m));
   m.jButton2.addActionListener(new ControllerInsertar(m));
   m.addWindowListener(new Controller(m));    
  
   m.setVisible(true);
   m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
}

}