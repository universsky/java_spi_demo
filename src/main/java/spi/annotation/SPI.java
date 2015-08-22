/*
 * 项目:	spi  
 * 文件:	SPI.java  
 * 包名:	spi.annotation  
 * 日期:	2015年8月22日下午10:42:06  
 * 版权：Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.annotation;

/**  
 * 类名:	  注解 SPI <br/>  
 * 功能:	   TODO <br/>  
 * 原因:	   TODO  <br/>  
 * 日期:	   2015年8月22日 下午10:42:06 <br/>  
 * @author chenguangjian  
 * @version    
 * @since  JDK 1.7  
 * @see        
 */

public @interface SPI {
	String value() default ""; // 指定默认的扩展点
}
