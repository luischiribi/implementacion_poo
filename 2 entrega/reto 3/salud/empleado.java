package salud;
import java.util.*;

public class empleado extends persona {

    

    public void calcularHonorarios(double valorHora,int horasTrabajadas,double total,String tipoDoc,int documento,String nombre,String apellido,String cargo) {

        total=valorHora*horasTrabajadas-(0.966*100);

        System.out.println("-----------------------------------");

        System.out.println("Documento "+tipoDoc+" numero :"+documento);

        System.out.println("Nombre: "+nombre+apellido);

        System.out.println("Cargo:"+cargo);

        System.out.println("Horas trabajadas:"+horasTrabajadas);

        System.out.println("Valor por hora:"+valorHora);

        System.out.println("Total a pagar:"+total);
    }
    
}
