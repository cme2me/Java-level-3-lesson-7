package com.company;

public class DoTests {
    @BeforeSuite
    public static void test1() {
        System.out.println("test1 && Before");
    }
    @TestPriority(priority = 4)
    public static void test2() {
        System.out.println("test2 && priority");
    }
    @TestPriority(priority = 5)
    public static void test3() {
        System.out.println("test3 && priority 5");
    }
    @TestPriority(priority = 1)
    public static void test4() {
        System.out.println("test4 && priority 1");
    }

    @AfterSuite
    public static void test5() {
        System.out.println("test5 && after");
    }
}
