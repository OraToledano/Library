package Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import Entity.Customer;
import Entity.Item;

@Entity
public class Loan {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String loanMonth;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "loan_id")
    private List<Item> items = new ArrayList<>(3);


    public Loan() {
        // Default constructor
    }

    public Loan(String loanMonth, Customer customer) {
        this.loanMonth = loanMonth;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoanMonth() {
        return loanMonth;
    }

    public void setLoanMonth(String loanMonth) {
        this.loanMonth = loanMonth;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", loanMonth='" + loanMonth + '\'' +
                ", customer=" + customer +
                ", items=" + items +
             
                '}';
    }
}

