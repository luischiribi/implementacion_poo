package salud;
import java.util.*;

public class persona {

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;
    private int peso;
    private int estatura;
    private int pesoActual;
    private int edad;
    private double total;
   
    public persona(){

    }

    public persona(String tipoDoc,int documento,String nombre,String apellido,String cargo,double valorHora,int horasTrabajadas,String departamento,int peso,int estatura,int pesoActual,double total){
         
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
        this.peso=peso;
        this.estatura=estatura;
        this.pesoActual=pesoActual;
        this.total=total;
        
    }
    

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    } 

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }




    public void mostrarPersona(int peso,int estatura,String tipoDoc,int documento,String nombre,String apellido) {

        System.out.println("-----------------------------------");

        
        System.out.println("Documento "+tipoDoc+" numero :"+documento);

        System.out.println("Nombre: "+nombre+apellido);

        System.out.println("peso: "+peso+"kg");

        System.out.println("Estatura: "+estatura);
      

        System.out.println("-----------------------------------");

    }
    public void calcularlmc(int peso,int estatura) {

        System.out.println("-----------------------------------");

        pesoActual=peso/estatura*2;

        if (pesoActual<19) {
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if((pesoActual>20)&&(pesoActual<=25)){
            System.out.println("El peso es ideal");
        }
        else if(pesoActual>25){
            System.out.println("Tiene sobrepeso");
        }
      
    }

  
}
