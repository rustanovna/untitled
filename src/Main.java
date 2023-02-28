public class Main {
    public static void main(String[] args) {
        Person person=new Person("Covetckaya","Eldar",15);
        Person person1=new Person("Axunbaeva","Jazira",17);
        Person person2=new Person("KOK-JAR","Asema",15);

        Person[]persons3={person,person1,person2};
        Person[]family2={person,person1,person2};

        Apartment apartment=new Apartment();

        Family family1=new Family("Covetskaya");
        System.out.println("Family1 живет "+family1.schetchik()+"человек");

    }
}