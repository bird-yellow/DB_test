package com.sun.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.Entity.Province;
import com.sun.Service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/province")
public class ProvinceController {
        @Autowired
        private ProvinceService provinceService;

        @RequestMapping("/findBySql")
        public  String findBySql(Model model) {
                String sql = "select * from province ";
                model.addAttribute("province",provinceService.listBySqlReturnEntity(sql));
                return "test";
        }
}
