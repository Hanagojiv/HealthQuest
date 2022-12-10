/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Role;

import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Location.Location;

import Health.Organization.Organization;
import Health.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DrugSupplier.DrugSupplierWorkArea;


/**
 *
 * @author vivekhanagoji
 */
public class DrugRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Location network) {
       return new DrugSupplierWorkArea(userProcessContainer,business,account,organization,enterprise,network);
    }
    
}    
