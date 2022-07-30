package com.flexpag.paymentscheduler.Controller;

import com.flexpag.paymentscheduler.Model.Agendamento;
import com.flexpag.paymentscheduler.Service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AgendamentoController {

    @Autowired
    AgendamentoService agendamentoService;

     @PostMapping("/incluir")
    public Integer incluirAgendamento(@RequestBody Agendamento agendamento){
      agendamentoService.incluirAgendamento(agendamento);
      return agendamento.getId();
     }
     @GetMapping("/consultar/{id}")
    public Optional<Agendamento> consultaStatus(@PathVariable("id") Integer id){
         return agendamentoService.buscarStatus(id);
     }
     @DeleteMapping("/delete/{id}")
    public void deletarAgendamento (@PathVariable("id")Integer id){
         agendamentoService.deletarAgendamento(id);
     }
     @PutMapping("/atualizar/{id}")
    public Agendamento atualizarAgendamento (@PathVariable("id") @RequestBody Agendamento agendamento){
       return agendamentoService.atualizarAgendamento(agendamento.getId(),agendamento);
     }

}
