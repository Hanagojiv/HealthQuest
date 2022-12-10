/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Doctor.Prescription;
import Health.Role.DoctorRole;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class DoctorOrganization extends Organization{
    private ArrayList<Prescription> prescriptionlist;

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
     
        prescriptionlist=new ArrayList<Prescription>();
    }

    public ArrayList<Prescription> getPrescriptionlist() {
        return prescriptionlist;
    }

    public void setPrescriptionlist(ArrayList<Prescription> prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
    public void addPrescription(Prescription prescription){
        
         prescriptionlist.add(prescription);
         
        
    }
     
}