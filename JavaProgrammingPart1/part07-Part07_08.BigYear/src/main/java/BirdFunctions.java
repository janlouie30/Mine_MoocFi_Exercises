import java.util.ArrayList;

public class BirdFunctions {

    private ArrayList<BirdsDictionary> birdsDict;

    public BirdFunctions() {
        birdsDict = new ArrayList<>();
    }

    public void printAll() {
        for (BirdsDictionary currentBird : birdsDict) {
            System.out.println(currentBird);
        }
    }

    public void addTranslations(String inputName, String inputLatinName) {
        BirdsDictionary birds = new BirdsDictionary(inputName, inputLatinName, 0);
        birdsDict.add(birds);
    }

    public void birdsObs(String name) {
        boolean foundBird = false;
        for (BirdsDictionary currentBird : birdsDict) {
            if (currentBird.getName().equals(name)) {
                currentBird.setObservations();
                foundBird = true;
            }
        }

        if (!foundBird) {
            System.out.println("Not a bird!");
        }
    }

    public void printOne(String name) {
        for (BirdsDictionary currentBird : birdsDict) {
            if (currentBird.getName().equals(name)) {
                System.out.println(currentBird);
            }
        }
    }

}
