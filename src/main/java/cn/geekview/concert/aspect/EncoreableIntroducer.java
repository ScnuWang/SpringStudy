package cn.geekview.concert.aspect;

import cn.geekview.concert.DefaultEncoreable;
import cn.geekview.concert.Encoreable;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "cn.geekview.concert.Performance+",defaultImpl = DefaultEncoreable.class)//value值后面的+必须要有
    public static Encoreable encoreable;

    //避免每个注解上都添加execution(* cn.geekview.concert.Performance.preform(..))
    @Pointcut("execution(* cn.geekview.concert.Encoreable.newfuction(..))")
    public void encoreable(){

    }

    //环绕通知
    @Around("encoreable()")
    public void watchpreform(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("表演之前：观众就坐");
            System.out.println("表演之前：手机调整为静音");
            joinPoint.proceed();
            System.out.println("表演之后：观众鼓掌");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("表演失败之后：观众要求退款");
        }

    }
}
