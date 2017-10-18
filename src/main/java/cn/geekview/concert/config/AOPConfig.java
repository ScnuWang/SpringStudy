package cn.geekview.concert.config;

import cn.geekview.concert.aspect.Audience;
import cn.geekview.concert.aspect.EncoreableIntroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return new EncoreableIntroducer();
    }
}
