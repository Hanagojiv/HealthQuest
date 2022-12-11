/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health;

import Health.Chemical.ChemicalList;
import Health.ChemicalInventory.ChemicalCompound;
import Health.BioTechnology.BioTechnologyList;
import Health.Gene.GeneHistory;
import Health.Location.Location;
import Health.Organization.Organization;
import Health.Role.Role;
import Health.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Location> networkList;
    private ChemicalList chemicalList;
    private BioTechnologyList BioTechnologyList;
    private GeneHistory geneList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Location createAndAddNetwork(){
        Location network=new Location();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Location>();
        BioTechnologyList = new BioTechnologyList();
        chemicalList = new ChemicalList();
        geneList = new GeneHistory();
    }

    public ArrayList<Location> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Location> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Location network:networkList){
            
        }
        return true;
    }
    
    public BioTechnologyList getBioTechnologyList() {
        return BioTechnologyList;
    }

    public void setBioTechnologyList(BioTechnologyList BioTechnologyList) {
        this.BioTechnologyList = BioTechnologyList;
    }

    public ChemicalList getChemicalList() {
        return chemicalList;
    }

    public void setChemicalList(ChemicalList chemicalList) {
        this.chemicalList = chemicalList;
    }
    

    public GeneHistory getGeneList() {
        return geneList;
    }

    public void setGeneList(GeneHistory geneList) {
        this.geneList = geneList;
    }
    
  
    
   
}
