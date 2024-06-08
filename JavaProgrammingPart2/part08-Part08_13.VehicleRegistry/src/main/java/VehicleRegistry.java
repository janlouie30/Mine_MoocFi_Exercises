import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> ownersPlate;

    public VehicleRegistry() {
        ownersPlate = new HashMap<>();
    }

    public boolean add(LicensePlate licencePlate, String owner) {
        if (ownersPlate.containsKey(licencePlate)) {
            return false;
        }
        ownersPlate.put(licencePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return ownersPlate.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (ownersPlate.containsKey(licensePlate)) {
            ownersPlate.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : ownersPlate.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String x : ownersPlate.values()) {
            if (!owners.contains(x)) {
                System.out.println(x);
                owners.add(x);
            }
        }

    }
}
