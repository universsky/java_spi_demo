/*
 * ��Ŀ:	spi  
 * �ļ�:	FileSearch.java  
 * ����:	spi.demo  
 * ����:	2015��8��22������10:50:25  
 * ��Ȩ��Copyright (c) 2015, qjdchina.com All Rights Reserved.  
 *  
 */

package spi.demo;

import java.util.List;

/**  
 * ����:	   FileSearch <br/>  
 * ����:	   TODO <br/>  
 * ԭ��:	   TODO  <br/>  
 * ����:	   2015��8��22�� ����10:50:25 <br/>  
 * @author chenguangjian  
 * @version    
 * @since  JDK 1.7  
 * @see        
 */

public class FileSearch<T> implements Search<T> {
	
	/**  
	 * FileSearch ���췽�� 
	 *    
	 */
	
	public FileSearch() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	/**  
	 * ʵ�ֹ���:TODO 
	 * @see spi.demo.Search#search(java.lang.String)  
	 */
	public List<T> search(String word) {
		
		// TODO Auto-generated method stub
		System.out.println("FIle Searching ...." + word);
		return null;
	}
	
}
