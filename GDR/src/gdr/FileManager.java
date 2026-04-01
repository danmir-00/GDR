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

    private static String filePathCSV = "";

    static void salvaCSV(Character charac, ArrayList<String> list) {
        String v = "-";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathCSV))) {
            //SAVE PERSONAGGIO
            //hardness,inefficenza,malFunzionamentoStrumento,nAnnotazioni,nGadget,typeCharc
            writer.write(Integer.toString(charac.getHardness()) + v + Integer.toString(charac.getInefficenza()) + v);
            writer.write(Integer.toString(charac.getMalFunzionamentoStrumento()) + v + Integer.toString(charac.getnAnnotazioni()) + v);
            writer.write(Integer.toString(charac.getnGadget()) + v + charac.getTypeCharc());
            writer.newLine();
            
            
            //SAVE lista eventi
            for (String x : list) {
                writer.write(String.join(v, x));
                writer.newLine();
            }

        } catch (IOException e) {

        }
    }
}
