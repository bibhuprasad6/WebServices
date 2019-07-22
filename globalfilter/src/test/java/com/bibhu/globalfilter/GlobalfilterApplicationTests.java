package com.bibhu.globalfilter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GlobalfilterApplicationTests {

	@Test
	public void contextLoads() {
	}

	private static final String RESPONSE="SUCCESS";
	@Autowired
    private TestRestTemplate restTemplate;

	
	@Test
	public void givenGetDetailsK2_whenCorrectRequest_thenResponseIsOkAndContainsSuccess() {
		    
		    ResponseEntity<String> entity = this.restTemplate.getForEntity("/gbl/test",
	                String.class);
		    assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
	        assertThat(entity.getBody()).isEqualTo(RESPONSE);

		
	}
}
