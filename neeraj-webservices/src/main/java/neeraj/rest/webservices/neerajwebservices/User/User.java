package neeraj.rest.webservices.neerajwebservices.User;

import java.time.LocalDate;

public class User {
    private Integer id ;
     private String nmae;
     private LocalDate birthDate;

    public User(Integer id, String nmae, LocalDate birthDate) {
        super();
        this.id = id;
        this.nmae = nmae;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNmae() {
        return nmae;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nmae='" + nmae + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
