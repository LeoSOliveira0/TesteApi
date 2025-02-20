package org.aplicacao;



import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.sevico.ApiServico;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        ApiServico apiServico = new ApiServico();
        try {

            EnderecoDto enderecoDto = apiServico.getEndereco("91790010");
            System.out.println(enderecoDto.getLogradouro());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}