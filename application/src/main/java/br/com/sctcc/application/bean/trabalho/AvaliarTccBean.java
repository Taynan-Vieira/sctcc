package br.com.sctcc.application.bean.trabalho;

import br.com.sctcc.application.util.WebUtil;
import br.com.sctcc.avaliation.model.Avaliacao;
import br.com.sctcc.avaliation.model.AvaliacaoItem;
import br.com.sctcc.avaliation.model.TipoAvaliacao;
import br.com.sctcc.avaliation.model.TrabalhoProfessor;
import br.com.sctcc.avaliation.repository.AvaliacaoItemRepository;
import br.com.sctcc.avaliation.repository.AvaliacaoRepository;
import br.com.sctcc.avaliation.repository.TipoAvaliacaoRepository;
import br.com.sctcc.avaliation.repository.TrabalhoProfessorRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Data
@Component
@Scope("view")
public class AvaliarTccBean implements Serializable {

    private static final long serialVersionUID = -2680054683722008054L;

    @Autowired
    private transient AvaliacaoRepository avaliacaoRepository;
    @Autowired
    private  transient AvaliacaoItemRepository avaliacaoItemRepository;
    @Autowired
    private transient TrabalhoProfessorRepository trabalhoProfessorRepository;
    @Autowired
    private transient TipoAvaliacaoRepository tipoAvaliacaoRepository;

    public Avaliacao avaliacao;
    public AvaliacaoItem avaliacaoItem;
    public TipoAvaliacao tipoAvaliacao;
    public TrabalhoProfessor trabalhoProfessor;

    private List<Double> notasConteudo = Arrays.asList(0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0);
    private List<Double> notasRedacao = Arrays.asList(0.5, 1.0, 1.5, 2.0, 2.5, 3.0);
    private List<Double> notasNormalizacao = Arrays.asList(0.5, 1.0, 1.5, 2.0);

    private List<Double> notasCapacitacaoExposicao = Arrays.asList(0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0);
    private List<Double> notasRespostasArguicoes= Arrays.asList(0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0);
    private List<Double> notasPrevisaoDeTempo= Arrays.asList(0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0);


    @PostConstruct
    public void init(){

        trabalhoProfessor = new TrabalhoProfessor();
        if (WebUtil.flashScope().get("trabalhoId") != null) {
            trabalhoProfessor = trabalhoProfessorRepository.getOne((Long) WebUtil.flashScope().get("trabalhoId"));
        }

    }
}
