package aspect;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Аспект для логирования времени выполнения методов,
 * помеченных аннотацией @LogTimeAnnotation.
 */

@Aspect
@Component
@Slf4j // Lombok-аннотация — добавляет логгер "log"

public class IntervalTimeAspect  {

    @Around("@annotation(LogTimeAnnotation)")
    public Object aroundCallAt(ProceedingJoinPoint pjp) throws Throwable {

        long startTime = System.currentTimeMillis();
        // Выполняем оригинальный метод
        Object result = pjp.proceed();
        // Считаем, сколько времени заняло выполнение
        long duration = System.currentTimeMillis() - startTime;
        log.info("Method: " + pjp.getSignature().getName() + " runs in:  " + (System.currentTimeMillis()-startTime));
        return result;
    }
}
