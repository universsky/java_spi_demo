/*
 * 项目:	spi  
 * 文件:	Search.java  
 * 包名:	spi.demo  
 * 日期:	2015年8月22日下午10:47:17  
 * 版权：Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.demo;

import java.util.List;

/**  
 * 类名:	   Search <br/>  
 * 功能:	   TODO <br/>  
 * 原因:	   TODO  <br/>  
 * 日期:	   2015年8月22日 下午10:47:17 <br/>  
 * @author chenguangjian  
 * @version    
 * @param <T>
 * @since  JDK 1.7  
 * @see        
 */

public interface Search<T> {
	List<T> search(String word);
}
