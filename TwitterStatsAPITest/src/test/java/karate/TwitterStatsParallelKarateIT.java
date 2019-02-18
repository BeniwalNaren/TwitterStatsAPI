/*
 * POOParallelKarateIT.java
 *
 * Copyright © 2018 ING Group. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ING Group ("Confidential Information").
 */
package karate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.intuit.karate.cucumber.CucumberRunner;
import com.intuit.karate.cucumber.KarateStats;
import cucumber.api.CucumberOptions;

import static org.junit.Assert.assertTrue;

/**
 * This test will NOT be picked by the usual "mvn clean test" since it uses surefire plugin to run
 * unit tests, which runs only *Test.java and does not run *IT.java tests
 *
 * To run this test explicitly, use $ mvn clean test-compile failsafe:integration-test
 * failsafe:verify -DargLine="-Dkarate.env=local" (the last option failsafe:verify is necessary for
 * the overall maven test to fail - by default failsafe passes overall maven tests, even if the
 * individual integration test fails!)
 */
@CucumberOptions(tags = {"~@ignore"})
public class TwitterStatsParallelKarateIT {

  @BeforeClass
  public static void init() {
  }

  @AfterClass
  public static void end() {
  }

  @Test
  public void testParallel() {
    KarateStats stats = CucumberRunner.parallel(getClass(), 1, "target/surefire-reports");
    assertTrue("Scenarios failed", stats.getFailCount() == 0);
  }
}

