package com.sr1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProductById {
  @Test
  public void putRequest() {
	  RestAssured.baseURI="http://localhost:8082/productservice/111";
	  RequestSpecification httpRequest=RestAssured.given();
	  JSONObject requestparams=new JSONObject();
	  requestparams.put("productId",111);
	  requestparams.put("productName","perfume");
	  requestparams.put("productDescription","Beauty");
	  requestparams.put("productPrice","400");
	  httpRequest.header("Content-Type","application/json");
	  httpRequest.body(requestparams.toJSONString());
	  Response response=httpRequest.put("http://localhost:8082/productservice/111");
	  System.out.println(response.getStatusLine());
  }
}

