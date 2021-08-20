package com.ms.email.entities;

import com.ms.email.dtos.inputs.EmailInputDTO;
import com.ms.email.enums.EmailStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Getter@Setter
@Table(name = "tb_email")
public class EmailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    @Enumerated(EnumType.STRING)
    private EmailStatus statusEmail;

    public EmailEntity(EmailInputDTO emailInputDTO){
        this.ownerRef = emailInputDTO.getOwnerRef();
        this.emailFrom = emailInputDTO.getEmailFrom();
        this.emailTo = emailInputDTO.getEmailTo();
        this.subject = emailInputDTO.getSubject();
        this.text = emailInputDTO.getText();
    }

}
