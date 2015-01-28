/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichero;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kaisher
 */
public abstract class Ficheros {
    
    
    public abstract void escribir(ArrayList<Object> obj)throws FileNotFoundException, IOException;


}