package GUIStuff.TheDebugGarage.model;

import GUIStuff.TheDebugGarage.model.abstracts.Address;

/**
 *
 * @author besic
 */
public class ShippingAddress extends Address {

    public ShippingAddress(String postalCode, String streetNr,
            String street, String city, String country) {
        super(postalCode, streetNr, street, city, country);
    }
}
