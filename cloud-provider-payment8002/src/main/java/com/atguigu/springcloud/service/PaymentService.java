package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface PaymentService {

    int create(Payment payment); //写

     Payment getPaymentById(@Param("id") Long id);  //读取
}


