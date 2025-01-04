package GUIStuff.TheDebugGarage.model;

import GUIStuff.TheDebugGarage.model.abstracts.Person;
import java.time.LocalDate;

/**
 *
 * @author besic
 */
public class Customer extends Person {

    public Customer(String firstName, String lastName, String matriculeNumber,
            LocalDate birthDate, InvoiceAddress invoiceAddress,
            ShippingAddress shippingAddress) {
        super(firstName, lastName, matriculeNumber, birthDate,
                invoiceAddress,
                shippingAddress);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
