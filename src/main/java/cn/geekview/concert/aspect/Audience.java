package cn.geekview.concert.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    //避免每个注解上都添加execution(* cn.geekview.concert.Performance.preform(..))
    @Pointcut("execution(* cn.geekview.concert.Performance.preform(..))")
    public void preform(){

    }


//    @Before("execution(* cn.geekview.concert.Performance.preform(..))")
//    @Before("preform()")
    public void takeSeats(){
        System.out.println("表演之前：观众就坐");
    }

//    @Before("execution(* cn.geekview.concert.Performance.preform(..))")
//    @Before("preform()")
    public void silenceCellPhones(){
        System.out.println("表演之前：手机调整为静音");
    }

//    @AfterReturning("execution(* cn.geekview.concert.Performance.preform(..))")
//    @AfterReturning("preform()")
    public void applause(){
        System.out.println("表演之后：观众鼓掌");
    }

//    @AfterThrowing("execution(* cn.geekview.concert.Performance.preform(..))")
//    @AfterThrowing("preform()")
    public void demandRefund(){
        System.out.println("表演失败之后：观众要求退款");
    }

    //环绕通知
    @Around("preform()")
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
