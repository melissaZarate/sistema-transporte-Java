
package sistematransporte;


public class Bus extends Transporte {

    public Bus(String nombre) {
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
        
        return "Tiene capacidad para 24 personas";
    }
    @Override
    public boolean tieneCombustible(){
        return true;
    }
    public String tipoCombustible(){
        return "Diesel";
    }
}
