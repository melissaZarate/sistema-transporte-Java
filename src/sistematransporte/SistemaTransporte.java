
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
           T.mostrarInfo(10);
           if(T.esEconomico(10)==true){
               System.out.println("Es economico");
           }
           else{
               System.out.println("Es caro");
           }
            System.out.println("____________________________________________________________________");
        }
        
    }
    
}
