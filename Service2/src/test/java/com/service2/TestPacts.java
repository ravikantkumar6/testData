//package com.service2;
//
//import au.com.dius.pact.provider.junit.PactRunner;
//import au.com.dius.pact.provider.junit.Provider;
//import au.com.dius.pact.provider.junit.State;
//import au.com.dius.pact.provider.junit.VerificationReports;
//import au.com.dius.pact.provider.junit.loader.PactBroker;
//import au.com.dius.pact.provider.junit.loader.PactBrokerAuth;
//import au.com.dius.pact.provider.junit.target.HttpTarget;
//import au.com.dius.pact.provider.junit.target.Target;
//import au.com.dius.pact.provider.junit.target.TestTarget;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//@RunWith(PactRunner.class)
//@Provider("my-service2" )
//@PactBroker(host = "test.pact.dius.com.au", authentication =  @PactBrokerAuth(username =  "dXfltyFMgNOFZAxr8io9wJ37iUpY42M",password = "O5AIZWxelWbLvqMd8PkAVycBJh2Psyg1"))
//@VerificationReports({"console", "markdown"})
//public class TestPacts {
////    private static ConfigurableApplicationContext application;
//
//    @TestTarget
//    public final Target target = new HttpTarget(8080);
//
////    @BeforeClass
////    public static void startSpring(){
////        application = SpringApplication.run(Service2Application.class);
////    }
//
//    @State("default")
//    public void toDefaultState() {
//        System.out.println("Now service in default state");
//    }
//
//    @State("extra")
//    public void toExtraState() {
//        System.out.println("Now service in extra state");
//    }
//
////    @AfterClass
////    public static void kill(){
////        application.stop();
////    }
//}