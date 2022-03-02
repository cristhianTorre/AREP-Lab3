package edu.escuelaing.arep.app.framework;

import edu.escuelaing.arep.app.annotation.Web;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WebLoader {

    private Map<String, Method> urlMethod;

    public WebLoader() {
        urlMethod = new HashMap<>();
    }

    public void init() {
        String webPackage = "edu.escuelaing.arep.app.web";
        Reflections reflections = new Reflections(webPackage, new SubTypesScanner(false));
        Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
        for (Class cls : allClasses) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Web.class)) {
                    urlMethod.put(method.getAnnotation(Web.class).value(), method);
                }
            }
        }
    }

    public boolean isResourcePresent(String resource) {
        return urlMethod.containsKey(resource);
    }

    public String getResource(String resource) {
        String res = null;
        try {
            res = (String) urlMethod.get(resource).invoke(null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.out.println("Error invoking method");
            res = "ERROR";
        }
        return res;
    }
}
