package cn.geekview.concert.config;

import cn.geekview.concert.ConcertPerformance;
import cn.geekview.concert.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConcertConfig {
    @Bean
    public Performance performance(){
        return new ConcertPerformance();
    }
}
