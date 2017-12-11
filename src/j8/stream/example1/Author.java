package j8.stream.example1;

public class Author {
    private String surnames;
    private Integer age;

    public Author(String surnames, Integer age) {
        this.surnames = surnames;
        this.age = age;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
