package com.sun.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {
        private  Integer id;
        private  String  time;
        private  String   operator;
        private String    result;
}
