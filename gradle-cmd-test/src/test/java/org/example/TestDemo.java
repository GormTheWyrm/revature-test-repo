package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestDemo {
    private static Demo demo;
@BeforeAll
public static void testInit(){
    demo = new Demo();
}
@Test
    public void basicTest(){
    Assertions.assertEquals(1,demo.returnOne());
}

}
