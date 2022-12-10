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
import Health.Organization.PharmacyOrganization;
import Health.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmacyRole.PharmacyWorkArea;

/**
 *
 * @author vivekhanagoji
 */
public class PharmacyRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Location network) {
       return new PharmacyWorkArea(userProcessContainer, account, (PharmacyOrganization)organization,enterprise,network);
       //return new PharmaManagementJPanel();
    }
}
