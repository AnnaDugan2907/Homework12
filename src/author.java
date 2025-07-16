public class author {

    private String firstname;
    private String lastname;

    //Конструктор
    public author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //Геттеры
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
