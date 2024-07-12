package Entity;

import Controller.CustommerController;
import Controller.ItemController;

public class Main {
    public static void main(String[] args) {
        CustommerController controller = new CustommerController();
        ItemController i=new ItemController();
        System.err.println("hiiiiiiiiiiii%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Item it=new Item();
        
        Customer c = new Customer();
        
        controller.addCustomer(c);
        i.addItem(it);
    }
}
