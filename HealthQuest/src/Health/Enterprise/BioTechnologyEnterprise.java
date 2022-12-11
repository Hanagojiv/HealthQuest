/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Health.Enterprise;

import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class BioTechnologyEnterprise extends Enterprise {
    
      public BioTechnologyEnterprise(String name){
        super(name,Enterprise.EnterpriseType.BioTechnology);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
