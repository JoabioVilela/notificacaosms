package com.joabio.notificacaosms.domain;

import com.joabio.notificacaosms.enums.Category;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private Long id;

    private String name;

    private String cpf;

    private String telefone;

    private Category category;

    private Set<Ticket> tickets = new HashSet<>();

}
