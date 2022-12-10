/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Health.Organization;

import Health.ChemicalInventory.ChemicalCompound;
import Health.Role.BioTechnologyRole;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class BioTechnologyOrganization extends Organization {
    
    
    private ArrayList<ChemicalCompound> chemList;

    public BioTechnologyOrganization() {
        
        super(Organization.Type.BioTechnology.getValue());
        chemList =  new ArrayList<ChemicalCompound>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BioTechnologyRole());
        return roles;
    }

    
    public ArrayList<ChemicalCompound> getChemList() {
        return chemList;
    }

    public void setChemList(ArrayList<ChemicalCompound> chemList) {
        this.chemList = chemList;
    }

    
    
    public void addChemical(ChemicalCompound cdi)
    {
       
        chemList.add(cdi);
        
    }
    
}
