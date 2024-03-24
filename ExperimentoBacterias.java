import java.util.ArrayList;
import java.util.Date;

public class ExperimentoBacterias {
    private String nombre;
    private double tempratura;
    private Date fechaInicio;
    private Date fechaFinal;
    private ArrayList<PoblacionBacterias> poblacion= new ArrayList<>();
    private GestionComida comida;
    private Luminosidad luminosidad;

    public ExperimentoBacterias(String nombre, float tempratura, Luminosidad luminosidad, Date fechaInicio, Date fechaFinal,GestionComida comida){
        this.nombre=nombre;
        this.comida=comida;
        this.luminosidad=luminosidad;
        this.fechaFinal=new Date();
        this.fechaInicio=new Date();
        this.tempratura=tempratura;

    }
    public ExperimentoBacterias(){
        this.nombre="";
        this.fechaInicio=new Date();
        this.fechaFinal=new Date();
        this.tempratura=0;
        this.comida=null;
        this.luminosidad=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTempratura() {
        return tempratura;
    }

    public void setTempratura(double tempratura) {
        this.tempratura = tempratura;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public ArrayList<PoblacionBacterias> getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(ArrayList<PoblacionBacterias> poblacion) {
        this.poblacion = poblacion;
    }

    public GestionComida getComida() {
        return comida;
    }

    public void setComida(GestionComida comida) {
        this.comida = comida;
    }

    public Luminosidad getLuminosidad() {
        return luminosidad;
    }

    public void setLuminosidad(Luminosidad luminosidad) {
        this.luminosidad = luminosidad;
    }

    @Override
    public String toString() {
        return "ExperimentoBacterias{" +
                "nombre='" + nombre + '\'' +
                ", tempratura=" + tempratura +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                ", poblacion=" + poblacion +
                ", comida=" + comida +
                ", luminosidad=" + luminosidad +
                '}';
    }
}
