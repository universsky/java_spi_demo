/*
 * 项目:	spi  
 * 文件:	MainTest.java  
 * 包名:	spi.demo  
 * 日期:	2015年8月22日下午10:56:30  
 * 版权：Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

/**  
 * 类名:	   MainTest <br/>  
 * 功能:	   TODO <br/>  
 * 原因:	   TODO  <br/>  
 * 日期:	   2015年8月22日 下午10:56:30 <br/>  
 * @author chenguangjian  
 * @version    
 * @since  JDK 1.7  
 * @see        
 */

public class MainTest {
	
	/**  
	 * MainTest 构造方法 
	 *    
	 */
	
	public MainTest() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	/**   
	 * 功能描述: TODO <br/>  
	 * 适用条件: TODO <br/>  
	 * 执行流程: TODO <br/>  
	 * 使用方法: TODO <br/>  
	 * 注意事项: TODO <br/>  
	 * 
	 * @author chenguangjian  
	 * @date:  2015年8月22日 下午10:56:30 <br/>  
	 * @param args  
	 * @since JDK 1.7  
	 */
	public static void main(String[] args) {
		
		ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class);
		Iterator<Search> iterator = serviceLoader.iterator();
		if (iterator.hasNext()) {
			Search s = iterator.next();
			s.search("Jacky");
		}
		// 不用spi
		Search<Object> imageSearch = new ImageSearch<Object>();
		imageSearch.search("Rosey");
		
	}
	
}
