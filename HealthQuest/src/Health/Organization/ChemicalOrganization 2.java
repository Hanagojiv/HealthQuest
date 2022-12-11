/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.ChemicalInventory.ChemicalCompound;
import Health.MedicalInventory.MedicalInventory;
import Health.Role.ChemicalRole;

import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class ChemicalOrganization extends Organization{
    
    
     public ChemicalOrganization() {
        super(Organization.Type.Chemical.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ChemicalRole());
        return roles;
    }

    
}
