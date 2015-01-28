package formulaURJC;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author kaisher
 */

public class Escuderia implements Serializable {
    
    /* CONSTANTES */
    private static final int MAXPILOTOS = 2;
    private static final int MAXCOCHES = 2;
    
    /* ATRIBUTOS */
    private String nombre;
    private String pais;
    private ArrayList<EquipoCarrera> elegidos;
    private String anio_fundador; //Cambiado Date a String. Menos lío. Revisar.
    private double presupuesto_mundial;
    private int puntos_mundial;
    private HashSet<Piloto> piloto = new HashSet<>();
    private HashSet<Coche> coche = new HashSet<>();
    //Faltan directivos
    
    /* CONSTRUCTORES */
    public Escuderia(){
    }
    public Escuderia(String nombre,String pais,String anio,double presupuesto,Piloto piloto,Coche coche){
        setNombre(nombre);
        setPais(pais);
        setAnioFundacion(anio);
        setPresupuestoMundial(presupuesto);
        setPiloto(piloto);
        setCoche(coche);
    }
    
    /* GET Y SET */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPais(String pais){
        this.pais=pais;
    }
    public void setAnioFundacion(String anio){
        this.anio_fundador=anio;
    }
    public void setPresupuestoMundial(double presupuesto_mundial){
        this.presupuesto_mundial=presupuesto_mundial;
    }
    public void setPuntos(int puntos_mundial){
        this.puntos_mundial=puntos_mundial;
    }
    public void setCoche(Coche coche){
        if ( this.coche.size()<MAXCOCHES & !this.coche.contains(coche) )
            this.coche.add(coche);
    }
    
    private void setPiloto(Piloto pl){
            this.piloto.add(pl);
    }

    
    public HashSet<Piloto> getPilotos(){
        return this.piloto;
    }
    public HashSet<Coche> getCoches(){
        return this.coche;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getPais(){
        return this.pais;
    }
    public String getAnioFundador(){
        return this.anio_fundador;
    }
    public double getPresupuestoMundial(){
        return this.presupuesto_mundial;
    }
    public int getPuntosMundial(){
        return this.puntos_mundial;
    }
    
    /* MÉTODOS PRÁCTICOS */
    
    /* Gestión Pilotos */
    private void addPiloto(Piloto p){
        if (!this.piloto.contains(p)){
            setPiloto(p);
            setPresupuestoMundial( getPresupuestoMundial()- p.getSueldo());
        }
    }
    
    public Coche getCoche(String s){
        for (Coche c: getCoches())
                if (c.getModelo().equals(s))
                    return c;
        return null;
    }
    
    public Piloto getPiloto(String n){
        for (Piloto p: getPilotos())
                if (p.getNombre().equals(n))
                    return p;
        return null;
    }
    
    

    private void borrarPiloto(Piloto p){
        this.piloto.remove(p);
    }
    
    private boolean maxPilotos(int n){
        return n<MAXPILOTOS;
    }
    
    // ---------------- Revisar --------------------------------------------------------<<<<<<<<<<
    public void fichar(Piloto p){
        if(comprobarFondos(p.getSueldo()) && p.getEsLibre())
        if (maxPilotos(numPilotos(p))){
            p.setEslibre(false);
            addPiloto(p);
    }
    //----------Alerta pilotos llenos------------------
    //--------Alerta Comprobar salario suficiente------------
    //-------- Alerta si pertenece a otra escuderia ------------
    }
    
    
    /* ---------------------- REVISAR ------------------------ */
    /* Comprobar el tipo que es.
    Salida: número según el tipo */
    private int numPilotos(Piloto pil){
        int of=0;
        int pr=0;
        for(Piloto p:getPilotos()){ //cambiado piloto por getPilotos()
            if (p instanceof Oficial)
                of=+1;
            if (p instanceof Probador)
                pr=+1;
        }
        if(pil instanceof Oficial){
            return of;
        }
        return pr;
    }
    
    public void intercambiarPiloto(Piloto p1,Piloto p2,Escuderia e){
        if (valoracionLimite(p1.getValoracionGlobal(),p2.getValoracionGlobal())){
            addPiloto(p2);
            e.addPiloto(p1);
            borrarPiloto(p1);
            e.borrarPiloto(p2);
        }
    }
    
    /*Comprobacion Limite del 10% del rango de valoracion */
    private boolean valoracionLimite(double a,double b){
        double max = a + a * 0.1;
        double min = a - a * 0.1;
        return b <= max && b >=min;
    }
    
    //----------------- Por si acaso --------------------------------------------------------------<<<<<<<
    public void pagarPiloto(){
        for(Piloto p:piloto){
            setPresupuestoMundial(getPresupuestoMundial()- p.getSueldo());
        }
    }
    
    public void descartarPiloto(Piloto p){
        borrarPiloto(p);
    }
    
    private boolean comprobarFondos(double a){
        return a<getPresupuestoMundial();
    }
    
    public void entrenar(Circuito circuito,Coche coche,Piloto piloto){
        if (comprobarFondos(circuito.getCanon())){
            coche.entrenar();
            piloto.entrenar();
            pagarCanon(circuito);
        }else{
            
        }
    }
    
    /* Eliges el equipo para realizar las carreras */
    //FALTA:
    // Las escuderías pueden decidir qué coches y qué pilotos van a participar en cada carrera del mundial. 
    //Si no eligen nada se establecerá una combinación al azar por defecto.
    public void elegirEquipo(Coche coche,Oficial oficial){
        if(elegidos.size()<5)
            elegidos.add(new EquipoCarrera(coche));
        /// -------------Prueba de seleccion--------/
    }
    
    public void pagarCanon(Circuito c){
        setPresupuestoMundial(getPresupuestoMundial() - c.getCanon());
    }
    
    
}

