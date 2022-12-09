package principal;
import salud.*;

public class inicio {
    public static void main(String[] args) {
        
        persona ejecutar = new persona();
        ejecutar.pedirDatos();
        ejecutar.mostrarPersona();
        ejecutar.calcularlmc();
        ejecutar.mayorEdad();
    }
}
