
package sistematransporte;

/**
 *
 * @author HP
 */
public class Bicicleta extends Transporte{

    public Bicicleta(String nombre) {
        super(nombre);
    }
      //clases abstractas
    @Override
    public String moverse(){
        String seMueve="se mueve con pedales";
        return seMueve;
    }
    @Override
    public String capacidad(){
        
        return "Tiene capacidad para 2 personas";
    }
    @Override
    public String TipoCombustible(){
        return "no tiene combustible";
    }
    public double costoViaje(double distancia){
        return 0;
    }
   
}
