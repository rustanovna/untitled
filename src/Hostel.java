public class Hostel extends Home implements PlatejArendy{
    public Hostel(int etag, Person[] persons, int nomberKomnat) {
        super(etag, persons, nomberKomnat);
    }

    @Override
    public void plata() {
        System.out.println("В месяц:1000");
    }
}
