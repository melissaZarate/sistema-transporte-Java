
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
       
    
}
