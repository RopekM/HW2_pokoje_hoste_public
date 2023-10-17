import java.time.LocalDate;

public class Rooms {
    private int numberOfBeds;
    private int cost;
    private boolean balcony;
    private boolean sea;
    private int roomNumber;



    //konstruktor

    public Rooms(int numberOfBeds, int cost, boolean balcony, boolean sea, int roomNumber) {
        this.numberOfBeds = numberOfBeds;
        this.cost = cost;
        this.balcony = balcony;
        this.sea = sea;
        this.roomNumber = roomNumber;
    }


    //konstruktor end



    //getter and setter

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSea() {
        return sea;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    //getter and setter end


    @Override
    public String toString() {
        return  " " + roomNumber;
    }
}

