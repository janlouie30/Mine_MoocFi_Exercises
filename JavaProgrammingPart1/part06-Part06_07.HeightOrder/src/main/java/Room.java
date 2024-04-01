import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        return room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person returnPerson = this.room.get(0);
        int shortest = returnPerson.getHeight();

        for (int x = 0; x < this.room.size(); x++) {
            if (this.room.get(x).getHeight() < shortest) {
                shortest = this.room.get(x).getHeight();
                returnPerson = this.room.get(x);
            }
        }

        return returnPerson;
    }

    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person returnPerson = this.room.get(0);
        int shortest = returnPerson.getHeight();

        for (int x = 0; x < this.room.size(); x++) {
            if (this.room.get(x).getHeight() < shortest) {
                shortest = this.room.get(x).getHeight();
                returnPerson = this.room.get(x);
            }
        }

        this.room.remove(returnPerson);
        return returnPerson;
    }
}
