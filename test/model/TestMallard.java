package model;

import org.junit.Before;
import org.junit.Test;

public class TestMallard {

	@Before
	public void setUp() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Test
    public static void main(String[] args) {  
        testMallard() ;  
  
          
    }  
  
    static  void testMallard() {  
        Duck mallarDuck = new MallardDuck();  
        mallarDuck.display();  
        mallarDuck.swim();  
        mallarDuck.performQuack();  
        mallarDuck.performFly();  
    }  
  
//    static  void testReadHead() {  
//        Duck RedHeadDuck = new RedHeadDuck();  
//        RedHeadDuck.display();  
//        RedHeadDuck.swim();  
//        RedHeadDuck.performQuack();  
//        RedHeadDuck.performFly();  
//    }  
}
