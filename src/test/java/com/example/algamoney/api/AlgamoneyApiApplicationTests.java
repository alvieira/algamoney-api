package com.example.algamoney.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@TestExecutionListeners(value = {DependencyInjectionTestExecutionListener.class})
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlgamoneyApiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
