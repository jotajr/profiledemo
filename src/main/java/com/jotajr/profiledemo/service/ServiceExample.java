package com.jotajr.profiledemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceExample.class);

    @Value("${ambiente.utilizado}")
    private String ambienteUtilizado;

    public void doSrvice() {

        LOGGER.info("Inicio do servico");

        LOGGER.info("O ambiente utilizado para esta execucao eh {}", ambienteUtilizado);

        LOGGER.info("Final do servico");

    }

}
