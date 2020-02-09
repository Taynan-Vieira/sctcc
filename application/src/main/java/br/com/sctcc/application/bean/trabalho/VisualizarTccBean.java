package br.com.sctcc.application.bean.trabalho;

import br.com.sctcc.application.rewrite.RewriteProvider;
import br.com.sctcc.application.util.WebUtil;
import br.com.sctcc.avaliation.model.Trabalho;
import br.com.sctcc.avaliation.repository.TrabalhoRepository;
import lombok.Data;
import org.ocpsoft.rewrite.faces.navigate.Navigate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Data
@Component
@Scope("view")
public class VisualizarTccBean implements Serializable {

    private static final long serialVersionUID = 1088899847719383016L;

    @Autowired
    private transient TrabalhoRepository trabalhoRepository;

    private Long trabalhoId;

    private Trabalho trabalho;

    private List<Trabalho> trabalhos;

    @PostConstruct
    public void init() {

        trabalho = new Trabalho();

        trabalhos = trabalhoRepository.findAll();

    }

    public Navigate redirecionarParaAvaliacaoTcc() {
        WebUtil.flashScope().put("trabalhoId", trabalhoId);
        return Navigate.to(RewriteProvider.AVALIAR_TCC);
    }

}
