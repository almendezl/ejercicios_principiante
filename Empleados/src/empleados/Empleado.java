package empleados;

/**
 *
 * @author Angie Mendez
 */
public class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private int edad;
    private double sueldoMensual;

    public Empleado(String primerNombre, String apellidoPaterno, int edad, double sueldoMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if(edad >=18)
        this.edad = edad;
        else 
            this.edad = 0;
        if (sueldoMensual >0)
        this.sueldoMensual = sueldoMensual;
        else 
            this.sueldoMensual = 0.0;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    

}
