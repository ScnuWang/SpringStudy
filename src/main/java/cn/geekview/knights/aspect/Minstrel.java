package cn.geekview.knights.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.PrintStream;

/**
 * 可以理解为将一个类通过配置之后抽象成一个切面
 */
@Aspect
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    @Pointcut("execution(* cn.geekview.knights.BraveKnight.embarkOnQuest(..))")
    private void aopsign(){

    }

    @Before("aopsign()")
    public void beforemethod(){
        stream.println("Minstrel:调用前打印");
    }

    @AfterReturning("aopsign()")
    public void singAfterQuest(){
        stream.println("Minstrel:调用后打印");
    }
}
