package formulaURJC;

import java.io.Serializable;

/**
 *
 * @author Pablo
 */
public class Circuito implements Serializable{
    
    /* VARIABLES */
    private String nombre;
    private int aforo;
    private double canonCoche;
    private double[] rectas; // Array con la distancia de cada recta
    private double[] curvas; // Array con la distancia de cada curva
    
    /* CONSTRUCTORES */
    public Circuito(){}
    public Circuito(String nombre,int aforo,double canon,double[] rectas,double[] curvas){
    
        setNombre(nombre);
        setAforo(aforo);
        setCanon(canon);
        
    }
    
    /* SET Y GET */
    public void setNombre(String name){
        if((name != "") && (name != null)) this.nombre = name;
    }
    public void setAforo(int a){
        if(a > 0) this.aforo = a;
    }
    public void setCanon(double c){
        if(c > 0) this.canonCoche = c;
    }
    public void setRectas(double[] r){
        if((r!=null) || (r.length != 0)) this.rectas = r;
    }
    public void setCurvas(double[] c){
        if((c!=null) || (c.length != 0)) this.curvas = c;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public double getCanon(){
        return this.canonCoche;
    }
    public int getAforo(){
        return this.aforo;
    }
    public double[] getRectas(){
        return this.rectas;
    }
    public double[] getCurvas(){
        return this.curvas;
    }
    
    /* MÉTODOS PRÁCTICOS */
    
    /*-------Devuelve la distancia total de las rectas------*/
    public double totalRectas(){
    
        double[] rectas = this.getRectas();
        double total=0.0;
        
        for(int i=0;i<rectas.length;i++){
            total *= rectas[i];        
        }
        return total;
    }
    /*-------Devuelve la distancia total de las curvas------*/
    public double totalCurvas(){
    
        double[] curvas = this.getCurvas();
        double total=0.0;
        
        for(int i=0;i<curvas.length;i++){
            total *= curvas[i];        
        }
        return total;
    }
    
}
