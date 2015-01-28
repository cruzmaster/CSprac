package formulaURJC;
import java.io.Serializable;
/**
 *
 * @author sefi-_000
 */
public abstract class Piloto implements Serializable {
    /* CONSTANTES */
    private final int VALORMINIMO=0;
    private final int VALORMAXIMO=6;
    
    /* ATRIBUTOS */
    /* datos personales */
    private String nombre;
    private String apellidos;
    private int edad;
    private double altura;
    private double peso;
    /* datos mundial */
    private int puntosmundial;
    private double sueldo;
    private boolean eslibre;
    private Coche coche;
    /* características técnicas */
    private double reflejos;
    private double agresividad;
    private double paciencia;
    private double valentia;
    private double valoracion_global;
    
    /* CONSTRUCTORES */
    public Piloto(){};
    public Piloto(String nombre, String apellido, int edad, double altura, double peso,
             int puntosmundial,double reflejos,double agresividad,
             double paciencia,double valentia,boolean eslibre){
        
        setNombre(nombre);
        setApellidos(apellido);
        setEdad(edad);
        setAltura(altura);
        setPeso(peso);
        setPuntosmundial(puntosmundial);
        setReflejos(reflejos);
        setAgresividad(agresividad);
        setPaciencia(paciencia);
        setValentia(valentia);
        setEslibre(eslibre);
        calcularSueldo();
        
    }
    
    
    /* GET Y SET */
     
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public int getPuntosmMundial() {
        return puntosmundial;
    }
    public double getReflejos() {
        return reflejos;
    }
    public double getAgresividad() {
        return agresividad;
    }
    public double getPaciencia() {
        return paciencia;
    }
    public double getValentia() {
        return valentia;
    }
    public double getSueldo() {
        return sueldo;
    }
    public double getValoracionGlobal() {
        return valoracion_global;
    }
    public boolean getEsLibre() {
        return eslibre;
    }
    
    /* En casi todos los set pones var >= 0, y la edad, altura, peso no puede estar a 0 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEdad(int edad) {
        if (edad>=0){
           this.edad=edad; 
        }
    }
    public void setAltura(double altura) {
        if (altura>=0.0){
            this.altura=altura;
        }
    }
    public void setPeso(double peso) {
        if (peso>=0.0){
           this.peso=peso; 
        }
    }
    public void setPuntosmundial(int puntosmundial) {
        if (puntosmundial>=0){
           this.puntosmundial=puntosmundial; 
        }
    }
   public void setReflejos(double reflejos) {
        if(reflejos>VALORMINIMO && reflejos<VALORMAXIMO){
            this.reflejos=reflejos;
        }
    }
    public void setAgresividad(double agresividad) {
        if(agresividad>VALORMINIMO && agresividad<VALORMAXIMO){
            this.agresividad=agresividad;
        }
    }
    public void setPaciencia(double paciencia) {
        if(paciencia>VALORMINIMO && paciencia<VALORMAXIMO){
            this.paciencia=paciencia;
        }
    }
    public void setValentia(double valentia) {
        if(valentia>VALORMINIMO && valentia<VALORMAXIMO){
            this.valentia=valentia;
        }
    }
    public void setSueldo(double sueldo) {
        if (sueldo>=0.0){
           this.sueldo=sueldo; 
        }
    }    
    private void setValoracion_global(double valoracion_global) {
        if ((valoracion_global>=0)){
            this.valoracion_global=valoracion_global;
        }else{
            this.valoracion_global=0;
        }
    }
    public void setEslibre(boolean eslibre) { //falta comprobación de que no sea null
        this.eslibre = eslibre;
    }    
    public void setCoche(Coche coche){//falta comprobación de que no sea null
        this.coche= new Coche();
    }
    
    /* MÉTODOS PRÁCTICOS */
    
    public void calcularValoracion_global(){
        setValoracion_global(this.reflejos+this.agresividad+this.paciencia+this.valentia);
    }
    
    protected abstract void calcularSueldo(); //valoracion*50
    public abstract void entrenar();    
     
}
