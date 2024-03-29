/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.WorkQueue;

import Health.Disease.Disease;
import Health.Doctor.Patient;
import Health.Gene.Gene;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vivekhanagoji
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private Map<Disease,List<Gene>>diseaseListGenes;
    private String patientName;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Map<Disease, List<Gene>> getDiseaseListGenes() {
        return diseaseListGenes;
    }

    public void setDiseaseListGenes(Map<Disease, List<Gene>> diseaseListGenes) {
        this.diseaseListGenes = diseaseListGenes;
    }

  

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
      @Override
     public String toString(){
       return this.patientName;
        }  
    
    
}
