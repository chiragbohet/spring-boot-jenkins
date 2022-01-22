package com.jenkinsdemo.basicapp;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class BasicAppApplicationTests {

	@Test
	void test1() {
		Assert.isTrue(true,"Canary Test Failed");
	}

	@Test
	void test2() {
		Assert.isInstanceOf(String.class,"String");
	}

	@Test
	void test3() {
		Assert.isNull(null,"Object is not Null");
	}

}
