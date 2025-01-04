package GUIStuff.TheDebugGarage.model;

import GUIStuff.TheDebugGarage.model.abstracts.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author besic
 */
public class Vehicles {
    private static ArrayList<Vehicle> alVehicles = new ArrayList<>();

    public int getVehicleListSize() {
        return alVehicles.size();
    }

    public Object[] toArray() {
        return alVehicles.toArray();
    }

    public Vehicle getVehicle(int index) {
        return alVehicles.get(index);
    }

    public boolean addVehicle(Vehicle e) {
        return alVehicles.add(e);
    }

    public Vehicle removeVehicle(int index) {
        return alVehicles.remove(index);
    }

    public void clearVehicles() {
        alVehicles.clear();
    }

    @Override
    public String toString() {
        return alVehicles.toString();
    }

}
