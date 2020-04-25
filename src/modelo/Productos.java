
package modelo;

public class Productos {
     //--------------VARIABLES-----------------------------
    private String codigoArticulo;
    private String Seccion;
    private String nombreArticulo;
    private double precio;
    private String paisOrigen;
    
       //--------------CONSTRUCTOR-----------------------------
    public Productos(){
     codigoArticulo="";
     Seccion="";
     nombreArticulo="";
     precio=0;
     paisOrigen="";
    }

    public Productos(String codigoArticulo, String Seccion, String nombreArticulo, double precio, String paisOrigen) {
        this.codigoArticulo = codigoArticulo;
        this.Seccion = Seccion;
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.paisOrigen = paisOrigen;
    }

     //--------------GETTERS Y SETTERS-----------------------------
    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
     //--------------TO STRING-----------------------------
    @Override
    public String toString() {
        return  "COD=" + codigoArticulo +"\n"+ ", Seccion=" + Seccion + "\n"+", nombre=" + nombreArticulo +"\n"+ ", precio=" + precio +"\n"+ ", pais Origen=" + paisOrigen +"\n"+"\n" ;
    }
    
    
    
            
}
