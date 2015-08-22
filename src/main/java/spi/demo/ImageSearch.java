/*
 * 项目:	spi  
 * 文件:	ImageSearch.java  
 * 包名:	spi.demo  
 * 日期:	2015年8月22日下午10:51:20  
 * 版权：Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.demo;

import java.util.List;

/**  
 * 类名:	   ImageSearch <br/>  
 * 功能:	   TODO <br/>  
 * 原因:	   TODO  <br/>  
 * 日期:	   2015年8月22日 下午10:51:20 <br/>  
 * @author chenguangjian  
 * @version    
 * @since  JDK 1.7  
 * @see        
 */

public class ImageSearch<T> implements Search<T> {
	
	/**  
	 * ImageSearch 构造方法 
	 *    
	 */
	
	public ImageSearch() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	/**  
	 * 实现功能:TODO 
	 * @see spi.demo.Search#search(java.lang.String)  
	 */
	public List<T> search(String word) {
		
		// TODO Auto-generated method stub
		System.out.println("Image Searching ...." + word);
		return null;
	}
	
}
