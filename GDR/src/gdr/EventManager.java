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
    ArrayList<Evento> listEventi = new ArrayList<>();
    
    public EventManager()
    {
        this.listEventi.add(new Evento(1, Eventi.AnnotazioneTrovata));
        this.listEventi.add(new Evento(1, Eventi.GadgetTrovato));
        this.listEventi.add(new Evento(-10, Eventi.ImpiantoBruciato));
        this.listEventi.add(new Evento(-20, Eventi.RitrovamentoLetturaSpartito));
        
    }
}
