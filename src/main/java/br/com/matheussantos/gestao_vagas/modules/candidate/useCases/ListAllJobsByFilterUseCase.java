package br.com.matheussantos.gestao_vagas.modules.candidate.useCases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.matheussantos.gestao_vagas.modules.company.entities.JobEntity;
import br.com.matheussantos.gestao_vagas.modules.company.repositories.JobRepository;

public class ListAllJobsByFilterUseCase {

    @Autowired
    private JobRepository jobRepository;

    public List<JobEntity> execute(String filter) {
        return this.jobRepository.findByDescriptionContaining(filter);
    }
}
