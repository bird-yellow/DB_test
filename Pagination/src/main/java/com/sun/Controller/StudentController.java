package com.sun.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.Entity.Student;
import com.sun.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/pageTest")
public class StudentController {
        @Autowired
        private StudentService studentService;

        @RequestMapping("/test1")
        public String test1(Model model,@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo){
//            每一页的大小为4
            Integer pageSize = 4;
            PageHelper.startPage(pageNo,pageSize);
            List<Student> lists = studentService.getAll();
            PageInfo<Student> pageInfo= new PageInfo<>(lists);
            model.addAttribute("pagers",pageInfo);
            return "Pageffff";
        }


}
