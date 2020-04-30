import org.junit.Test;

import java.util.List;

/**
 * @author lubin@52iuh.com
 * @version 1.0
 * @date 2020/4/26 14:25
 */
public class TestJdk9 {
    private static final System.Logger LOGGER = System.getLogger("TestJdk9");
    @Test
    public  void  testCollection(){
        List<String> strings = List.of("2","1","3");
        System.out.println(strings);
    }
}
