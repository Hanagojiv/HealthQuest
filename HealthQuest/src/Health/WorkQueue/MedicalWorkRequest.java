/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Health.WorkQueue;

import java.util.Date;

/**
 *
 * @author vivekhanagoji
 */
public class MedicalWorkRequest extends WorkRequest{
    
    private String medicationName;
    private int Quantity;
    private Date requestDate;
    private String status;
    private String supplierName;
    private  String patientName;
    private String network;
    
    
    
    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

   

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return this.medicationName;
    }
    
    
    
}
