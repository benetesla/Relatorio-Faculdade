package software.engenharia.client.clientinfo;

import lombok.Data;

@Data
public class Cliente {
    
    private String nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}   
