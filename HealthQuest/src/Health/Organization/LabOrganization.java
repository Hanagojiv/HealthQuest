/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Role.LabRole;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class LabOrganization extends Organization{

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabRole());
        return roles;
    }
     
   
    
    
}
