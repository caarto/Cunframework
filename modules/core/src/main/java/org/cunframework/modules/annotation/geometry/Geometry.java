package org.cunframework.modules.annotation.geometry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 由于hibernate空间列不能具体指定类型(点,线,面...),
 * 在类上加以标注
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.TYPE)
public @interface Geometry {
	/**
	 * column
	 * @return
	 */
	public String[] column() default "geometry";
	
	/**
	 * 类型
	 * @return
	 */
	public GeometryType[] type() default GeometryType.POINT;
}
