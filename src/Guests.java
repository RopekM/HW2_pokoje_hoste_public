import java.time.LocalDate;

public class Guests {

    private String name;
    private LocalDate dateOfBirth;

    //konstruktor

    public Guests(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    //konstruktor end

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //getter and setter end


    @Override
    public String toString() {
        return
                " " + name + '\''
                ;
    }
}


