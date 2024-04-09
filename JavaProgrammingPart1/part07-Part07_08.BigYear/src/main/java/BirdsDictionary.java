public class BirdsDictionary {
    private String name;
    private String latinName;
    private int numberOfObservation;

    public BirdsDictionary() {
    }

    public BirdsDictionary(String inputName, String inputLatinName, int numbers) {
        name = inputName;
        latinName = inputLatinName;
        numberOfObservation = numbers;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return numberOfObservation;
    }

    public int setObservations() {
        return numberOfObservation++;
    }

    public String toString() {
        return name + " (" + latinName + "): " + numberOfObservation + " observations";
    }

}