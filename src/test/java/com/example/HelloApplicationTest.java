package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import customer.common.HelloApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=HelloApplication.class)
public class HelloApplicationTest {

	@Test
	public void contextLoads() {
	}
}
