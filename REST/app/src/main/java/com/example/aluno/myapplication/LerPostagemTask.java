package com.example.aluno.myapplication;

import android.os.AsyncTask;

import feign.Feign;
import feign.gson.GsonDecoder;

/**
 * Created by aluno on 18/05/2017.
 */

// obrigação usar este extends para classes que vao comunicar com internet
// <tipo do dado, monitoramento, onde vai receber 'classe'>

public class LerPostagemTask extends AsyncTask<Integer, Void, Postagem> {

    // neste metodo deve haver o codigo de chamada para internet
    @Override
    protected Postagem doInBackground(Integer... params) {
        try{
            //1. usando o Feign para fazer uma chamada a uma API REST
            // código padrao do feign para fazer uma chamada
            PostagemRequest request = Feign.builder().decoder(new GsonDecoder()).target(PostagemRequest.class,
                    "http://jsonplaceholder.typicode.com");

            //2. fazendo a chamada e recuperando o objeto convertido
            Postagem postagem = request.getPostagem(params[0]);

            return postagem;

        }catch (Exception e){ // se der alguma coisa errada
            System.err.println("Erro: "+e.getMessage());
            //e.printStackTrace();
            return null;
        }
    }
}
