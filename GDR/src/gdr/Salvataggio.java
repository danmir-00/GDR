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
    private Character charac = GameManager.getCharScelto();
    private ArrayList<String> listaEventixConsole = new ArrayList<>();
    private String filePathCSV;
    void addEventToList(String x){
        this.listaEventixConsole.add(x);
    }
    //SPOSTARE METODI IN FILEMANAGER
}
