package com.sun.Mail;

import com.sun.POJO.MailSendInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

@Component
public class HtmlMessage implements  MessageType {

    @Override
    public void printMessage(MailSendInfo mailSendInfo) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("springMail.xml");
        JavaMailSender javaMailSender = (JavaMailSender)factory.getBean("mailSender");
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        设置主题
        try {
            mimeMessage.setSubject("验证码");
//            设置message辅助
            MimeMessageHelper helper= new MimeMessageHelper(mimeMessage,true,"UTF-8");
//            设置收件人地址
            helper.setTo(mailSendInfo.getToAddress());
//            设置发件人地址
            helper.setFrom(mailSendInfo.getFromAddress());
//            设置邮件内容.设置多媒体部分
            MimeMultipart  multipart = new MimeMultipart();
            MimeBodyPart  bodyPart = new MimeBodyPart();
            StringBuffer sb = new StringBuffer();
//            设置 邮件体内容
            sb.append("<html><head><title>验证码</title></head><body><h1>内容</h1><h1>" + mailSendInfo.getContent() + "</h1></body></html>");
            bodyPart.setContent(sb.toString(),"text/html;charset=UTF-8");
//            将bodyPart 添加到多媒体中
            multipart.addBodyPart(bodyPart);
//              将多媒体设置到 消息内容中
            mimeMessage.setContent(multipart);
//            发送邮件
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("邮件发送成功");
        }
    }
}
