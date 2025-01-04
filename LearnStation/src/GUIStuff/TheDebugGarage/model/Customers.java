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

    public Object[] getAllMatricules() {
        ArrayList<String> alMatricules = new ArrayList<>();

        alCustomers.forEach((customer) -> {
            alMatricules.add(customer.getMatriculeNumber());
        });

        return alMatricules.toArray();

        /* return alCustomers.stream().map(Customer::getMatriculeNumber).
          toArray(String[]::new); */
    }

    public Customer getCustomerByMatricule(String matricule) {
        for (Customer customer : alCustomers) {
            if (customer.getMatriculeNumber().equals(matricule)) {
                return customer;
            }
        }
        return null;
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
