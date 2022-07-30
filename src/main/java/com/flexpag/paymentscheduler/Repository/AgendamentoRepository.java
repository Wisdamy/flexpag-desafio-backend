package com.flexpag.paymentscheduler.Repository;

import com.flexpag.paymentscheduler.Model.Agendamento;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento,Integer> {

    List<Agendamento> findByStatus(Integer id);

//    Optional<Agendamento> findAllById(Integer id);
}
