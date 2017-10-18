package cn.geekview.knights.config;

import cn.geekview.knights.BraveKnight;
import cn.geekview.knights.Knight;
import cn.geekview.knights.Quest;
import cn.geekview.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean //如果没有指定name属性：默认值为方法的名称
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
