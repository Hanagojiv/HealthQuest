/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.BioTechnology;


import Health.Chemical.ChemicalList;
import Health.Gene.GeneHistory;

/**
 *
 * @author vivekhanagoji
 */
public class BioTechnology {
   
    private int BioTechnologyId;
    private String BioTechnologyName;
    private ChemicalList chemicalList;
    private GeneHistory geneHistory;
    private static int counter=0;
    
    public BioTechnology(){
        chemicalList = new ChemicalList();
        geneHistory = new GeneHistory();
        BioTechnologyId = counter;
        ++counter;
         
    }

    public int getBioTechnologyId() {
        return BioTechnologyId;
    }
    
    public String getBioTechnologyName() {
        return BioTechnologyName;
    }

    public void setBioTechnologyName(String BioTechnologyName) {
        this.BioTechnologyName = BioTechnologyName;
    }

    public ChemicalList getChemicalList() {
        return chemicalList;
    }

    public void setChemicalList(ChemicalList chemicalList) {
        this.chemicalList = chemicalList;
    }

    public GeneHistory getGeneHistory() {
        return geneHistory;
    }

    public void setGeneHistory(GeneHistory geneHistory) {
        this.geneHistory = geneHistory;
    }
    
    
    
    @Override
     public String toString(){
       return this.BioTechnologyName;
        }  
    
}
