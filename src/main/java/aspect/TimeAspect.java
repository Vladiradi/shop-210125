package aspect;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;


@Aspect
@Component
@Slf4j

public class TimeAspect {

    // Pointcut: все публичные методы контроллера
    @Pointcut("execution(public * de.telran.shop210125mbe.controller.UserController.*(..))")
    public void callAtUserControllerPublic() {} // Join-point

    // Advice: выполняется перед вызовом метода
    @Before("callAtUserControllerPublic()")
    public void boforeCallAtMethod(JoinPoint joinPoint) {
        log.info(".....start....."+ joinPoint.toString()+".....time....." + LocalDateTime.now());
        String args = Arrays.stream(joinPoint.getArgs())
                .map(a -> a.toString())
                .collect(Collectors.joining(","));
        log.info("before..." + joinPoint.toString() + ", args=[" + args + "]");args);
    }

    @After("callAtUserControllerPublic()")
    public void afterCallAt(JoinPoint joinPoint) {
        log.info(".....end....."+ joinPoint.toString()+".....time....." + LocalDateTime.now());
    }

}