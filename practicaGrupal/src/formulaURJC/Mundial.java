package formulaURJC;
import java.util.*;

/**
 *
 * @author Pablo
 */
//FALTA: EMPEZAR MUNDIAL,
public class Mundial {
    /* CONSTANTES */
    private final int MAXCARRERAS = 5;
    
    /* VARIABLES */
    private ArrayList<Carrera> conjuntoCarreras = new ArrayList();
    private Map<Integer, Piloto> clasificacionPilotos = new TreeMap<Integer, Piloto>();
    private Map<Integer, Escuderia> clasificacionEscuderias = new TreeMap<Integer, Escuderia>();    
    
    /* CONSTRUCTORES */
    public Mundial(){}
    public Mundial(ArrayList<Carrera> carreras){
    
        setCarreras(carreras);
        setClasificacionPilotos();
        setClasificacionEscuderias();
    }
    
    /* SET Y GET */
    private void setCarreras(ArrayList<Carrera> c){
        if((c != null) && (conjuntoCarreras.size()<MAXCARRERAS)) this.conjuntoCarreras = c;
    }
    private void setClasificacionPilotos(){
        ArrayList<Carrera> c = conjuntoCarreras;
        if((c != null)&&(!c.isEmpty())){
            for(Carrera carreras:c){
                //Clasificación de cada carrera
                Map<Double, Piloto> clasificacion = carreras.getClasificacion();
                //Iteramos sobre la clasificación
                Iterator it = clasificacion.keySet().iterator();
                while(it.hasNext()){
                    Double k = (Double) it.next();
                    clasificacionPilotos.put(k.intValue(),clasificacion.get(k));
                }
            }        
        }    
    }
    private void setClasificacionEscuderias(){
        ArrayList<Carrera> c = conjuntoCarreras;
        if((c != null)&&(!c.isEmpty())){
            for(Carrera carreras:c){
                //Clasificación de cada carrera
                Map<Double, Piloto> clasificacion = carreras.getClasificacion();
                //Iteramos sobre la clasificación
                Iterator it = clasificacion.keySet().iterator();
                while(it.hasNext()){
                    Double k = (Double) it.next();
                    //clasificacionEscuderias.put(k.intValue(),clasificacion.get(k).getEscuderia()); //FALTA ESTE MÉTODO
                }
            }        
        }    
    }
    
    /* MÉTODOS PRÁCTICOS */

    
}
