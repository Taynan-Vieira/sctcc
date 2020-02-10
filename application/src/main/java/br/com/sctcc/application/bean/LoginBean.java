package br.com.sctcc.application.bean;

import br.com.sctcc.application.util.WebUtil;
import org.omnifaces.util.Messages;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Map;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 7418434799368738267L;

	public void login() {

	}

	public void preRender() {
		HttpServletRequest request = (HttpServletRequest) WebUtil.getContext().getExternalContext().getRequest();
		Map<String, String> a = WebUtil.getContext().getExternalContext().getRequestParameterMap();
		if ("true".equals(request.getParameter("invalid"))) {
			Messages.addGlobalError("Usuário ou senha inválido.");
		}
	}

}

