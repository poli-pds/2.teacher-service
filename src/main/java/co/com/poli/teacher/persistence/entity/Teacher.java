package co.com.poli.teacher.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "teachers")
@Getter
@Setter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher",
            cascade = CascadeType.PERSIST)
    private List<Course> courses;

}
