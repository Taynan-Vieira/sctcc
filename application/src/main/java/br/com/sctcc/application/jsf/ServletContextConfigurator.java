package br.com.sctcc.application.jsf;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class ServletContextConfigurator implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("javax.faces.DEFAULT_SUFFIX", ".xhtml");
        servletContext.setInitParameter("facelets.DEVELOPMENT", "false");
        servletContext.setInitParameter("javax.faces.FACELETS_LIBRAR‌​IES", "/WEB-INF/primefaces-ultima.taglib.xml");
        servletContext.setInitParameter("javax.faces.FACELETS_REFRESH_PERIOD", "2");
        servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");
        servletContext.setInitParameter("javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL", "true");
        servletContext.setInitParameter("javax.faces.PARTIAL_STATE_SAVING_METHOD", "true");
        servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Production");
        servletContext.setInitParameter("javax.faces.VALIDATE_EMPTY_FIELDS", "false");
        servletContext.setInitParameter("primefaces.FONT_AWESOME", "true");
        servletContext.setInitParameter("primefaces.THEME", "ultima-indigo");
        servletContext.setInitParameter("primefaces.UPLOADER", "native");
    }
}

