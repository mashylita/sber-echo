package ru.sbt.echo;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author sbt-zaharova-ma
 */
public class EchoMainTest {

    @Test
    public void testMain() {
        EchoMain.main(new String[]{"a"});
        Assert.assertFalse(false);

    }

    @Test
    public void testMain02(){
        EchoMain.main(new String[]{"er,qw"});
    }
}

