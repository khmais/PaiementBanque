package com.example.mq_routing_app.controller;

 
import com.example.mq_routing_app.dto.PartnerDTO;
import com.example.mq_routing_app.model.Partner;
import com.example.mq_routing_app.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partners")
@CrossOrigin(origins = "http://localhost:4200")
public class PartnerController {

    @Autowired
    private PartnerService partnerService;

    @GetMapping
    public List<PartnerDTO> getPartners() {
        return partnerService.getAllPartners();
    }

    @PostMapping
    public void addPartner(@RequestBody Partner partner) {
        partnerService.addPartner(partner);
    }

    @DeleteMapping("/{id}")
    public void deletePartner(@PathVariable Long id) {
        partnerService.deletePartner(id);
    }
}
