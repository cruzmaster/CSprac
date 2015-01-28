package formulaURJC;
import java.util.ArrayList;

/**
 *
 * @author kaisher
 */
public class Mercado {
    /* ATRIBUTOS */
    private ArrayList<Escuderia> escuderias;
    private ArrayList<Piloto> pilotos;
    //pendiente
    
    /* CONSTRUCTORES */
    public Mercado(){}
    public Mercado(ArrayList<Escuderia> escuderias, ArrayList<Piloto> pilotos){
        setEscuderia(escuderias);
        setPilotos(pilotos);
    }
    
    /* SET Y GET */
    
    public void setEscuderia(ArrayList<Escuderia> escuderias){
        this.escuderias = escuderias;
    }
    public void setEscuderia(Escuderia esc){
        if (!this.escuderias.contains(esc))
                this.escuderias.add(esc);
    }    
    public Escuderia getEscuderia(String nombre){
        for(Escuderia esc: escuderias)
            if (esc.getNombre().equals(nombre))
                return esc;
        return null;
    }
    public Piloto getPiloto(Escuderia esc, String nombre){
        
        for (Piloto pil: esc.getPilotos())
            if(pil.getNombre().equals(nombre))
                return pil;
        return null;
    }

    public ArrayList<Piloto> getPilotos(){
        return this.pilotos;
    }
    
    public void setPilotos(ArrayList<Piloto> piloto){
        this.pilotos = piloto;
    }
    public ArrayList<Escuderia> getEscuderia(){
        return this.escuderias;
    }

    
    /* MÉTODOS PRÁCTICOS */
    
    public boolean sonOficiales(Piloto p1,Piloto p2){
        return p1 instanceof Oficial & p2 instanceof Oficial;
                
        
    }
    public boolean sonProbadores(Piloto p1,Piloto p2){
        return p1 instanceof Probador & p2 instanceof Probador;
        
    }
    
    //Devuelve los pilotos sin escuderia
    public ArrayList<Piloto> getPilotosLibres(){
        ArrayList<Piloto> pl = new ArrayList<>();
        for (Piloto p:pilotos)
            if (p.getEsLibre())
                pl.add(p);
        
        return pl;
    }

    //Devuelve los pilotos de la escuderia 
    public ArrayList<Piloto> getPilotosEscuderia(Escuderia esc){
        ArrayList<Piloto> pl = new ArrayList<>(esc.getPilotos());
        return  pl;
    }

    
    public void ficharPiloto(Escuderia escuderia,Piloto piloto){
        escuderia.fichar(piloto);
    }
    
    public void ComprarVehiculo(Escuderia esc,Coche co){
        esc.setCoche(co);
    }
    
    public void cesionPiloto(Escuderia esc1,Piloto pil1,Escuderia esc2,Piloto pil2){
        esc1.intercambiarPiloto(pil1, pil2, esc2);
    }
}
