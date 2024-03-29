package Health;

import Health.Employee.Employee;
import Health.Role.SystemAdminRole;
import Health.UserAccount.UserAccount;

/**
 *
 * @author vivekhanagoji
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("Quest", "quest", employee, new SystemAdminRole());
        
        return system;
    }
    
}
