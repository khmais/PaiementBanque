package com.example.mq_routing_app.service;

import com.example.mq_routing_app.dto.PartnerDTO;
import com.example.mq_routing_app.model.Partner;
import com.example.mq_routing_app.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartnerService {

    @Autowired
    private PartnerRepository partnerRepository;

    public List<PartnerDTO> getAllPartners() {
        List<Partner> partners = partnerRepository.findAll();
        return partners.stream().map(partner -> {
            PartnerDTO dto = new PartnerDTO();
            dto.setId(partner.getId());
            dto.setAlias(partner.getAlias());
            dto.setType(partner.getType());
            dto.setDirection(partner.getDirection());
            dto.setApplication(partner.getApplication());
            dto.setProcessedFlowType(partner.getProcessedFlowType());
            dto.setDescription(partner.getDescription());
            return dto;
        }).collect(Collectors.toList());
    }

    public void addPartner(Partner partner) {
        partnerRepository.save(partner);
    }

    public void deletePartner(Long id) {
        partnerRepository.deleteById(id);
    }
}
