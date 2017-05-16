package test.java.ru.sbt.echo;

import main.java.ru.sbt.echo.EchoMain;
import org.junit.jupiter.api.Test;

//import org.junit.Test;

/**
 * @author sbt-zaharova-ma
 */
public class EchoMainTest {

    @Test
    public void testMain() {
        EchoMain.main(new String[]{"a"});
        //Assert.assertFalse(false);

    }

    @Test
    public void testMain02(){
        EchoMain.main(new String[]{"er,qw"});
    }
}

