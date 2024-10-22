package es.etg.psp.template;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



@TestMethodOrder(OrderAnnotation.class)
public class TestClass {


    @Test
    @Order(10)
    public void connectTest() throws Exception{

       assertTrue(true);
    }


}
