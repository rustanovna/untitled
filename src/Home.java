import java.util.Arrays;

public class Home {
    private int etag;
    private Person[]persons;
    private int nomberKomnat;

    public Home(int etag, Person[] persons, int nomberKomnat) {
        this.etag = etag;
        this.persons = persons;
        this.nomberKomnat = nomberKomnat;
    }

    public Home() {

    }

    public int getEtag() {
        return etag;
    }

    public void setEtag(int etag) {
        this.etag = etag;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public int getNomberKomnat() {
        return nomberKomnat;
    }

    public void setNomberKomnat(int nomberKomnat) {
        this.nomberKomnat = nomberKomnat;
    }

    @Override
    public String toString() {
        return "Home{" +
                "etag=" + etag +
                ", persons=" + Arrays.toString(persons) +
                ", nomberKomnat=" + nomberKomnat +
                '}';
    }
}
