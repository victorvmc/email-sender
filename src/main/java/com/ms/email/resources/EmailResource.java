package com.ms.email.resources;

import com.ms.email.dtos.inputs.EmailInputDTO;
import com.ms.email.dtos.outputs.EmailOutputDTO;
import com.ms.email.entities.EmailEntity;
import com.ms.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("email")
public class EmailResource {

    @Autowired
    private EmailService emailService;

    @PostMapping("")
    private ResponseEntity<EmailOutputDTO> sendingEmail(@RequestBody @Valid EmailInputDTO email){

        EmailEntity emailEntity = new EmailEntity(email);
        EmailEntity emailSent = emailService.sendEmail(emailEntity);

        return new ResponseEntity<EmailOutputDTO>(new EmailOutputDTO(emailSent),  HttpStatus.CREATED);
    }
}
