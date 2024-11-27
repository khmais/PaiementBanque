package com.example.mq_routing_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mq_routing_app.model.Partner;

public interface PartnerRepository extends JpaRepository<Partner, Long> {

}
