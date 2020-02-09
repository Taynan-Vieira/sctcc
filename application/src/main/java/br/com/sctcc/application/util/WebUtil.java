package br.com.sctcc.application.util;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import java.io.Serializable;

public class WebUtil implements Serializable {

    private static final long serialVersionUID = -9119650817704150095L;

    public static FacesContext getContext() {
        return FacesContext.getCurrentInstance();
    }

    public static Flash flashScope() {
        return (FacesContext.getCurrentInstance().getExternalContext().getFlash());
    }

}
