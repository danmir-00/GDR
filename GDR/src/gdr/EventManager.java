/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr;

import java.util.ArrayList;

/**
 *
 * @author mirica.daniel
 */
public class EventManager {
    private static ArrayList<Evento> listEventi = new ArrayList<>();
    
    public  EventManager()
    {
        listEventi.add(new Evento(1, typeEventi.AnnotazioneTrovata));
        listEventi.add(new Evento(1, typeEventi.GadgetTrovato));
        listEventi.add(new Evento(-10, typeEventi.ImpiantoBruciato));
        listEventi.add(new Evento(-20, typeEventi.RitrovamentoLetturaSpartito));
        
    }

    public static ArrayList<Evento> getListEventi() {
        return listEventi;
    }
    
}
