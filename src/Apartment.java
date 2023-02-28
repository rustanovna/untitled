public class Apartment extends Home implements ComPlatejy{
    public Apartment(int etag, Person[] persons, int nomberKomnat) {
        super(etag, persons, nomberKomnat);
    }

    public Apartment() {
        super();
    }

    @Override
    public void platej() {
        System.out.println(" в месяц:5000");
    }
}


