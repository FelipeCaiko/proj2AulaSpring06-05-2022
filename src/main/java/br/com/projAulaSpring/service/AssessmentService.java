package br.com.projAulaSpring.service;

import br.com.projAulaSpring.model.Assessment;
import br.com.projAulaSpring.repository.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssessmentService {

    @Autowired
    private AssessmentRepository assessmentRepository;

    //@Autowired
    //private AssessmentProducer assessmentProducer;

    //public void sendAssessmentRabbit(Assessment assessment){
      //  assessmentProducer.send(assessment);
    //}
    public void save(Assessment assessment){
        assessmentRepository.save(assessment);
    }
    public List<Assessment> findAll(){
        return assessmentRepository.findAll();
    }
    public Optional<Assessment> findById(String id){
        return assessmentRepository.findById(id);
    }
    public void delete(String id){
        assessmentRepository.deleteById(id);
    }
    public void deleteAll(){
        assessmentRepository.deleteAll();
    }
}