package org.cunframework.modules.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated 使用Ehcache缓存对像注解
 * <p>更好的方法是通过使用spring提供的缓存注解来管理</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.METHOD })
@Documented
public @interface Ehcache {
	/**
	 * 缓存名称,默认为空
	 * @return
	 */
	String cacheName() default "";

	/**
	 * 删除指定的缓存
	 * @return
	 */
	String evict() default "";
	
	/**
	 * 临时缓存还是永久缓存，默认为永久缓存
	 * @return
	 */
	boolean eternal() default true;
}
