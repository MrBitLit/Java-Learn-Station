package GUIStuff.TheDebugGarage.model;

import java.util.ArrayList;

/**
 *
 * @author besic
 */
public class Customers {
    private static ArrayList<Customer> alCustomers = new ArrayList<>();

    public int getCustomerListSize() {
        return alCustomers.size();
    }

    public Object[] toArray() {
        return alCustomers.toArray();
    }

    public Customer getCustomer(int index) {
        return alCustomers.get(index);
    }

    public boolean addCustomer(Customer c) {
        return alCustomers.add(c);
    }

    public Customer removeCustomer(int index) {
        return alCustomers.remove(index);
    }

    public void clearCustomers() {
        alCustomers.clear();
    }

    @Override
    public String toString() {
        return alCustomers.toString();
    }
}
