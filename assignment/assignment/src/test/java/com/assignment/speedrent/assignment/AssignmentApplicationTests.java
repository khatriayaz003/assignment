package com.assignment.speedrent.assignment;

import static org.junit.Assert.assertEquals;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AssignmentApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testHello() throws JSONException {
		String expected = "{\"name\":MYVI,\"manufacturer\":\"Perodua\"}";
		
		ResponseEntity<String> response = restTemplate.getForEntity("/api/hello", String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(MediaType.APPLICATION_JSON_UTF8, response.getHeaders().getContentType());
		JSONAssert.assertEquals(expected, response.getBody(), false);

	}

}
