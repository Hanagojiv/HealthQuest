/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Health.Role;

import Health.EcoSystem;
import Health.Enterprise.Enterprise;
import Health.Location.Location;
import Health.Organization.MedicamentOrganization;
import Health.Organization.Organization;
import Health.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.MedicamentRole.MedicamentWorkArea;

/**
 *
 * @author vivekhanagoji
 */
public class MedicalRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Location network) {
       return new MedicamentWorkArea(userProcessContainer, account, (MedicamentOrganization)organization,enterprise,network);
       //return new medicamentManagementJPanel();
    }
    
}
