package cn.geekview.knights;

import cn.geekview.knights.config.AopConfig;
import cn.geekview.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BraveKnightTest {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class, AopConfig.class);
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
        context.close();
    }
}
