/*
 * ��Ŀ:	spi  
 * �ļ�:	SPI.java  
 * ����:	spi.annotation  
 * ����:	2015��8��22������10:42:06  
 * ��Ȩ��Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.annotation;

/**  
 * ����:	  ע�� SPI <br/>  
 * ����:	   TODO <br/>  
 * ԭ��:	   TODO  <br/>  
 * ����:	   2015��8��22�� ����10:42:06 <br/>  
 * @author chenguangjian  
 * @version    
 * @since  JDK 1.7  
 * @see        
 */

public @interface SPI {
	String value() default ""; // ָ��Ĭ�ϵ���չ��
}
