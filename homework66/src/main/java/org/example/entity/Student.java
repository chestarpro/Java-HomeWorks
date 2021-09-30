package org.example.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @ManyToMany
    @JoinColumn(name = "student_id")
    private List<Group> groups = new ArrayList<>();


    public Student(String fullName, List<Group> groups) {
        this.fullName = fullName;
        this.groups = groups;
    }
}
