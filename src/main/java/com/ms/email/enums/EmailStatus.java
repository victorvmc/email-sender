package com.ms.email.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EmailStatus {

    SENT(1, "Enviado"),
    ERROR(2, "Erro");

    private Integer code;
    private String description;

}
