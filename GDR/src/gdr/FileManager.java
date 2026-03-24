/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mirica.daniel
 */
public class FileManager {
    void salvaCSV(String filePathCSV, Character charac, ArrayList list){
        String v =",";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePathCSV))){
           writer.write(Integer.toString(charac.getHardness())+v+Integer.toString(charac.getInefficenza())+v );
           writer.write(Integer.toString(charac.getMalFunzionamentoStrumento())+v+Integer.toString(charac.getnAnnotazioni())+v);
           writer.write(Integer.toString(charac.getnGadget())+v+ charac.getTypeCharc()+v+charac.getTypeGadget());
           
        }
        catch(IOException e){
            
        }
    }
}
