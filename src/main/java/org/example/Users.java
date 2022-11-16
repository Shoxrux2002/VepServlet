package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Users {
    private String ism;
    private String familasi;
    private String email;
    private String telefon;
    private String login;
    private String password;
}
