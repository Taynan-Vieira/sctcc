package br.com.sctcc.application.rewrite;


import org.ocpsoft.rewrite.annotation.RewriteConfiguration;
import org.ocpsoft.rewrite.config.Configuration;
import org.ocpsoft.rewrite.config.ConfigurationBuilder;
import org.ocpsoft.rewrite.servlet.config.HttpConfigurationProvider;
import org.ocpsoft.rewrite.servlet.config.rule.Join;

import javax.servlet.ServletContext;

@RewriteConfiguration
public class RewriteProvider extends HttpConfigurationProvider {

    public static final String DASHBOARD = "/";
    public static final String VISUALIZAR_TCCS = "/visualizarTccs";
    public static final String AVALIAR_TCC = "/avaliarTcc";
    public static final String LOGIN = "/login";
    public static final String ERROR = "/error500";
    public static final String ERROR_404 = "/error404";
    public static final String ACESSO_NEGADO = "/acessoNegado";

    @Override
    public Configuration getConfiguration(final ServletContext servletContext) {
        return ConfigurationBuilder
                .begin()
                .addRule(Join.path(DASHBOARD).to("/page/public/dashboard.xhtml"))
                //TCC
                .addRule(Join.path(VISUALIZAR_TCCS).to("/page/private/tcc/visualizar-tccs.xhtml"))
                .addRule(Join.path(AVALIAR_TCC).to("/page/private/tcc/avaliar-tcc.xhtml"))
                //LOGIN
                .addRule(Join.path(LOGIN).to("/page/public/login.xhtml"))
                //ACESSO NEGADO
                .addRule(Join.path(ACESSO_NEGADO).to("/page/public/acesso-negado.xhtml"))
                //ERRORS
                .addRule(Join.path(ERROR).to("/error.xhtml"))
                .addRule(Join.path(ERROR_404).to("/error-404.xhtml"));

    }

    @Override
    public int priority() {
        return 10;
    }
}
