/*
 * ��Ŀ:	spi  
 * �ļ�:	MainTest.java  
 * ����:	spi.demo  
 * ����:	2015��8��22������10:56:30  
 * ��Ȩ��Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

/**  
 * ����:	   MainTest <br/>  
 * ����:	   TODO <br/>  
 * ԭ��:	   TODO  <br/>  
 * ����:	   2015��8��22�� ����10:56:30 <br/>  
 * @author chenguangjian  
 * @version    
 * @since  JDK 1.7  
 * @see        
 */

public class MainTest {
	
	/**  
	 * MainTest ���췽�� 
	 *    
	 */
	
	public MainTest() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	/**   
	 * ��������: TODO <br/>  
	 * ��������: TODO <br/>  
	 * ִ������: TODO <br/>  
	 * ʹ�÷���: TODO <br/>  
	 * ע������: TODO <br/>  
	 * 
	 * @author chenguangjian  
	 * @date:  2015��8��22�� ����10:56:30 <br/>  
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
		// ����spi
		Search<Object> imageSearch = new ImageSearch<Object>();
		imageSearch.search("Rosey");
		
	}
	
}
