package core;

import io.restassured.http.ContentType;

public interface Constants {
	
	String APP_BASE_URL = "https://reqres.in/api/";
	Integer APP_PORT = 443;
	String APP_BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;

}
