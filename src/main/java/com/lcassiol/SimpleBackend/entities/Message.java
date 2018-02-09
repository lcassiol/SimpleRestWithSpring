package com.lcassiol.SimpleBackend.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@Entity
@Table(name = "message")
public class Message implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "to")
    @NotEmpty(message = "*Please provide an destinatary")
    private String to;

    @Column(name = "message")
    @NotEmpty(message = "*Message cannot be null")
    private String message;

}
