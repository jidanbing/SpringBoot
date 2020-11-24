package com.atguigu.springboot;

import com.atguigu.springboot.bean.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloworldQuickApplicationTests {

    @Autowired
    People people;

    @Autowired
    ApplicationContext ioc;

    @Test
   public void contextLoads(){
       System.out.println(people);
   }

   @Test
   public void testHello(){
        boolean b = ioc.containsBean("helloService");
       System.out.println(b);
   }
}