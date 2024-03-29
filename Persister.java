package OOP6;

public class Persister implements IPersister {

    private Persistable persistable;

    public Persister(Persistable persistable) {
        this.persistable = persistable;
    }

    @Override
    public String save() {
        return "Save persistable: " + persistable.save();
    }
}