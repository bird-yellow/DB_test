package com.sun.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
        private  Integer did;
        private  String dname;
        private  Integer pId;
        private  Integer cId;

        private  Province province;
        private  City city;
}
