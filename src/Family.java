import java.util.Arrays;

public class Family {
    private String addres;
    private Person[]persons;
    private Apartment apartment;
    private Hotel hotel;
    private Hostel hostel;


    public Family(String addres) {
        this.addres = addres;
    }

    public String getAddres() {
        return addres;
    }

    public Person[] getPersons() {
        return persons;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }
     public int schetchik(){
        int count=0;
         for (int i = 0; i < persons.length; i++) {
             count++;
         }
         return count;
     }



    }

