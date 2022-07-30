package com.flexpag.paymentscheduler.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
public class Agendamento  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String status = "pending";
    private String nome;
    private String banco;
    private Double valor;
    private String data;

}
