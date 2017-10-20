package cn.geekview.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * 添加其他Filter以及Servlet
 */
public class MyInitializer implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        FilterRegistration.Dynamic encodingFilter =  servletContext.addFilter("encodingFilter",CharacterEncodingFilter.class);
        encodingFilter.setInitParameter("encoding","UTF-8");
        encodingFilter.setInitParameter("forceEncoding","true");
        encodingFilter.addMappingForUrlPatterns(null,false, "/*");


    }
}
