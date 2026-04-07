/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mirica.daniel
 */
public class GameManager implements Serializable {
private static final long serialVersionUID = 1L;
    private static int turno = 10;

    private static int inefficenzaMAX = 35;
    private static int malFunzionamentoStrumentoMAX = 35;
    private static Character charScelto;
    private static ArrayList<String> listaEventixConsole = new ArrayList<>();

    static void svolgiEvento(Evento e) {

        if (e.getTypeEvent().equals(typeEventi.AnnotazioneTrovata)) {
            charScelto.setnAnnotazioni(charScelto.getnAnnotazioni() + e.getFirstValuteToEdit());
        } else if (e.getTypeEvent().equals(typeEventi.GadgetTrovato)) {
            charScelto.setnGadget(charScelto.getnGadget() + e.getFirstValuteToEdit());
        } else if (e.getTypeEvent().equals(typeEventi.ImpiantoBruciato)) {
            charScelto.setHardness(charScelto.getHardness() + e.getFirstValuteToEdit());
            charScelto.setMalFunzionamentoStrumento(charScelto.getMalFunzionamentoStrumento() + e.getSecndValuetoEdit());
        } else if (e.getTypeEvent().equals(typeEventi.RitrovamentoLetturaSpartito)) {
            charScelto.setHardness(charScelto.getHardness() + e.getFirstValuteToEdit());
            charScelto.setInefficenza(charScelto.getInefficenza() + e.getSecndValuetoEdit());
        } else if (e.getTypeEvent().equals(typeEventi.dataAnnullata)) {
            charScelto.setHardness(charScelto.getHardness() + e.getFirstValuteToEdit());
        }
    }

    static Evento generaEvento() {

        Random rnd = new Random();
        int x = rnd.nextInt(0, EventManager.getListEventi().size()-1);
        Evento e = EventManager.getListEventi().get(x);

        return e;
    }

    static typeCharacter rilevaTipoPersonaggio(String selezione) {
        if (typeCharacter.Batterista.name().equals(selezione)) {
            return typeCharacter.Batterista;
        } else if (typeCharacter.Cantante.name().equals(selezione)) {
            return typeCharacter.Cantante;
        } else if (typeCharacter.Chitarrista.name().equals(selezione)) {
            return typeCharacter.Chitarrista;
        }
        return null;
    }

    public static String unisciTextDaLista(ArrayList<String> list) {
        return String.join("\n\n", list);
    }

    public static void setCharScelto(typeCharacter x) {
        charScelto = new Character();
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

    public static int getTurno() {
        return turno;
    }

    public static void setTurno(int turno) {
        GameManager.turno = turno;
    }

    public static ArrayList<String> getListaEventixConsole() {
        return listaEventixConsole;
    }
    static String andamentoPartita(){
        String x="";
        if(charScelto.getHardness()<=0){
            x="dead";
        }
        else if(charScelto.getInefficenza()>=35){
            x="inefficente";
        }
        else if(charScelto.getMalFunzionamentoStrumento()>=35){
            x="malFunzionante";
            
        }
        else if(GameManager.turno==0){
            
        }
        
        return x;
    }

    public static void setCharScelto(Character charScelto) {
        GameManager.charScelto = charScelto;
    }

    public static void setListaEventixConsole(ArrayList<String> listaEventixConsole) {
        GameManager.listaEventixConsole = listaEventixConsole;
    }
    
}
