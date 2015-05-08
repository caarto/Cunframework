package org.cunframework.modules.annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * Spring AOP 判断如果存在这个注解则表明需要写入日志.
 * 
 * 可配合WildcardOfObject类,动态获取对象变量
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogAnnotation {
	/**
	 * 方法类型 对应Log中的opertype
	 * @return
	 */
	String operateType() default "";
	/**
	 * 方法功能 对应Log中的content
	 * @return
	 */
	String operateContent() default "";
	/**
	 * 方法功能 对应Log中的memo
	 * @return
	 */
    String operateDesc() default "";
}