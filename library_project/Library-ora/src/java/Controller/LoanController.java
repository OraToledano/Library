import javax.persistence.*;
import java.util.List;
import Entity.Customer;
import Entity.Item;
import Entity.Loan;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Entity.HibernateUtil;


public class LoanController {

    public void addLoan(Loan loan) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(loan);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void updateItemToBorrowed(int itemId) {
        System.err.println("in the ------------------------------------------------");
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            // Retrieve the item by ID
            Item item = (Item) session.get(Item.class, itemId);
            if (item != null) {
                item.setBorrowed(true); 
                session.update(item);
                transaction.commit();
            } else {
                System.out.println("Item not found with ID: " + itemId);
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
  
public void updateItemToReturned(int itemId) {
    Transaction transaction = null;
    Session session = null;
    try {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();

        // Retrieve the item by ID
        Item item = (Item) session.get(Item.class, itemId);
        if (item != null) {
            item.setBorrowed(false); 
            session.update(item);
            transaction.commit();
        } else {
            System.out.println("Item not found with ID: " + itemId);
        }
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    } finally {
        if (session != null) {
            session.close();
        }
    }
}

}

