package com.teacher;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import com.teacherDetails.TeacherDetailsApplication;

@SuppressWarnings("unused")
@SpringBootTest(classes = TeacherDetailsApplication.class)
class TeacherDetailsApplicationTests {
	@Test
	public void testgetallTeachers() {
		String result=given()
				.header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.when()
				.get("http://localhost:8086/api/teacherDetails")
				.then()
				.assertThat().statusCode(200)
				.extract().response().asString();
	}

}
