package figuras;
import java.util.*;

public class trapecio extends figurasGeometricas{
   
    private double a;
    private  double lado2;
    private double lado3;
    private double c;
    private double h;

    Scanner entrada = new Scanner(System.in);

    public trapecio() {
        
    }
    public  trapecio(double area,double perimetro,double a,double lado2,double lado3,double c,double h) {
        
       super(area,perimetro);
        this.a=a;
        this.lado2=lado2;
        this.lado3=lado3;
        this.c=c;
        this.h=h;
    }
 
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }

    public void ingresarDatosTra() {

        System.out.println("ingresar datos del trapecio");

        System.out.println("ingresar valor de B");
        lado2=entrada.nextDouble();
    
        System.out.println("ingresar valor de b");
        lado3=entrada.nextDouble();
    
        System.out.println("ingresar valor de a");
        a=entrada.nextDouble();
    
        System.out.println("ingresar valor de c");
        c=entrada.nextDouble();
    
        System.out.println("ingresar valor de h");
        h=entrada.nextDouble();
    }

    public void calcularArea() {
        
        setArea((lado2+lado3)*h/2);
 
        System.out.println("El area es:"+getArea());
        
    }

    public void calcularPerimetro() {
        
        setPerimetro(lado2+lado3+a+c);
        
        System.out.println("El perimetro es:"+getPerimetro());
        
    }
}
