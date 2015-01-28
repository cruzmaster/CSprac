/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichero;
import formulaURJC.Coche;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author sefi-_000
 */
public class FCoche extends Ficheros{
    private static final String NOMBREARCHIVO = "Coches.dat";
        
    
    @Override
    public void escribir(ArrayList obj)throws FileNotFoundException, IOException{
        //Se crea un Stream para guardar archivo
        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(new File(NOMBREARCHIVO)));
        //Se escribe el objeto en archivo
        file.writeObject (obj);
        //se cierra archivo
        file.close();
    }
    
    public ArrayList<Coche> leer() throws IOException, ClassNotFoundException{
        ArrayList<Coche> coche;
        //Se lee el objeto de archivo y este debe convertirse al tipo de clase que corresponde
        try (ObjectInputStream file = new ObjectInputStream(new FileInputStream(new File(NOMBREARCHIVO)))) {
            //Se lee el objeto de archivo y este debe convertirse al tipo de clase que corresponde
            coche = (ArrayList<Coche>) file.readObject();
            //se cierra archivo
        }
            return coche;
        
    }
    
}
