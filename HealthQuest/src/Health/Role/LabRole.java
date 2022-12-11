/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Role;

import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Location.Location;
import Health.Organization.LabOrganization;
import Health.Organization.Organization;
import Health.UserAccount.UserAccount;
import UI.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vivekhanagoji
 */
public class LabRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Location network) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer,account,(LabOrganization)organization,enterprise,business,network);
    }
    
}
