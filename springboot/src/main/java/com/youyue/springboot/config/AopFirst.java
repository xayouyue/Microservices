package com.youyue.springboot.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration

@Aspect
public class AopFirst {
    /**
     *
     <aop:config>
     <!--配置切点表达式-->
     <aop:pointcut id="pointcut" expression="execution(* com.spring.aop.*.*(int,int))"/>
     <!--配置切面以及通知-->
     <aop:aspect ref="loggingAspect" order="2">
     <aop:before method="beforeMethod" pointcut-ref="pointcut"/>
     <aop:after method="afterMethod" pointcut-ref="pointcut"/>
     <aop:after-throwing method="afterThrowing" pointcut-ref="pointcut" throwing="ex"/>
     </aop:aspect>
     <aop:aspect ref="vlidationAspect" order="1">
     <aop:before method="validationArgs" pointcut-ref="pointcut"/>
     </aop:aspect>
     </aop:config>
     */
    @Pointcut("execution(* com.youyue.springboot.*.*(..))")
    public void p1() {
    }

    @Before("p1()")
    public void before() {
        System.out.println("这是前切");
    }

    @After("p1()")
    public void after() {
        System.out.println("这是后切");
    }

}
