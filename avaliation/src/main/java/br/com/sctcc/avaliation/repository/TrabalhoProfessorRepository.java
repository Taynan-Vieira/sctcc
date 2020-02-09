package br.com.sctcc.avaliation.repository;

import br.com.sctcc.avaliation.model.Aluno;
import br.com.sctcc.avaliation.model.Professor;
import br.com.sctcc.avaliation.model.Trabalho;
import br.com.sctcc.avaliation.model.TrabalhoProfessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrabalhoProfessorRepository extends JpaRepository<TrabalhoProfessor, Long> {

   /* @Query(value = "select al.nome, tra.tema, tra.status, prof.nome from TrabalhoProfessor  traprf Aluno al " +
            "inner join Trabalho  tra on al.id = tra.aluno.id " +
            "inner join on tra.id = traprf.trabalho.id " +
            "inner join Professor prof on prof.id = traprf.professor.id " +
            "where (lower(traprf.examinador) like lower(concat('%NAO%') )")
    List<TrabalhoProfessor> findTrabalhoProfessorsByAluno();*/
}
