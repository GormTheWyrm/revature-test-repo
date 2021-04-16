package org.example;
//do I need to import org.example? It worked without it
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoTest {
    private static Demo demo; //create a private static version of the class being tested...
    // I didnt know that was possible...
    //does it need to be private? why is it private?
    //can instantiate this class once
    //if I want to instantiate this for each test, put this in @beforeEach

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all!");
        //setup class to test...
        demo = new Demo();
    }

//    @BeforeEach

    @Test
    public void test1(){
        System.out.println("test one!");

    }
    @Test
    public void isOddNumTestFalse(){
        System.out.println("test for evens!");
    int n = 4;
        Assertions.assertEquals(false, demo.isOddNum(n));

    }
    @Test
    public void isOddNumTestTrue(){
        System.out.println("test for odds!");
        int n = 3;
        Assertions.assertTrue(demo.isOddNum(n));
    }//why is this run first? and test1 run second?

}
//47:40 into week1, day 4 classes last video