/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.ArrayList;

/**
 *
 * @author rohan
 */
public class VitalsSignHistory {
    private ArrayList <VitalSigns> history;
    
    public VitalsSignHistory(){
        this.history=new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
     public VitalSigns addVitals(){
         VitalSigns newVital = new VitalSigns();
         history.add(newVital);
         return newVital;
     }

    public void deleteVitals(VitalSigns vs) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        history.remove(vs);
        
        
        
    }
    
    
    
    
}
