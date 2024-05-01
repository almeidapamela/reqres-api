package tests;

import java.util.HashMap;
import java.util.Map;

import dto.CreateDto;
import org.junit.Test;

import core.BaseTest;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateTest extends BaseTest {

	private static final String NAME = "morpheus";
	private static final String JOB = "leader";
	private static final String PATH = "/users";

	@Test
	public void createNameJobSuccess() {
		CreateDto requestBody = new CreateDto(NAME, JOB);
		given()
			.body(requestBody)
		.when ()
			.post(PATH)
		.then()
			.statusCode(201)
			.body("name", is(NAME))
			.body("job", is(JOB))
			;
		
	}
	
	@Test
	public void contract() {
		CreateDto requestBody = new CreateDto(NAME, JOB);
		given()
			.body(requestBody)
		.when ()
			.post(PATH)
		.then()
			.statusCode(201)
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("create.json"))
			;
	}
	
	@Test
	public void createNameJobNoName() {
		Map<String, String> data = new HashMap<>();
		data.put("job", JOB);
		
		given()
			.body(data)
		.when ()
			.post(PATH)
		.then()
			.statusCode(201)			
			;
		
	}
	
	@Test
	public void createNameJobNoJob() {
		Map<String, String> data = new HashMap<>();
		data.put("name", NAME);
		
		given()
			.body(data)
		.when ()
			.post(PATH)
		.then()
			.statusCode(201)		
			;
		
	}
	
	@Test
	public void createNameJobNameBlank() {
		CreateDto requestBody = new CreateDto("", JOB);
		given()
			.body(requestBody)
		.when ()
			.post(PATH)
		.then()
			.statusCode(201)		
			;
		
	}
	
	@Test
	public void createNameJobJobBlank() {
		CreateDto requestBody = new CreateDto(NAME, "");
		given()
				.body(requestBody)
		.when ()
			.post(PATH)
		.then()
			.statusCode(201)		
			;
	}
	
	@Test
	public void createNameJobNoBody() {
		given()
		.when ()
			.post(PATH)
		.then()
			.statusCode(201)		
			;
	}
	
	
}
