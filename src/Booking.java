import java.time.LocalDate;
import java.util.List;

public class Booking {

private LocalDate arrival;
private LocalDate left;
private Guests guests;
private Guests guests2;
private Rooms rooms;
private boolean recreation;
private boolean work;

//konstruktor

    public Booking(LocalDate arrival, LocalDate left, Guests guests, Rooms rooms, boolean recreation, boolean work) {
        this.arrival = arrival;
        this.left = left;
        this.guests = guests;
        this.rooms = rooms;
        this.recreation = recreation;
        this.work = work;
    }

    //konstruktor end

    //konstruktor 2

    public Booking(LocalDate arrival, LocalDate left, Guests guests, Guests guests2, Rooms rooms, boolean recreation, boolean work) {
        this.arrival = arrival;
        this.left = left;
        this.guests = guests;
        this.guests2 = guests2;
        this.rooms = rooms;
        this.recreation = recreation;
        this.work = work;
    }
    // konstruktor 2 end

    //getter and setter

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getLeft() {
        return left;
    }

    public void setLeft(LocalDate left) {
        this.left = left;
    }

    public Guests getGuests() {
        return guests;
    }

    public void setGuests(Guests guests) {
        this.guests = guests;
    }

    public Guests getGuests2() {
        return guests2;
    }

    public void setGuests2(Guests guests2) {
        this.guests2 = guests2;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    public boolean isRecreation() {
        return recreation;
    }

    public void setRecreation(boolean recreation) {
        this.recreation = recreation;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    //getter and setter end


    @Override
    public String toString() {
        return "Rezervace od:"  + arrival +
                " do:" + left +
                ", Host 1=" + getGuests() +
                ", Host 2=" + getGuests2() +
                ", Pokoj" + rooms +
                ", Rekreace:" + recreation +
                ", Práce:" + work +
                '}';
    }
}

