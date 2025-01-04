package GUIStuff.TheDebugGarage.model.abstracts;

import GUIStuff.TheDebugGarage.model.InvoiceAddress;
import GUIStuff.TheDebugGarage.model.ShippingAddress;
import java.time.LocalDate;

/**
 *
 * @author besic
 */
public abstract class Person {

    public String firstName;
    public String lastName;
    public String matriculeNumber;
    public LocalDate birthDate;
    public InvoiceAddress invoiceAddress;
    public ShippingAddress shippingAddress;

    public Person(String firstName, String lastName, String matriculeNumber,
            LocalDate birthDate, InvoiceAddress invoiceAddress,
            ShippingAddress shippingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matriculeNumber = matriculeNumber;
        this.birthDate = birthDate;
        this.invoiceAddress = invoiceAddress;
        this.shippingAddress = shippingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMatriculeNumber() {
        return matriculeNumber;
    }

    public void setMatriculeNumber(String matriculeNumber) {
        this.matriculeNumber = matriculeNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public InvoiceAddress getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(InvoiceAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "\nPerson: " + getClass().getSimpleName() + "{" + "firstName="
                + firstName + ", lastName=" + lastName + ", matriculeNumber="
                + matriculeNumber + ", birthDate=" + birthDate
                + ", invoiceAddress=" + invoiceAddress
                + ", shippingAddress=" + shippingAddress + '}';
    }

}
