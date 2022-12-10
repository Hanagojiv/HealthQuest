/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.UserAccount;

import Health.Employee.Employee;

import Health.WorkQueue.WorkQueue;

/**
 *
 * @author vivekhanagoji
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
 
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}