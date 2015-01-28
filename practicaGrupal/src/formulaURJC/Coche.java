package formulaURJC;
import java.io.Serializable;

/**
 *
 * @author sefi-_000
 */
public class Coche implements Serializable{
    
    /* CONSTANTES */
    private static final double MEJORA=0.1;
    private static final double MAXVALOR=5.0;
    
    /* ATRIBUTOS */
    private String modelo;
    private Piloto piloto; // ¿SOBRA? PILOTO YA TIENE COCHE
    /* características técnicas */
    private double potencia;
    private double aerodinamica;
    private double neumaticos;
    private double velocidadRecta;
    private double velocidadCurva;
    
    /* CONSTRUCTORES */
    public Coche(){}
    
    public Coche(String modelo,double potencia,double aerodinamica,double neumaticos){
        setModelo(modelo);
        setPotencia(potencia);
        setAerodinamica(aerodinamica);
        setNeumaticos(neumaticos);
        setVelocidadRecta();
        setVelocidadCurva();
        
    }
    
    /* SET Y GET */
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setPotencia(double p){
        if(MAXVALOR>=p && p>=0.0)
        this.potencia=p;
    }
    public void setAerodinamica(double a){
        if(MAXVALOR>=a && a>=0.0)
            this.aerodinamica=a;
    }
    public void setNeumaticos(double n){
        if(MAXVALOR>=n && n>=0.0)
            this.neumaticos=n;
    }
    public void setVelocidadRecta(){
        this.velocidadRecta=potencia*20+aerodinamica*30;
    }
    public void setVelocidadCurva(){
        this.velocidadCurva=(potencia+neumaticos+aerodinamica)*10;
    }
    public void setPiloto(Piloto p){
        this.piloto = piloto;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public Double getPotencia(){
        return this.potencia;
    }
    public Double getAerodinamica(){
        return this.aerodinamica;
    }
    public Double getNeumaticos(){
        return this.neumaticos;
    }
    public double getVelocidadRecta(){
        return this.velocidadRecta;
    }
    public double getVelocidadCurva(){
        return this.velocidadCurva;
    }    
    public Piloto getPiloto(){
        return this.piloto;
    }

    /* MÉTODOS PRÁCTICOS */
    
    /* Mejorar caracteristicas coche al entrenar */
    public void entrenar(){
        setPotencia(potencia+MEJORA);
        setAerodinamica(aerodinamica+MEJORA);
        setNeumaticos(neumaticos+MEJORA);
        setVelocidadRecta();
        setVelocidadCurva();
    }
    
}
