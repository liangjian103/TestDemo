package com.guoyangyang.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemoApplicationTests {

	@Autowired
	JavaMailSender mailSender;

	@Test
	public void sendSimpleMail() throws Exception{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("1041123680@qq.com");
		message.setTo("1041123680@qq.com");
		message.setSubject("测试邮件");
		message.setText("啦啦啦啦");
		mailSender.send(message);
	}

	@Test
	public void contextLoads() {



	}

}
