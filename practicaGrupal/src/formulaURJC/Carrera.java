package formulaURJC;
import java.util.*;
import java.io.Serializable;


/**
 *
 * @author Pablo
 */

/* FALTA: ASIGNAR PUNTOS, PAGAR PREMIOS,Al acabar cada carrera se deberá dar la siguiente información de cada escudería:
o Presupuesto actual (después de descontar sueldos, canon y sumar ganancias) o Puntos de sus pilotos.
o Puntos de la escudería.*/
public class Carrera implements Serializable {
    
    /* CONSTANTES */
    private final int VUELTAS = 50; //Total de vueltas por carrera
    private final int[] PUNTOS = {25,18,15,12,10,8,6,4,2,1};
    
    /* VARIABLES */
    private Circuito circuito;
    private ArrayList<EquipoCarrera> equipos = new ArrayList(); /* Todos los equipos que compiten en cada carrera*/
    private Map<Double, Piloto> clasificacionCarrera = new TreeMap<Double, Piloto>();

    /* CONSTRUCTORES */
    public Carrera(){}
    public Carrera(Circuito circuito){
    
        setCircuito(circuito);
        setEquipos(equipos);
        setClasificacion(equipos);
        
    }
    
    /* SET Y GET */
    private void setCircuito(Circuito c){
        if(c != null) this.circuito = c;
    }
    private void setEquipos(ArrayList<EquipoCarrera> e){
        if((e!=null) && (!e.isEmpty())) this.equipos = e; 
    }
    private void setClasificacion(ArrayList<EquipoCarrera> e){   
        if((e!=null) && (!e.isEmpty())){
            for(EquipoCarrera equipo:e){
               clasificacionCarrera.put(disputar(equipo.getCoche()),equipo.getPiloto());
            }
        }
    }
    
    private Circuito getCircuito(){
        return this.circuito;   
    }
    private ArrayList<EquipoCarrera> getEquipos(){
        return this.equipos;
    }
    public Map<Double, Piloto> getClasificacion(){
        return this.clasificacionCarrera;
    }
    
    /* MÉTODOS PRÁCTICOS */
    //Refactorizar (optimizar ambos)
    
    //Al tiempo obtenido por el coche se le restará 1 segundo por cada punto de la valoración global del piloto.
    /*------- Corremos una carrera, devuelve el tiempo que tarda en dar 50 vueltas */
    public double disputar(Coche car){
    
        Circuito cir = this.getCircuito();
        
        double velR = car.getVelocidadRecta();
        double velC = car.getVelocidadCurva();
        double totalR = cir.totalRectas();
        double totalC = cir.totalCurvas();
        
        /* Calculamos cuánto tarda en dar una vuelta en SEGUNDOS */
        double tiempoVuelta = (3600 * (totalR / velR)) + (3600 * (totalC / velC));

        /* Calculamos cuánto tarda en dar 50 vueltas */
        double tiempoTotal = tiempoVuelta * VUELTAS;
        
        /* ----------------- */
        /*Al tiempo obtenido por el coche se le restará 1 segundo por cada punto de la valoración global del piloto.*/
        /* ----------------- */
        
        /* Redondeamos */
        double time = Math.round(tiempoTotal);
    
        return time;
    }
    
}