package com.example.aluno.myapplication;

import feign.Param;
import feign.RequestLine;

/**
 * Created by aluno on 18/05/2017.
 */

public interface PostagemRequest {

    @RequestLine("GET /posts/{id}/") // ensinando o feign como fazer a chamada
    Postagem getPostagem(@Param("id") Integer id); //


}
