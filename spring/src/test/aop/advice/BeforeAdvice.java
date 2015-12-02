package test.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdvice{

	@Before("execution(public * test.spring.bean..*(..))")
	public void test() {
		System.out.println("before advice");
	}
	
	public void after() {
		System.out.println("after advice");
	}
	
	public void returning() {
		System.out.println("returning");
	}
	
	public void throwing() {
		System.out.println("throwing");
	}
	
	public Object around(ProceedingJoinPoint jp) {
		System.out.println(jp.getSignature());
		System.out.println(jp.getTarget());
		System.out.println(jp.getThis());
		System.out.println(jp.getClass());
		System.out.println(jp.getSourceLocation());
		System.out.println(jp.getKind());
		System.out.println(jp.getStaticPart());
		return jp.getThis();
	}
}
