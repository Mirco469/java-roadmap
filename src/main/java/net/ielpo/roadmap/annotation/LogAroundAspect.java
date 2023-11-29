package net.ielpo.roadmap.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Alberto Ielpo
 */
@Aspect
@Component
public class LogAroundAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around("@annotation(LogAround)")
    public Object intercept(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("code to execute before the method invocation....");
        Object res = joinPoint.proceed();
        logger.info("code to execute after the method invocation....");
        return res;
    }

}
