package org.cunframework.modules.annotation.geometry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.cunframework.modules.annotation.db.IndexType;


/**
 * 由于hibernate空间列不能具体指定类型(点,线,面...),
 * 建立一个注释在具体的列上加以标注
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)   
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface GeometryColumn {
	/**
	 * 类型
	 * @return
	 */
	public GeometryType type() default GeometryType.POINT;
	
	/**
	 * 列名
	 * @return
	 */
	public String column();
	
	/**
	 * 索引类型 btree gist 
	 * @return
	 */
	public IndexType index() default IndexType.NONE;
}
