/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr;

/**
 *
 * @author mirica.daniel
 */
public class Evento {
    private int lifeValueToEdit;
    private int secndValuetoEdit;
    private typeEventi typeEvent;

    public Evento(int valueToEdit, typeEventi typeEvent) {
        this.lifeValueToEdit = valueToEdit;
        this.typeEvent = typeEvent;
    }

    public typeEventi getTypeEvent() {
        return typeEvent;
    }

    public Evento(int valueToEdit, typeEventi typeEvent, int secndValuetoEdit) {
        this.lifeValueToEdit = valueToEdit;
        this.secndValuetoEdit = secndValuetoEdit;
        this.typeEvent = typeEvent;
    }

    public int getLifeValueToEdit() {
        return lifeValueToEdit;
    }

    public int getSecndValuetoEdit() {
        return secndValuetoEdit;
    }
    
}
