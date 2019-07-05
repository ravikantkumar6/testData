//package com.service1.controller;
//
//import au.com.dius.pact.consumer.Pact;
//import au.com.dius.pact.consumer.PactProviderRuleMk2;
//import au.com.dius.pact.consumer.PactVerification;
//import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
//import au.com.dius.pact.model.RequestResponsePact;
//import au.com.dius.pact.provider.junit.loader.PactFolder;
//import io.pactfoundation.consumer.dsl.LambdaDsl;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@PactFolder("/pact")
//public class UserControllerTest {
//
//    @Rule
//    public PactProviderRuleMk2 mockProvider = new PactProviderRuleMk2("my-service2", "localhost", 8080, this);
//    @Autowired
//    UserController userController;
//
//    @Pact(state = "default", consumer = "my-service1", provider = "my-service2")
//    public RequestResponsePact getData(PactDslWithProvider builder) {
//        return builder.given("User 1 exists")
//                .uponReceiving("A request to /get")
//                .path("/get")
//                .method("GET")
//                .willRespondWith()
//                .status(200)
//                .body(LambdaDsl.newJsonBody((o) -> o
//                        .stringType("name", "Test1")).build())
////                .body("Test1")
//                .toPact();
//    }
//
//    @PactVerification("my-service2")
//    @Test
//    public void getData() {
//        final String data = userController.getData();
//        org.junit.Assert.assertEquals(data, "[\"Service2\",\"Test\"]");
//    }
//}