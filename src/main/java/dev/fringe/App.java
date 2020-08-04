package dev.fringe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import brave.webmvc.AppConfiguration;
import brave.webmvc.TracingConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {AppConfiguration.class, TracingConfiguration.class})
@WebAppConfiguration
public class App {

	@Autowired RestTemplate restTemplate;
	
	@Test 
	public void test() throws Exception {
	    System.out.println(restTemplate.getForObject("http://localhost:8081/api", String.class));	
	}
}
