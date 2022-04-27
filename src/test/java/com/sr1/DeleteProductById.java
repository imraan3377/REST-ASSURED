package com.sr1;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProductById {
  @Test
  public void detletTheProduct() {
	  RestAssured
	  .given()
	  .log()
	  .all()
	  .header("Content-Type","application/json")
	  .delete("http://localhost:8082/productservice/200")
	  .then()
	  .log()
	  .all();
  }
}

