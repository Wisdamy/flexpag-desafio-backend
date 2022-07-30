package com.flexpag.paymentscheduler.Service;

import com.flexpag.paymentscheduler.Model.Agendamento;
import com.flexpag.paymentscheduler.Repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    AgendamentoRepository agendamentoRepository;


    public Agendamento incluirAgendamento(Agendamento agendamento){
         return agendamentoRepository.save (agendamento);
    }
    public Optional<Agendamento> buscarStatus (@RequestParam Integer id){
        return agendamentoRepository.findById(id);
    }
    public void deletarAgendamento(@RequestParam Integer id){
         agendamentoRepository.deleteById(id);
    }
    public Agendamento atualizarAgendamento( Integer id, Agendamento agendamento){
        return agendamentoRepository.save(agendamento);
    }

    }
