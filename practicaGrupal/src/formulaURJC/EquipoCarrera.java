package formulaURJC;
/**
 *
 * @author kaisher
 */
public class EquipoCarrera {
    private double tiempo;
    private Carrera carrera;
    private Coche coche;
    private Piloto piloto;

    public EquipoCarrera(){}
    public EquipoCarrera(Coche co){
        setCoche(co);
    }
    
    public void setCarrera(Carrera ci){
        this.carrera=ci;
    }
    public void setCoche(Coche co){
        this.coche=co;
    }
    
    //---------- Comprueba que se le asigna un Piloto Oficial ------------------//
    public void setPiloto(){
        if(coche.getPiloto() instanceof Piloto){
            this.piloto = coche.getPiloto();
        }else{System.out.println("ERROORRR");}
    }
    public void setTiempo(double t){
        this.tiempo=t;
    }
    
    public Carrera getCarrera(){
        return this.carrera;
    }
    public Coche getCoche(){
        return this.coche;
    }
    public Piloto getPiloto(){
        return this.piloto;
    }
    public double getTiempo(){
        return this.tiempo;
    }
}
