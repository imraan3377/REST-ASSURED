package com.sr1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddingProducts {
  @Test
  public void toCreateAProduct() {
	  RestAssured.baseURI="http://localhost:8082/productservice/addProduct";
	  RequestSpecification httpRequest=RestAssured.given();
	  JSONObject requestparams=new JSONObject();
	  requestparams.put("productId",202);
	  requestparams.put("productName","ps4");
	  requestparams.put("productDescription","Electronics");
	  requestparams.put("productPrice","35000");
	  httpRequest.header("Content-Type","application/json");
	  httpRequest.body(requestparams.toJSONString());
	  Response response=httpRequest.post("http://localhost:8082/productservice/addProduct");
	  System.out.println(response.getStatusLine());
  }
}
