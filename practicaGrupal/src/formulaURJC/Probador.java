package formulaURJC;
import java.io.Serializable;

/**
 *
 * @author sefi-_000
 */
public class Probador extends Piloto implements Serializable {
    /* CONSTANTES */
    private final double VALORENTRENAPROBADOR=0.05;
    private final double VALORPUNTO=50;
    
    /* CONSTRUCTORES */
    public Probador(String nombre, String apellido, int edad, double altura, double peso,
            int puntosmundial,double reflejos,double agresividad,
            double paciencia,double valentia,boolean eslibre){
        
        super(nombre,apellido,edad,altura,peso,puntosmundial,
                reflejos,agresividad,paciencia,valentia,eslibre);
        
    }
    public Probador(){}
    
    /* MÉTODOS PRÁCTICOS */
    @Override
    public void entrenar(){
        setReflejos(getReflejos()+VALORENTRENAPROBADOR);
        setAgresividad(getAgresividad()+VALORENTRENAPROBADOR);
        setPaciencia(getPaciencia()+VALORENTRENAPROBADOR);
        setValentia(getValentia()+VALORENTRENAPROBADOR);
        
    }
    
    @Override
    protected void calcularSueldo(){
        setSueldo((getValoracionGlobal()*VALORPUNTO));
    }
}
