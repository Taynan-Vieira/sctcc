package br.com.sctcc.application.bean.trabalho;

import br.com.sctcc.avaliation.model.Trabalho;
import br.com.sctcc.avaliation.model.TrabalhoProfessor;
import br.com.sctcc.avaliation.repository.TrabalhoProfessorRepository;
import br.com.sctcc.avaliation.repository.TrabalhoRepository;
import lombok.Data;
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
    private transient TrabalhoProfessorRepository trabalhoProfessorRepository;

    private TrabalhoProfessor trabalhoProfessor;

    private List<TrabalhoProfessor> trabalhoProfessores;

    @PostConstruct
    public void init(){

        trabalhoProfessor = new TrabalhoProfessor();
        trabalhoProfessores = trabalhoProfessorRepository.findAll();
    }

}
