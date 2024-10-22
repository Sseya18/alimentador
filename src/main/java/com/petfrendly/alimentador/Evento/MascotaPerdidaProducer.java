package com.petfrendly.alimentador.Evento;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MascotaPerdidaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MascotaPerdidaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarEvento(Long idMascota) {
        kafkaTemplate.send("mascota_perdida", idMascota.toString());
    }
}