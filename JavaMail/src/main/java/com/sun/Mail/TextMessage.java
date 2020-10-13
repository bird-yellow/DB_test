package com.sun.Mail;

import com.sun.POJO.MailSendInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class TextMessage implements  MessageType {

    @Override
    public void printMessage(MailSendInfo mailSendInfo) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("springMail.xml");
        JavaMailSender javaMailSender = (JavaMailSender)factory.getBean("mailSender");
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            mimeMessage.setSubject("发送文本");
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true,"UTF-8");
            helper.setFrom("15210815016@163.com");
            helper.setTo("15210815016@qq.com");
            helper.setText("hello 美女");
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("文本邮件发送成功");
        }
    }
}
