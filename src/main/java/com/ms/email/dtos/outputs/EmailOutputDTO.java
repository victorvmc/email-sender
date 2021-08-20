package com.ms.email.dtos.outputs;

import com.ms.email.entities.EmailEntity;
import com.ms.email.enums.EmailStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class EmailOutputDTO {

    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    private String text;
    private LocalDateTime sendDateEmail;
    private EmailStatus statusEmail;

    public EmailOutputDTO(EmailEntity emailEntity) {
        this.ownerRef = emailEntity.getOwnerRef();
        this.emailFrom = emailEntity.getEmailFrom();
        this.emailTo = emailEntity.getEmailTo();
        this.subject = emailEntity.getSubject();
        this.text = emailEntity.getText();
        this.sendDateEmail = emailEntity.getSendDateEmail();
        this.statusEmail = emailEntity.getStatusEmail();
    }
}
