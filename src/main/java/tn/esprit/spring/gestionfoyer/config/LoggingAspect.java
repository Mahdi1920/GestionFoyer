package tn.esprit.spring.gestionfoyer.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    // before execution
    @Before("execution(* tn.esprit.spring.gestionfoyer..*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    // After Execution of methode
    @After("execution(private String tn.esprit.spring.gestionfoyer..*(..))")
    public void logMethodEntryAfter(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    // after good execution of methode
    @AfterReturning("execution(* tn.esprit.spring.gestionfoyer..add*(..))")
    public void logMethodEntryAfterReturn(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Succeffuly adding In method " + name + " : ");
    }
    //after throw exception
    @AfterThrowing("execution(* tn.esprit.spring.gestionfoyer.servicesImpl.retrieve*(..))")
    public void logMethodEntryThrow(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Error retrieve In method " + name + " : ");
    }
}