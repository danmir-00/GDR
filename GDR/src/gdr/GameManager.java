/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mirica.daniel
 */
public class GameManager {
    static int turno=10;
    int turnoAttuale=turno;
     private ArrayList<Character> listPossibleCharac = new ArrayList();
    private static Character charScelto;
    
    void svolgiEvento(){
        //DA FARE
    }
    Evento generaEvento(){
        
        Random rnd = new Random();
        int x = rnd.nextInt(0,EventManager.getListEventi().size());
       Evento e= EventManager.getListEventi().get(x);
        
        return e;
    }

    static public Character getCharScelto() {
        return charScelto;
    }
    
}
