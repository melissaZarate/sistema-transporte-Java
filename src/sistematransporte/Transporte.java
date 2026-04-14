
package sistematransporte;

//ceamos la clas abstracta
public abstract class Transporte {
    private String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
//metodos abstractos
    public abstract String moverse();
    public abstract String capacidad();
    public abstract boolean tieneCombustible();
    public String TipoCombustible(){
        return "tiene combustible";
    }
    
  
 
    
    
}
