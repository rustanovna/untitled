public class Hotel extends Home implements PlatejArendy{
    public Hotel(int etag, Person[] persons, int nomberKomnat) {
        super(etag, persons, nomberKomnat);
    }

    @Override
    public void plata() {
        System.out.println("В месяц:10000");
    }
}
