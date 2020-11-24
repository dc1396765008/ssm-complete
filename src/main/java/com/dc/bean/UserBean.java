package com.dc.bean;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {
    private int id;
    private String username;
    private String password;
}
