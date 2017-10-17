package cn.geekview.knights.config;


import cn.geekview.knights.aspect.Minstrel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {
    @Bean
    public Minstrel minstrel(){
        return new Minstrel(System.out);
    }
}
