package GUIStuff.TheDebugGarage.model.abstracts;

import GUIStuff.TheDebugGarage.enums.Brand;
import GUIStuff.TheDebugGarage.enums.FuelType;
import GUIStuff.TheDebugGarage.enums.GearType;
import GUIStuff.TheDebugGarage.model.Customer;
import java.awt.Color;
import java.time.LocalDate;

/**
 *
 * @author besic
 */
public abstract class Vehicle {

    public String licensePlate;
    public Color color;
    public Brand brand;
    public String model;
    public Double price;
    public Integer kmRange;
    public LocalDate carBuildDate;
    public GearType gearType;
    public Customer owner;
    public FuelType fuelType;

    public Vehicle(String licensePlate, Color color, Brand brand,
            String model, Double price, Integer kmRange,
            LocalDate carBuildDate, GearType gearType,
            Customer owner, FuelType fuelType) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.kmRange = kmRange;
        this.carBuildDate = carBuildDate;
        this.gearType = gearType;
        this.owner = owner;
        this.fuelType = fuelType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getKmRange() {
        return kmRange;
    }

    public void setKmRange(Integer kmRange) {
        this.kmRange = kmRange;
    }

    public LocalDate getCarBuildDate() {
        return carBuildDate;
    }

    public void setCarBuildDate(LocalDate carBuildDate) {
        this.carBuildDate = carBuildDate;
    }

    public GearType getGearType() {
        return gearType;
    }

    public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "\nVehicle: " + getClass().getSimpleName() + "{"
                + "licensePlate=" + licensePlate + ", color=" + color
                + ", brand=" + brand + ", model=" + model + ", price="
                + price + ", kmRange=" + kmRange + ", carBuildDate="
                + carBuildDate + ", gearType=" + gearType + ", owner="
                + owner + ", fuelType=" + fuelType + '}';
    }

}
