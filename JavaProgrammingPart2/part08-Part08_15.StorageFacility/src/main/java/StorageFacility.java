import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        facility.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> list = facility.get(unit);
        list.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (facility.containsKey(storageUnit)) {
            return facility.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        if (facility.get(storageUnit).size() == 1) {
            facility.remove(storageUnit);
        } else {
            facility.get(storageUnit).remove(item);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>(facility.keySet()); // Making the keysey into a list
        return list;
    }

}
