package com.ytkj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActuatorApplicationTests {


	@Autowired
	private JavaMailSender mailSender;

	@Test
	public void contextLoads() {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("lfy2008_gxu@126.com");//发送者.
		message.setTo("lfy2008_gxu@126.com");//接收者.
		message.setSubject("测试邮件（邮件主题）");//邮件主题.
		message.setText("这是邮件内容");//邮件内容.

		mailSender.send(message);//发送邮件
	}



}
