/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Health.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Location.Location;
import Business.Organization.MedicamentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
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
