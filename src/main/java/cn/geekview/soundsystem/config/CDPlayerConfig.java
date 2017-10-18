package cn.geekview.soundsystem.config;

import cn.geekview.soundsystem.CDPlayer;
import cn.geekview.soundsystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CompactDiscConfig.class)//导入其他配置类
//@ComponentScan(basePackages = "cn.geekview") //默认会扫描与配置类相同的包,basePackages返回的是一个字符串数组，所以可以同时设置多个包路径，
//也可以使用包中所包含的类或接口代替
public class CDPlayerConfig {

    //不使用包扫描的方式装配bean的话，就直接在配置类中创建bean
//    @Bean
//    public CompactDisc compactDisc(){
//        return new SgtPeppers();
//    }

    /**
     * cdPlayer()方法请求一个CompactDisc作为参数。当
     Spring调用cdPlayer()创建CDPlayerbean的时候，它会自动装配
     一个CompactDisc到配置方法之中。然后，方法体就可以按照合适
     的方式来使用它。借助这种技术， cdPlayer()方法也能够
     将CompactDisc注入到CDPlayer的构造器中，而且不用明确引
     用CompactDisc的@Bean方法。
     通过这种方式引用其他的bean通常是最佳的选择，因为它不会要求
     将CompactDisc声明到同一个配置类之中。
     * @param compactDisc
     * @return
     */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }


//    @Bean
//    public CDPlayer cdPlayer(){
//        return new CDPlayer(compactDisc());//这种直接调用方法的方式注入CompactDisc的弊端：如果还有一个会出现两个注入同一个实例
//    }

    /**
     * 默认情况下， Spring中的bean都是单例
     的，我们并没有必要为第二个CDPlayer bean创建完全相同的
     SgtPeppers实例。所以， Spring会拦截对sgtPeppers()的调用并
     确保返回的是Spring所创建的bean，也就是Spring本身在调
     用sgtPeppers()时所创建的CompactDiscbean。因此，两
     个CDPlayer bean会得到相同的SgtPeppers实例。
     * @return
     */
//    @Bean
//    public CDPlayer anthorCDPlayer(){
//        return new CDPlayer(compactDisc());
//    }


}
