package sample.annotation;

import java.lang.reflect.Field;

public class InsertDataAnnotationHandler {
	public static <T> void process(T targetObj) {
		System.out.println(targetObj.getClass().getName());
		
		Field[] fields = targetObj.getClass().getDeclaredFields();
		System.out.println(fields[0].getName());
		
		if(fields != null && fields.length != 0) {
			InsertIntData annotation;
			
			for (Field field : fields) {
				System.out.println(field);
				annotation = field.getAnnotation(InsertIntData.class);
			
				if(annotation != null && field.getType() == int.class) {
					field.setAccessible(true);
					
					try {
						field.set(targetObj, annotation.data());
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
