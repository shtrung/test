import com.shtrung.spring.Calculate;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {


    private static Calculate calculate;

    @BeforeAll
    public static void init(){
        calculate = new Calculate();
    }


    @Test
    public void test1(){
        assertEquals(0,calculate.add(0,0));
    }

    @Test
    public void test2(){
        assertEquals(-100,calculate.add(-50,-50));
    }
    @Test
    public void test3(){
        assertEquals(0,calculate.add(10,-10));
    }

    @Test
    public void test4(){
        assertEquals(4,calculate.multiply(2,2));
    }

    @Test
    public void test5(){
        assertEquals(0,calculate.multiply(0,0));
    }


}
