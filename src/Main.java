import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Guests adela = new Guests("Adéla Malíková",LocalDate.of(1993,3,13));
        Guests jan = new Guests("Jan Dvořáček",LocalDate.of(1995,5,5));

        Rooms room1 = new Rooms(1,1000,true,true,1);
        Rooms room2 = new Rooms(1,1000,true,true,2);
        Rooms room3 = new Rooms(1,2400,false,true,3);
//hosté výpis
        System.out.println(adela.getName()+" ("+adela.getDateOfBirth()+")");
        System.out.println(jan.getName()+" ("+jan.getDateOfBirth()+")");
//pokoje výpis
        System.out.println("Pokoj 1- Počet lůžek:"+room1.getNumberOfBeds()+" Cena:"+room1.getCost()+" Kč/noc"+" Výhled na moře:"+room1.isSea()+" Balkón:"+room1.isBalcony());
        System.out.println("Pokoj 2- Počet lůžek:"+room2.getNumberOfBeds()+" Cena:"+room2.getCost()+" Kč/noc"+" Výhled na moře:"+room2.isSea()+" Balkón:"+room2.isBalcony());
        System.out.println("Pokoj 3- Počet lůžek:"+room3.getNumberOfBeds()+" Cena:"+room3.getCost()+" Kč/noc"+" Výhled na moře:"+room3.isSea()+" Balkón:"+room3.isBalcony());
//rezervace
List<Booking> bookingList = new ArrayList<>();

Booking booking0 = new Booking(LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),adela,room1,true,false);
Booking booking1 = new Booking(LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),adela,jan,room3,true,false);

System.out.println(booking0);
System.out.println(booking1);
    }
}
