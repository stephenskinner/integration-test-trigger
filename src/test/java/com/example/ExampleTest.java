package com.example;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

public class ExampleTest {

  @Test
  public void test1() {
    System.out.println("test1");
    Assert.assertTrue(true);
  }

  @Test
  @Ignore
  public void test2() {
    System.out.println("test2");
    Assert.assertTrue(false);
  }
}