package principal;
import salud.*;
import java.util.*;

public class inicio {
    public static void main(String[] args) {
     
        int respuesta;

        persona ejecutar = new persona();

        ejecutar.pedirDatos();
        ejecutar.mostrarPersona();    
        ejecutar.mayorEdad();
        respuesta=ejecutar.calcularlmc();  

        if (respuesta<19) {
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if((respuesta>20)&&(respuesta<=25)){
            System.out.println("El peso es ideal");
        }
        else if(respuesta>25){
            System.out.println("Tiene sobrepeso");
        }


    }
    
}
