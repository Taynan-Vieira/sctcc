package br.com.sctcc.application.bean;

import br.com.sctcc.application.rewrite.RewriteProvider;
import org.ocpsoft.rewrite.faces.navigate.Navigate;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope("session")
public class SessionBean implements Serializable {

    private static final long serialVersionUID = 1354308799917731143L;

    public Navigate navigateToDashboard() {
        return Navigate.to(RewriteProvider.DASHBOARD);
    }

    public Navigate navigateToVisualizarTccs() {
        return Navigate.to(RewriteProvider.VISUALIZAR_TCCS);
    }

    public Navigate navigateToError() {
        return Navigate.to(RewriteProvider.ERROR);
    }

    public Navigate navigateTo404Error() {
        return Navigate.to(RewriteProvider.ERROR_404);
    }
}
