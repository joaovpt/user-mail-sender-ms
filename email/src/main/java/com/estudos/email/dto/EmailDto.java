package com.estudos.email.dto;

import java.util.UUID;

public record EmailDto(
        UUID id,
        String subject,
        String body
) {
}
