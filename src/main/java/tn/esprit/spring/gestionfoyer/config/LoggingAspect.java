package tn.esprit.spring.gestionfoyer.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* tn.esprit.spring.gestionfoyer..*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @AfterReturning("execution(* tn.esprit.spring.gestionfoyer..add*(..))")
    public void logMethodEntryReturn(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Succeffuly adding In method " + name + " : ");
    }
    @AfterThrowing("execution(* tn.esprit.spring.gestionfoyer.servicesImpl.retrieve*(..))")
    public void logMethodEntryThrow(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Error retrieve In method " + name + " : ");
    }
}