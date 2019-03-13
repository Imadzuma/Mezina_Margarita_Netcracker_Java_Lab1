package book;

import java.util.Objects;

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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof  Author)) return false;
        Author author = (Author)obj;
        return (name == author.name) && (email == author.email) && (gender == author.gender);
    }
    @Override
    public int hashCode() {
        int result = 102;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + gender;
        return result;
    }
}
