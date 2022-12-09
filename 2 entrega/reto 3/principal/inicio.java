package principal;
import salud.*;
import java.util.*;

public class inicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        persona persona = new persona();

        System.out.println("ingrese su tipo de documento");
        persona.setTipoDoc(entrada.next());

        System.out.println("ingrese su documento");
        persona.setDocumento(entrada.nextInt());

        System.out.println("ingrese su nombre");
        persona.setNombre(entrada.next());

        System.out.println("ingrese su apellido");
        persona.setApellido(entrada.next());

        System.out.println("ingrese peso");
        persona.setPeso(entrada.nextInt());

        System.out.println("ingrese estatura");
        persona.setEstatura(entrada.nextInt());

        System.out.println("ingrese cargo");
        persona.setCargo(entrada.next());

        System.out.println("ingrese el valor de la hora");
        persona.setValorHora(entrada.nextDouble());

        System.out.println("ingrese horas trabajadas");
        persona.setHorasTrabajadas(entrada.nextInt());

        System.out.println("ingrese departamento");
        persona.setDepartamento(entrada.next());      

        persona.mostrarPersona(persona.getPeso(),persona.getEstatura(),persona.getNombre(),persona.getDocumento(),persona.getTipoDoc(),persona.getApellido());
        persona.calcularlmc(persona.getPeso(),persona.getEstatura());
        
        empleado empleado=new empleado();
        empleado.calcularHonorarios(empleado.getValorHora(),empleado.getHorasTrabajadas(),empleado.getTotal(),empleado.getNombre(),empleado.getDocumento(),empleado.getTipoDoc(),empleado.getApellido(),empleado.getCargo());

        entrada.close();

    }
    
}
