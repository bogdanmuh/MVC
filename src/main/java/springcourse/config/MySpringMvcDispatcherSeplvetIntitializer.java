package springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherSeplvetIntitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return  null;
    }// этот метод использовать не будем поэтому возвращаем нулл

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
        //это путь до Applicationcontext или в нашем случаем он представляеться в виде SpringConfig
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
        // все http-запросы посылаем на dispatcherservlet
    }
}
