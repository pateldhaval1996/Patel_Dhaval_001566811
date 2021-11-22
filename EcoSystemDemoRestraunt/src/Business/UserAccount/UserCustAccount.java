/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Customer.Customer;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserCustAccount {
    
    private String username;
    private String password;
    //private Employee employee;
    private Customer customer;
    private String order;
    private Role role;
    private WorkQueue workQueue;

    public UserCustAccount() {
        workQueue = new WorkQueue();
    }
    
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
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

    public Role getRole() {
        return role;
    }

    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
    public Customer getCustomer() {
        return customer;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}