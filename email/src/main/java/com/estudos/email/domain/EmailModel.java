package com.estudos.email.domain;

import com.estudos.email.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_EMAIL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {

    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailTo;
    private String emailFrom;
    private String emailSubject;
    @Column(columnDefinition = "TEXT")
    private String body;
    private LocalDateTime sendDateEmail;
    private EmailStatus statusEmail;


}
