package com.sun.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manage {
        private  Integer id;
        private  String username;
        private  String password;
        private  String email;
}
