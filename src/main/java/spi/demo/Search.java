/*
 * ��Ŀ:	spi  
 * �ļ�:	Search.java  
 * ����:	spi.demo  
 * ����:	2015��8��22������10:47:17  
 * ��Ȩ��Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.demo;

import java.util.List;

/**  
 * ����:	   Search <br/>  
 * ����:	   TODO <br/>  
 * ԭ��:	   TODO  <br/>  
 * ����:	   2015��8��22�� ����10:47:17 <br/>  
 * @author chenguangjian  
 * @version    
 * @param <T>
 * @since  JDK 1.7  
 * @see        
 */

public interface Search<T> {
	List<T> search(String word);
}
