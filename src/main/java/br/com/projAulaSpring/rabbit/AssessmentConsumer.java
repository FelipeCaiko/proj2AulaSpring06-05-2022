package br.com.projAulaSpring.rabbit;

import br.com.projAulaSpring.model.Assessment;
import br.com.projAulaSpring.service.AssessmentService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class AssessmentConsumer {

    @Autowired
    private AssessmentService assessmentService;

    @RabbitListener(queues = {"${queue.assessment.name}"})
    public void receive (@Payload Assessment assessment){
        System.out.println("Id: "+ assessment.getId() + "\nDescrição: " + assessment.getDescription() + "\nData: " + assessment.getDate() + "\nNumero do Estudante: " + assessment.getNumberOfStudent());
        //Inserir dado no Mongo
        assessmentService.save(assessment);
    }
}