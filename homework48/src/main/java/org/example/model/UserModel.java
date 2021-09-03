package org.example.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private Long idUser;
    private String userName;
    private String userPassword;
}
