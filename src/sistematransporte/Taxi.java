
package sistematransporte;

/**
 *
 * @author HP
 */
public class Taxi extends Transporte{

    public Taxi(String nombre) {
        super(nombre);
    }
      //clases abstractas
    @Override
    public String moverse(){
        String seMueve="se mueve con motor";
        return seMueve;
    }
    @Override
    public String capacidad(){
        
        return "Tiene capacidad para 4 personas";
    }
    @Override
    public boolean tieneCombustible(){
        return true;
    }
    public String tipoCombustible(){
        return "Gasolina";
    }
    
}
