import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author lubin@52iuh.com
 * @version 1.0
 * @date 2020/4/27 10:46
 */
public class TestJdk10 {
    @Test
    public  void  testCollection(){
        List<String> strings = List.of("2","1","3");
        System.out.println(strings);
    }
    @Test
    public  void  testVar(){
        var name = "lubin";
        //String name = "huahua";
        var map = new HashMap<String,Integer>();
    }
}
