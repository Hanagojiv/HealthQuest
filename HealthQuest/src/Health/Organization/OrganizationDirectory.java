/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Organization.Organization.Type;
import java.util.ArrayList;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        return organization;
    }
}