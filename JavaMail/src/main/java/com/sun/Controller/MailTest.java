package com.sun.Controller;

import com.sun.Mail.HtmlMessage;
import com.sun.Mail.MessageType;
import com.sun.Mail.TextMessage;
import com.sun.POJO.MailSendInfo;
import com.sun.POJO.Manage;
import com.sun.Service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MailTest {


        /*
        * Could not autowire. There is more than one bean of 'MessageType' type.
        Beans:
        htmlMessage   (HtmlMessage.java) textMessage   (TextMessage.java)
        @Autowired
        private MessageType messageType;
        * */
        @Autowired
        private  HtmlMessage htmlMessage;
        @Autowired
        private TextMessage textMessage;

        @Autowired
        private ManageService manageService;

        @RequestMapping("/sendMail")
        public  String sendMail(){
            MailSendInfo mailSendInfo= new MailSendInfo();
            Manage manage = manageService.load(1);
            mailSendInfo.setToAddress(manage.getEmail());
            mailSendInfo.setFromAddress("15210815016@163.com");
            mailSendInfo.setContent("765432");
//            使用强转
            htmlMessage.printMessage(mailSendInfo);
            return "success";
        }
}
