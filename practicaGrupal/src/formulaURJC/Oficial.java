package formulaURJC;
import java.io.Serializable;
/**
 *
 * @author sefi-_000
 */
public class Oficial extends Piloto implements Serializable{
    
    /* CONSTANTES */
    private final double VALORENTRENAOFICIAL=0.1;
    private final double VALORPUNTO=50;
    private final double PLUSPELIGROSIDAD=50;
    
    /* CONSTRUCTORES */
    public Oficial(String nombre, String apellido, int edad, double altura, double peso,
             int puntosmundial,double reflejos,double agresividad,
             double paciencia,double valentia,boolean eslibre){
        
        super(nombre,apellido,edad,altura,peso,puntosmundial,
                reflejos,agresividad,paciencia,valentia,eslibre);
       
    }
    public Oficial(){}
    
    /* MÉTODOS PRÁCTICOS */
    @Override
    public void entrenar(){
        setReflejos(getReflejos()+VALORENTRENAOFICIAL);
        setAgresividad(getAgresividad()+VALORENTRENAOFICIAL);
        setPaciencia(getPaciencia()+VALORENTRENAOFICIAL);
        setValentia(getValentia()+VALORENTRENAOFICIAL);
    }
    
    @Override
    protected void calcularSueldo(){
         setSueldo((getValoracionGlobal()*VALORPUNTO)+PLUSPELIGROSIDAD);
     } 
   
}
