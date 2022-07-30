package com.flexpag.paymentscheduler;

import com.flexpag.paymentscheduler.Model.Agendamento;
import com.flexpag.paymentscheduler.Repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.PayloadApplicationEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootApplication
public class PaymentSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentSchedulerApplication.class, args);
	}
}

