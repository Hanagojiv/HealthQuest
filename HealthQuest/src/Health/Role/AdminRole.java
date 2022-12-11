/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Role;

import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Location.Location;
import Health.Organization.Organization;
import Health.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.AdministrativeRole.AdminWorkAreaJpanel;


/**
 *
 * @author vivekhanagoji
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Location network) {
        return new AdminWorkAreaJpanel(userProcessContainer, enterprise);
    }

    
    
}
