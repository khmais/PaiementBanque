import { Component, OnInit  } from '@angular/core';
import { PartnerService } from '../../services/partner.service';


@Component({
  selector: 'app-partners',
  templateUrl: './partners.component.html',
  styleUrl: './partners.component.scss'
})
export class PartnersComponent implements OnInit {

  partners: any[] = [];

  newPartner: any = {
    alias: '',
    type: '',
    direction: '',
    application: '',
    processedFlowType: '',
    description: ''
  };

  constructor(private partnerService: PartnerService) { }

  ngOnInit(): void {
    this.loadPartners();
  }

  loadPartners(): void {
    this.partnerService.getPartners().subscribe(data => {
      this.partners = data;
    });
  }

  addPartner(): void {
    this.partnerService.addPartner(this.newPartner).subscribe(() => {
      this.loadPartners();
      this.resetNewPartner();
    });
  }

  removePartner(alias: string): void {
    this.partnerService.deletePartner(alias).subscribe(() => {
      this.loadPartners();
    });
  }

  resetNewPartner(): void {
    this.newPartner = {
      alias: '',
      type: '',
      direction: '',
      application: '',
      processedFlowType: '',
      description: ''
    };
  }
}
