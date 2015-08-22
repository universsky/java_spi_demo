/*
 * 项目:	spi  
 * 文件:	FileSearch.java  
 * 包名:	spi.demo  
 * 日期:	2015年8月22日下午10:50:25  
 * 版权：Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.demo;

import java.util.List;

/**  
 * 类名:	   FileSearch <br/>  
 * 功能:	   TODO <br/>  
 * 原因:	   TODO  <br/>  
 * 日期:	   2015年8月22日 下午10:50:25 <br/>  
 * @author chenguangjian  
 * @version    
 * @since  JDK 1.7  
 * @see        
 */

public class FileSearch<T> implements Search<T> {
	
	/**  
	 * FileSearch 构造方法 
	 *    
	 */
	
	public FileSearch() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	/**  
	 * 实现功能:TODO 
	 * @see spi.demo.Search#search(java.lang.String)  
	 */
	public List<T> search(String word) {
		
		// TODO Auto-generated method stub
		System.out.println("FIle Searching ...." + word);
		return null;
	}
	
}
