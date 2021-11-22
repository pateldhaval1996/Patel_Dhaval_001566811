/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Customer.Customer;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dhaval
 */
public class UserCustAccountDirectory {
    
    private ArrayList<UserCustAccount> userAccountList;

    public UserCustAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserCustAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserCustAccount authenticateUser(String username, String password){
        for (UserCustAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    
    public UserCustAccount createCustAccount(String username, String password, Customer customer, String order){
        UserCustAccount userAccount = new UserCustAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCustomer(customer);
        userAccount.setOrder(order);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserCustAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }


}
