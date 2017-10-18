package cn.geekview.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};//返回的带有@Configuration注解的类将会用来配置ContextLoaderListener创建的应用上下文中的bean。
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};//返回的带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的bean。
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
