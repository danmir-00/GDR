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
    private static int turno=10;
    
    private static int inefficenzaMAX=35;
    private static int malFunzionamentoStrumentoMAX=35;
    private static Character charScelto;
    
    static void  svolgiEvento(Evento e){
        if (e.getTypeEvent().equals(typeEventi.AnnotazioneTrovata)){
            charScelto.setnAnnotazioni(charScelto.getnAnnotazioni()+e.getLifeValueToEdit()); 
        }
        else if(e.getTypeEvent().equals(typeEventi.GadgetTrovato)){
         charScelto.setnGadget(charScelto.getnGadget() + e.getLifeValueToEdit());
        }
        else if(e.getTypeEvent().equals(typeEventi.ImpiantoBruciato)){
            charScelto.setHardness(charScelto.getHardness()+e.getLifeValueToEdit());
            charScelto.setMalFunzionamentoStrumento(charScelto.getMalFunzionamentoStrumento()+e.getSecndValuetoEdit());
        }
        else if(e.getTypeEvent().equals(typeEventi.RitrovamentoLetturaSpartito)){
            charScelto.setHardness(charScelto.getHardness()+e.getLifeValueToEdit());
            charScelto.setInefficenza(charScelto.getInefficenza()+ e.getSecndValuetoEdit());
        }
        else if(e.getTypeEvent().equals(typeEventi.dataAnnullata)){
            charScelto.setHardness(charScelto.getHardness()+e.getLifeValueToEdit());
        }
    }
    static Evento generaEvento(){
        
        Random rnd = new Random();
        int x = rnd.nextInt(0,EventManager.getListEventi().size());
       Evento e= EventManager.getListEventi().get(x);
        
        return e;
    }
    static typeCharacter rilevaTipoPersonaggio (String selezione){
        if(typeCharacter.Batterista.name().equals(selezione)){
            return typeCharacter.Batterista;
        }
        else if (typeCharacter.Cantante.name().equals(selezione)){
            return typeCharacter.Cantante;
        }
        else if(typeCharacter.Chitarrista.name().equals(selezione)){
           return typeCharacter.Chitarrista; 
        }
        return null;
    }
    
    
    
    
        
    public void setCharScelto(typeCharacter x) {
        charScelto.initCharacterFromType(x);
    }
    
//    public static void setCharScelto(Character charScelto) {
//        GameManager.charScelto = charScelto;
//    }
    
    
    static public Character getCharScelto() {
        return charScelto;
    }

    public static int getInefficenzaMAX() {
        return inefficenzaMAX;
    }

    public static int getMalFunzionamentoStrumento() {
        return malFunzionamentoStrumentoMAX;
    }
    
}
