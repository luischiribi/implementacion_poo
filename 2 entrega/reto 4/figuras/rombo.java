package figuras;
import java.util.*;

public class rombo extends figurasGeometricas{
 
    private double a;
    private  double d;
    private double c;

    Scanner entarda=new Scanner(System.in);
    public  rombo() {
        
    }
    public  rombo(double area,double perimetro,double a,double d,double c) {
        
        super(area,perimetro);
        this.a=a;
        this.d=d;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void ingresarDatosRom() {

        System.out.println("ingresar datos del rombo");

        System.out.println("ingresar valor de a");
        a=entarda.nextDouble();

        System.out.println("ingresar valor de d");
        d=entarda.nextDouble();

        System.out.println("ingresar valor de c");
        c=entarda.nextDouble();

    }

    public void calcularArea() {
        
        setArea((d*c)/2);
        

        System.out.println("El area es "+getArea());

    }

    public void calcularPerimetro() {

        setPerimetro(4*a);

        System.out.println("El perimetro es "+getArea());
        
    }
    
}

