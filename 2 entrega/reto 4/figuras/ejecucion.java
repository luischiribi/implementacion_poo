package figuras;
import java.util.*;

public class ejecucion {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    trapecio trapecio=new trapecio();
    rombo rombo = new rombo();
    paralelogramo paralelogramo=new paralelogramo();
    int opcion;

    System.out.println("Bienvenido selecccione la figura que nesesite ingrese \n 1 para trapecio \n 2 para rombo \n 3 para paralelogramo ");
    opcion=entrada.nextInt();

    if (opcion==1) {
        trapecio.ingresarDatosTra();
        trapecio.calcularArea();
        trapecio.calcularPerimetro();
    }   
    if (opcion==2) {
        rombo.ingresarDatosRom();
        rombo.calcularArea();
        rombo.calcularPerimetro();
    }

    if (opcion==3) {
        paralelogramo.ingresarDatosPara();
        paralelogramo.calcularArea();
        paralelogramo.calcularPerimetro();
    }
        entrada.close();
    }
    
}
