package com.ms.email.dtos.inputs;

import com.ms.email.enums.EmailStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class EmailInputDTO {

    @NotBlank
    private String ownerRef;
    @NotBlank@Email
    private String emailFrom;
    @NotBlank@Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
