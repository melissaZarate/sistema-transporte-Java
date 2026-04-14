
package sistematransporte;

import java.util.ArrayList;

public class SistemaTransporte {

   
    public static void main(String[] args) {
        // Sistema con abstraccion+ herencoa+polifpormismo
        //aqui lo llamamos con un lista dinamica
        ArrayList<Transporte>LisT=new ArrayList<>();
        LisT.add(new Bus("Bus escolar"));
        LisT.add(new Taxi("Taxi amarillo"));
        LisT.add(new Bicicleta("Bici Roja"));
        for (Transporte T:LisT){
            System.out.println(T.getNombre());
            System.out.println(T.moverse());
            if(T.tieneCombustible()==true){
               
                System.out.println(T.TipoCombustible());
            }
            else{
                System.out.println("No tiene combustible");
            }
            System.out.println(T.capacidad());
            System.out.println();
        }
        
    }
    
}
