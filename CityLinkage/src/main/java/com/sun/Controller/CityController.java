package com.sun.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.Entity.City;
import com.sun.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/city")
public class CityController {
        @Autowired
        private CityService cityService;

        @RequestMapping("/findBySql")
        @ResponseBody
        public  String findBySql(City city) throws JsonProcessingException {
                System.out.println(city.getPId());
                String sql = "select * from city where c_pId=" +city.getPId();
                System.out.println(cityService.listBySqlReturnEntity(sql));
                return new ObjectMapper().writeValueAsString(cityService.listBySqlReturnEntity(sql));
        }
}
