/*
 * TwitterStatsRunner.java
 *
 * Copyright © 2018 REYA Group. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * REYA Group ("Confidential Information").
 */
package karate.api.twitter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;

/**
 * This test will NOT be picked by the usual "mvn clean test" since it uses surefire plugin to run
 * unit tests, which runs only *Test.java and does not run *IT.java tests
 *
 * To run this test explicitly, use $ mvn clean test-compile failsafe:integration-test
 * failsafe:verify -DargLine="-Dkarate.env=local" (the last option failsafe:verify is necessary for
 * the overall maven test to fail - by default failsafe passes overall maven tests, even if the
 * individual integration test fails!)
 */
@RunWith(Karate.class)
@CucumberOptions(features = "classpath:karate/api/twitter/get_trends.feature", tags = "~@ignore")
public class TwitterStatsRunner {

  @BeforeClass
  public static void init() {
    System.setProperty("karate.env", "local");
  }

  @AfterClass
  public static void end() {
  }
}

