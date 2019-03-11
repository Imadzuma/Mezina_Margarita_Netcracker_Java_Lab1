package book;

public class Author {
    // Fields
    private String name;
    private String email;
    private char gender;

    // Constructors
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Override metods
    @Override
    public String toString() {
        return "Author[name=\"" + name + "\",email=\"" + email + "\",gender=" + gender + "]";
    }
    @Override
    protected Author clone() {
        return new Author(name, email, gender);
    }
}
