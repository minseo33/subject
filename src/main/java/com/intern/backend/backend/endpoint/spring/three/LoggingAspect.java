package com.intern.backend.backend.endpoint.spring.three;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
// [특징-4] AOP 를 활용하여 메서드 호출 전에 로깅을 추가하는 예제 입니다.
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.intern.backend.backend.endpoint.view.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before method : " + joinPoint.getSignature().getName());
    }
}
