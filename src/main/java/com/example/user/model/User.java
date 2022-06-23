package com.example.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String address;
    private int age;
    private String profilePicUrl;


}
