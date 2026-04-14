
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
    public abstract String TipoCombustible();
    public abstract double costoViaje(double distancia);
    
    public void mostrarInfo(double distancia){
        System.out.println("Nombre: "+getNombre());
        System.out.println("combustible: "+TipoCombustible());
        System.out.println("cpacidad: "+capacidad());
        System.out.println("costo de viaje para "+distancia+ " km es:"+costoViaje(distancia));
        System.out.println("____________________________________________________________________");
        
    }
    
  
 
    
    
}
