package GUIStuff.TheDebugGarage.model.abstracts;

/**
 *
 * @author besic
 */
public abstract class Address {
    public String postalCode;
    public String streetNr;
    public String street;
    public String city;
    public String country;

    public Address(String postalCode, String streetNr, String street, 
            String city, String country) {
        this.postalCode = postalCode;
        this.streetNr = streetNr;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
