/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.Session;
import org.hibernate.annotations.NaturalId;

/**
 *
 * @author The user
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;
    private String firstName;
    private String lastName;
    @NaturalId
    private String userName;
    private String password;

    public Customer(String address, String fname, String lname, String userName, String password) {
        this.address = address;
        this.firstName = fname;
        this.lastName = lname;
        this.userName = userName;
        this.password = password;
    }
    public Customer(){
         this.address = "";
        this.firstName = "Jhon";
        this.lastName = "Doe";
        this.userName = "Jhon";
        this.password = "123";
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }
    public String toString()
    {
        return this.firstName+" "+this.lastName+" "+this.address;
    }
    public static List<Customer> gettAll(){
     List<Customer> list = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            list = session.createCriteria(Customer.class).list();
            System.out.println("The updates went well!!");
            session.close();
        } catch (Exception ex) {
            System.out.println("An error occurred");
        }

        return list;   
    }

}
