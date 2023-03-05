/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class DrugCatalog {
    
private ArrayList<Medicine> drugList;


    public DrugCatalog(){
    this.drugList = new ArrayList<Medicine>();
}
    public ArrayList<Medicine> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Medicine> drugList) {
        this.drugList = drugList;
    }

    public Medicine addDrugs(Medicine d) {
       // Drug d = new Drug();
        drugList.add(d);
        return d;
        
    }
    public void removeDrug(Medicine d)
    {
        drugList.remove(d);
    }
    
     
}
