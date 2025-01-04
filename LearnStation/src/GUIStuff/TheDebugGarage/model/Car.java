package GUIStuff.TheDebugGarage.model;

import GUIStuff.TheDebugGarage.enums.FuelType;
import GUIStuff.TheDebugGarage.enums.GearType;
import GUIStuff.TheDebugGarage.model.abstracts.Vehicle;
import java.awt.Color;
import java.time.LocalDate;

/**
 *
 * @author besic
 */
public class Car extends Vehicle {

    public Car(String licensePlate, Color color, String brand,
            String model, Double price, Integer kmRange,
            LocalDate carBuildDate, GearType gearType,
            Customer owner, FuelType fuelType) {
        super(licensePlate, color, brand, model, price, kmRange,
                carBuildDate, gearType, owner, fuelType);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
