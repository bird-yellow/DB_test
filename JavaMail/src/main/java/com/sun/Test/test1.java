package com.sun.Test;

import com.sun.Mail.HtmlMessage;
import com.sun.POJO.MailSendInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


public class test1 {

    public static void main(String[] args) {
            HtmlMessage htmlMessage = new HtmlMessage();
            MailSendInfo mailSendInfo = new MailSendInfo();
            mailSendInfo.setFromAddress("15210815016@163.com");
            mailSendInfo.setToAddress("15210815016@qq.com");
            mailSendInfo.setContent("123123");
            htmlMessage.printMessage(mailSendInfo);
    }
}
