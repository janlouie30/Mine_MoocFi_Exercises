public class Archives {

    private String name;
    private String id;

    public Archives(String name, String identifier) {
        this.name = name;
        this.id = identifier;
    }

    public String getID() {
        return this.id;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archives)) {
            return false;
        }

        Archives comparedArchive = (Archives) compared;
        if (this.id.equals(comparedArchive.id)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.name;
    }
}
