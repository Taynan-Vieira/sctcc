package br.com.sctcc.application.bean.trabalho;

import br.com.sctcc.avaliation.model.TrabalhoProfessor;
import br.com.sctcc.avaliation.repository.TrabalhoProfessorRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;

@Data
@Component
@Scope("view")
public class AvaliarTccBean implements Serializable {

    private static final long serialVersionUID = -2680054683722008054L;

    @Autowired
    private transient TrabalhoProfessorRepository trabalhoProfessorRepository;

    public TrabalhoProfessor trabalhoProfessor;

    @PostConstruct
    public void init(){

    }
}
