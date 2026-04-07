/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author mirica.daniel
 */
public class FileManager {

    private static String filePathCSV = "salvataggio.csv";
    private static String filePathSerializzazione="salvataggio.dat";
    static void salvaSerializzazione(Character charac, ArrayList<String> list){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePathSerializzazione))) {
            // Salvo il personaggio
            oos.writeObject(charac);

            // Salvo la lista di eventi
            oos.writeObject(list);
            oos.writeInt(GameManager.getTurno());
            System.out.println("Salvataggio completato!");
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    static void letturaSerializzazione(){
     
    
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePathSerializzazione))) {
            GameManager.setCharScelto((Character) ois.readObject());
            GameManager.setListaEventixConsole((ArrayList<String>) ois.readObject())  ;
            GameManager.setTurno(ois.readInt());
            System.out.println("Caricamento completato!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    static void salvaCSV(Character charac, ArrayList<String> list) {
        String v = ";";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathCSV))) {
            //SAVE PERSONAGGIO
            //hardness,inefficenza,malFunzionamentoStrumento,nAnnotazioni,nGadget,typeCharc, turno
            writer.write(Integer.toString(charac.getHardness()) + v + Integer.toString(charac.getInefficenza()) + v);
            writer.write(Integer.toString(charac.getMalFunzionamentoStrumento()) + v + Integer.toString(charac.getnAnnotazioni()) + v);
            writer.write(Integer.toString(charac.getnGadget()) + v + charac.getTypeCharc()+ v + GameManager.getTurno());
            writer.newLine();
            
            
            //SAVE lista eventi
            for (String x : list) {
                writer.write(String.join(v, x));
                writer.newLine();
            }
            
        } catch (IOException e) {
e.printStackTrace();
        }
    }
    static void letturaCSV(){
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathCSV))) {
            String linea;
        if ((linea = reader.readLine()) != null) {
                String[] parti = linea.split(";");
                

                
                GameManager.getCharScelto().setHardness(Integer.parseInt(parti[0]));   
                GameManager.getCharScelto().setInefficenza(Integer.parseInt(parti[1]));
                GameManager.getCharScelto().setMalFunzionamentoStrumento(Integer.parseInt(parti[2]));
                GameManager.getCharScelto().setnAnnotazioni(Integer.parseInt(parti[3]));
                GameManager.getCharScelto().setnGadget(Integer.parseInt(parti[4]));
                GameManager.getCharScelto().setTipoPersonaggio(GameManager.rilevaTipoPersonaggio(parti[5]));
                GameManager.setTurno(Integer.parseInt(parti[6]));
                GameManager.getListaEventixConsole().clear();
                while ((linea = reader.readLine()) != null) {
                GameManager.getListaEventixConsole().add(linea); 
            }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
         
    }
}
