package Utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class FormUtil {
	
	@SuppressWarnings("unchecked")
	public static <T> T toModel(Class<T> model, HttpServletRequest request) {
		T object = null;
		try {
			object = model.newInstance();
			BeanUtils.populate(object, request.getParameterMap());
			//lấy các tham số truyền vào và gáng vào một đối tượng object
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
			System.out.print(e.getMessage());
		}
		return object;
	}
}
