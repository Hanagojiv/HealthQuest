/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Health.Role;

import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Location.Location;
import Health.Organization.Organization;
import Health.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.BioTechnologySupplier.BioTechnologySupplierWorkArea;

/**
 *
 * @author vivekhanagoji
 */
public class BioTechnologyRole extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Location network) {
       return new BioTechnologySupplierWorkArea(userProcessContainer,business,account,organization,enterprise,network);
    }
    
}
