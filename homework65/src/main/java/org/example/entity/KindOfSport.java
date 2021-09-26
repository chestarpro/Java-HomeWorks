package org.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "kinds_of_sports")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class KindOfSport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;
}
