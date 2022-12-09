package salud;
import java.util.*;

public class persona {

    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    int edad;
    String sexo;
    int peso;
    int estatura;

    Scanner entrada = new Scanner(System.in);

    public void pedirDatos() {

        System.out.println("-----------------------------------");

        System.out.println("ingrese su tipo de documento");
        tipoDoc=entrada.next();

        System.out.println("ingrese su documento");
        documento=entrada.nextInt();

        System.out.println("ingrese su nombre");
        nombre=entrada.next();

        System.out.println("ingrese su apellido");
        apellido=entrada.next();

        System.out.println("ingrese su edad");
        edad=entrada.nextInt();

        System.out.println("ingrese su sexo");
        sexo=entrada.next();    

        System.out.println("ingrese su peso");
        peso=entrada.nextInt();

        System.out.println("ingrese su estatura");
        estatura=entrada.nextInt();

    }
    public void mostrarPersona() {

        System.out.println("-----------------------------------");
        
        System.out.println("Documento "+tipoDoc+" numero :"+documento);

        System.out.println("Nombre: "+nombre+apellido);

        System.out.println("peso: "+peso+"kg");

        System.out.println("Estatura: "+estatura);

        System.out.println("Edad: "+edad);

        System.out.println("Sexo: "+sexo);    

        System.out.println("-----------------------------------");
    }
    
    public int calcularlmc() {
      
        int pesoActual=peso/estatura*2;

        return pesoActual;       
    }

    public void mayorEdad() {

        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }


    
}
