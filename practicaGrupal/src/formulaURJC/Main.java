package formulaURJC;
import Fichero.*;
import java.io.IOException;
import java.util.ArrayList;

/* FALTA:
El sistema permitirá consultar las clasificaciones del mundial, parciales y finales. 
También será posible acceder a los resultados de cada carrera, una vez que ésta haya sido disputada. 
Además, dado un piloto será posible conocer en qué carreras ha participado y en qué posición ha quedado en cada una de ellas.
*/

public class Main{

    public static void main(String[] args) throws IOException{
        debug();
    }
    
    
    public static void debug(){
    
        FCircuito c = new FCircuito();
        ArrayList<Circuito> fichero = new ArrayList();
        ArrayList<Circuito> salidaFichero = new ArrayList();
        Circuito s = new Circuito();
        s.setNombre("Estoy hasta los.... de DAS");
        fichero.add(s);
        try{
            c.escribir(fichero);
            salidaFichero=c.leer();
        }
        catch(Exception e){
            System.err.println("Error leyendo el fichero"+e);
        }
        finally{
            for(Circuito cir:salidaFichero){
                System.out.println(cir.getNombre());
            }
        }

    }
}
