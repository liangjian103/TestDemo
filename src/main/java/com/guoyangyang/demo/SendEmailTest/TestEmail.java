package com.guoyangyang.demo.SendEmailTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

/**
 * @author guoyangyang
 * Date: 2018/3/26
 * Time: 15:12
 */
@Service
public class TestEmail {

    @Autowired
    JavaMailSenderImpl jmsi;

    public String sendBatchEmail(){




        return null;
    }




}
