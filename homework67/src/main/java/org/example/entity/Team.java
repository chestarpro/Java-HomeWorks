package org.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private String logo;

    private String website;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kind_of_sport_id", nullable = false)
    private KindOfSport kindOfSport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
}