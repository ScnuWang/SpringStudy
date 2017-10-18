package cn.geekview;

import cn.geekview.concert.Encoreable;
import cn.geekview.concert.Performance;
import cn.geekview.concert.config.AOPConfig;
import cn.geekview.concert.config.ConcertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AOPConfig.class, ConcertConfig.class})
public class ConcertTest {

    @Autowired
    private Performance performance;


    @Test
    public void test1(){
        performance.preform();
    }

    //测试新功能，但是除了新增的功能，通知的功能无效，应该还有配置
    @Test
    public void test2(){
        Encoreable encoreable = (Encoreable)performance;
        encoreable.newfuction();
    }




//    @Autowired
//    private ConcertPerformance performance;//这里不能使用ConcertPerformance,在Spring中，切面只是实现了它们所包装bean相同接口的代理。

    /**
     * 严重: Caught exception while allowing TestExecutionListener [org.springframework.test.context.support.DependencyInjectionTestExecutionListener@7a79be86] to prepare test instance [cn.geekview.ConcertTest@1356d4d4]
     org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cn.geekview.ConcertTest': Unsatisfied dependency expressed through field 'concertPerformance'; nested exception is org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'concertPerformance' is expected to be of type 'cn.geekview.concert.ConcertPerformance' but was actually of type 'com.sun.proxy.$Proxy23'
     at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:588)
     at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
     at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:366)
     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1264)
     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireBeanProperties(AbstractAutowireCapableBeanFactory.java:386)
     at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:118)
     at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:83)
     at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:230)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:228)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:287)
     at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:289)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:247)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:94)
     at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
     at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
     at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
     at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
     at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
     at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
     at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70)
     at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:191)
     at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
     at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
     at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
     at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
     at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
     Caused by: org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'concertPerformance' is expected to be of type 'cn.geekview.concert.ConcertPerformance' but was actually of type 'com.sun.proxy.$Proxy23'
     at org.springframework.beans.factory.support.DefaultListableBeanFactory.checkBeanNotOfRequiredType(DefaultListableBeanFactory.java:1510)
     at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoMatchingBeanFound(DefaultListableBeanFactory.java:1489)
     at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1104)
     at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1066)
     at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:585)
     ... 27 more


     十月 18, 2017 3:42:11 下午 org.springframework.context.support.GenericApplicationContext doClose
     信息: Closing org.springframework.context.support.GenericApplicationContext@9f70c54: startup date [Wed Oct 18 15:42:11 CST 2017]; root of context hierarchy

     org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cn.geekview.ConcertTest': Unsatisfied dependency expressed through field 'concertPerformance'; nested exception is org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'concertPerformance' is expected to be of type 'cn.geekview.concert.ConcertPerformance' but was actually of type 'com.sun.proxy.$Proxy23'

     at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:588)
     at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
     at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:366)
     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1264)
     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireBeanProperties(AbstractAutowireCapableBeanFactory.java:386)
     at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:118)
     at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:83)
     at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:230)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:228)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:287)
     at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:289)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:247)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:94)
     at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
     at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
     at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
     at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
     at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
     at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
     at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70)
     at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
     at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:191)
     at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
     at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
     at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
     at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
     at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
     Caused by: org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'concertPerformance' is expected to be of type 'cn.geekview.concert.ConcertPerformance' but was actually of type 'com.sun.proxy.$Proxy23'
     at org.springframework.beans.factory.support.DefaultListableBeanFactory.checkBeanNotOfRequiredType(DefaultListableBeanFactory.java:1510)
     at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoMatchingBeanFound(DefaultListableBeanFactory.java:1489)
     at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1104)
     at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1066)
     at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:585)
     ... 27 more

     */
}
