/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Location.Location;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJpanel;


/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Location network) {
        return new AdminWorkAreaJpanel(userProcessContainer, enterprise);
    }

    
    
}
