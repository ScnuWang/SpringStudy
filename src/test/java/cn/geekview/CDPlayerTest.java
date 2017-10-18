package cn.geekview;

import cn.geekview.soundsystem.SgtPeppers;
import cn.geekview.soundsystem.config.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private SgtPeppers sgtPeppers;

    @Test
    public void test1(){
        sgtPeppers.play();
    }
}
