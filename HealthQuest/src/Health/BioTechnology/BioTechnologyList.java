/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.BioTechnology;


import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class BioTechnologyList {
    
    private ArrayList<BioTechnology> BioTechnologyList;

    public BioTechnologyList() {
        this.BioTechnologyList = new ArrayList<BioTechnology>();
    }

    public ArrayList<BioTechnology> getBioTechnologyList() {
        return BioTechnologyList;
    }

    public void setBioTechnologyList(ArrayList<BioTechnology> BioTechnologyList) {
        this.BioTechnologyList = BioTechnologyList;
    }
    
     public BioTechnology addBioTechnologyList()
   {
       BioTechnology BioTechnology = new BioTechnology();
       BioTechnologyList.add(BioTechnology);
       return BioTechnology;
       
   }
    
}
