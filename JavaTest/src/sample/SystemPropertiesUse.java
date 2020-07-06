package sample;

import java.util.Enumeration;
import java.util.Properties;

public class SystemPropertiesUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties sp= System.getProperties();
		System.out.println(sp);
		//java.runtime.name=Java(TM) SE Runtime Environment
		//
		//  key : value 
		//  key를 자동으로 sp에서 가져온다
		//sp.getProperty(key)
		Enumeration<Object> keys= sp.keys();
		sp.propertyNames();
		Enumeration<String> names= (Enumeration<String>)sp.propertyNames();
		/*
		 * 
		 *  for (Enumeration<E> e = v.elements(); e.hasMoreElements();)
       				System.out.println(e.nextElement());
		 * for(   :    ){
		 *    XXXXXXX
		 * }
		 * for( ; ; ) {
		 * 
		 * }
		 */
		String key,value;
		
		while(keys.hasMoreElements()) {
			//System.out.println(keys.nextElement());
			key=keys.nextElement().toString();
			value = sp.getProperty(key);
			System.out.println(key+" = "+value);
		}
		System.out.println();
		
		while(names.hasMoreElements()) {
			//System.out.println(names.nextElement());
			key=names.nextElement();
			value = sp.getProperty(key);
			System.out.println(key+" = "+value);
		}
		
		
		
		
		
	}

}





