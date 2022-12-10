/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Health.Organization;

import Health.MedicalInventory.MedicalInventory;
import Health.Role.Role;
import Health.Role.MedicalRole;
import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class MedicamentOrganization extends Organization{
    
    private ArrayList<MedicalInventory> medList;
    public MedicamentOrganization() {
     
       super(Organization.Type.medicament.getValue());
        medList=new ArrayList<MedicalInventory>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalRole());
        return roles;
    }

    public ArrayList<MedicalInventory> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<MedicalInventory> medList) {
        this.medList = medList;
    }
    
     public void addMedicine(MedicalInventory mi)
    {
       
        medList.add(mi);
        
    }
    
}
