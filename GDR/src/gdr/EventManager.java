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
        listEventi.add(new Evento(-10, typeEventi.ImpiantoBruciato, +7));
        listEventi.add(new Evento(-20, typeEventi.RitrovamentoLetturaSpartito, 5));
        listEventi.add(new Evento(-15,typeEventi.dataAnnullata));
        
    }

    public static ArrayList<Evento> getListEventi() {
        return listEventi;
    }
    String text4Event(Evento e){
        String text="";
        if(e.getTypeEvent().equals(typeEventi.AnnotazioneTrovata)){
            text="Hai trovato un'annotazione da aggiungere all'inventario durante il concerto!";
        }
        else if(e.getTypeEvent().equals(typeEventi.GadgetTrovato)){
            text="Hai trovato un gadget da aggiungere all'inventario durante il concerto!";  
        }
        else if(e.getTypeEvent().equals(typeEventi.ImpiantoBruciato)){
            text="NOOOOOO l'impianto si è bruciato durante il concerto. L'hardness è scesa di "+Integer.toString(e.getFirstValuteToEdit())  + " e ti ha peggiorato lo strumento di "+Integer.toString(e.getSecndValuetoEdit()) ;
        }
        else if(e.getTypeEvent().equals(typeEventi.RitrovamentoLetturaSpartito)){
           text="NOOOOOO hai ritrovato uno spartito, non lo sai leggere. L'hardness è scesa di "+Integer.toString(e.getFirstValuteToEdit())  + " e ti ha reso più inefficente di "+Integer.toString(e.getSecndValuetoEdit()) ; 
        }
        else if(e.getTypeEvent().equals(typeEventi.dataAnnullata)){
            text="Ti hanno annullato la data.    L'hardness è scesa di "+Integer.toString(e.getFirstValuteToEdit());
        }
        return text;
    }
}
