/*
 * ��Ŀ:	spi  
 * �ļ�:	ImageSearch.java  
 * ����:	spi.demo  
 * ����:	2015��8��22������10:51:20  
 * ��Ȩ��Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.demo;

import java.util.List;

/**  
 * ����:	   ImageSearch <br/>  
 * ����:	   TODO <br/>  
 * ԭ��:	   TODO  <br/>  
 * ����:	   2015��8��22�� ����10:51:20 <br/>  
 * @author chenguangjian  
 * @version    
 * @since  JDK 1.7  
 * @see        
 */

public class ImageSearch<T> implements Search<T> {
	
	/**  
	 * ImageSearch ���췽�� 
	 *    
	 */
	
	public ImageSearch() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	/**  
	 * ʵ�ֹ���:TODO 
	 * @see spi.demo.Search#search(java.lang.String)  
	 */
	public List<T> search(String word) {
		
		// TODO Auto-generated method stub
		System.out.println("Image Searching ...." + word);
		return null;
	}
	
}
