/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Health.WorkQueue;

import Health.BioTechnology.BioTechnology;
import Health.Chemical.Chemical;
import Health.Doctor.Patient;
import Health.Gene.Gene;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vivekhanagoji
 */
public class BioTechnologyWorkRequest extends WorkRequest{
    
     private String BioTechnologyName;
    private int Quantity;
    private String deliveryTime;
    private Patient patient;
    private Map<Gene,Chemical>geneChemical;
    private Map<BioTechnology,List<Chemical>>BioTechnologyChemical;
   
    
   
   
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getBioTechnologyName() {
        return BioTechnologyName;
    }

    public void setBioTechnologyName(String BioTechnologyName) {
        this.BioTechnologyName = BioTechnologyName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Map<Gene, Chemical> getGeneChemical() {
        return geneChemical;
    }

    public void setGeneChemical(Map<Gene, Chemical> geneChemical) {
        this.geneChemical = geneChemical;
    }

    public Map<BioTechnology, List<Chemical>> getBioTechnologyChemical() {
        return BioTechnologyChemical;
    }

    public void setBioTechnologyChemical(Map<BioTechnology, List<Chemical>> BioTechnologyChemical) {
        this.BioTechnologyChemical = BioTechnologyChemical;
    }

    
    @Override
     public String toString(){
       return this.BioTechnologyName;
        }  
    

    
    
    
    
}
