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
public class Salvataggio {
//    private Character charac = GameManager.getCharScelto();
    
    
    static void addEventToList(String x){
        GameManager.getListaEventixConsole().add(x);
    }
    void save(){
        FileManager.salvaCSV(GameManager.getCharScelto(), GameManager.getListaEventixConsole() );
        
    }
    
}
