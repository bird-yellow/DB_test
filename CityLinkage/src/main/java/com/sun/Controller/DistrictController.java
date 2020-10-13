package com.sun.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.Entity.District;
import com.sun.Service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/district")
public class DistrictController {
        @Autowired
        private DistrictService districtService;

        @RequestMapping("/findBySql")
        @ResponseBody
        public  String findBySql(District district) throws JsonProcessingException {
                System.out.println(district.getCId());
                String sql = "select * from district where d_cId=" + district.getCId();
                System.out.println(districtService.listBySqlReturnEntity(sql));
                return new ObjectMapper().writeValueAsString(districtService.listBySqlReturnEntity(sql));
        }
}
