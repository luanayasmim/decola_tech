package com.avanade.decolatech.rh.common;

import java.util.Date;

public class Resposta {
    private int codigo;
    private Date data;
    private String mensagem;

    public Resposta(int codigo, Date data, String mensagem) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setMensagem(mensagem);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
