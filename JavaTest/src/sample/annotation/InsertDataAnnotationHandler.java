package sample.annotation;

import java.lang.reflect.Field;

public class InsertDataAnnotationHandler {
	public static <T> void process(T targetObj) {
		System.out.println(targetObj.getClass().getName());
		
		Field[] fields = targetObj.getClass().getDeclaredFields();
		System.out.println(fields[0].getType());
		
			if(fields != null && fields.length != 0) {
				InsertIntData annotation;
				for (Field field : fields) {
					System.out.println(field);
					annotation = field.getAnnotation(InsertIntData.class);
					System.out.println(annotation);
					if(annotation != null && field.getType() == int.class) {
						field.setAccessible(true);
						try {
							field.set(targetObj,  annotation.data());
						} catch(IllegalArgumentException e) {
							e.printStackTrace();
						} catch(IllegalAccessException e) {
							e.printStackTrace();
						}
					}
				}
			}
	}
}
