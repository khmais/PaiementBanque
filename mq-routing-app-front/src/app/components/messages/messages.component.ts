import { Component, OnInit  } from '@angular/core';
import { MessageService } from '../../services/message.service';

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrl: './messages.component.scss'
})
export class MessagesComponent  implements OnInit {
  messages: any[] = [];
  selectedMessage: any = null;

  constructor(private messageService: MessageService) { }

  ngOnInit(): void {
    this.loadMessages();
  }

  loadMessages(): void {
    this.messageService.getMessages().subscribe(data => {
      this.messages = data;
    });
  }

  selectMessage(message: any): void {
    this.selectedMessage = message;
  }

  closeDetails(): void {
    this.selectedMessage = null;
  }
}
