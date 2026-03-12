/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gdr;

/**
 *
 * @author mirica.daniel
 */
public class Character {
    private int hardness= 100;
    private int inefficenza = 0;
    private int malFunzionamentoStrumento =0;
    private int nGadget=0;
    private int nAnnotazioni=0;
    private typeCharacter tipoPersonaggio;
    private typeGadget tipoGadget;

    public Character(typeCharacter tipoPersonaggio) {
        this.tipoPersonaggio = tipoPersonaggio;
        
        if(this.tipoPersonaggio==typeCharacter.Chitarrista){
            this.hardness+=10;
            this.tipoGadget = typeGadget.plettro;
        }
        else if(this.tipoPersonaggio==typeCharacter.Cantante){
            this.nAnnotazioni+=1;
            this.tipoGadget= typeGadget.tèCaldo; 
        }
        else if(this.tipoPersonaggio==typeCharacter.Batterista){
            this.nGadget+=1;
            this.tipoGadget= typeGadget.plettro;
        }
    }
    
    
    void useGadget(){
        
    }
    void useAnnotazione(){
        
    }
    
}
