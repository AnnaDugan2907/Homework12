import java.util.Objects;

public class author {

    private String firstname;
    private String lastname;

    //Конструктор
    public author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String toString() {
        return firstname + " " + lastname;
    }

    //Геттеры
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        author author = (author) o;
        return Objects.equals(firstname, author.firstname) &&
                Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

}
