package com.avanade.decolatech.rh.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CargosDto {
    @JsonProperty("id")
    private int idCargo;

    @JsonProperty("area")
    private String descricaoArea;

    @JsonProperty("cargo")
    private String descricaoCargo;

    private double salario;

    private String tipo;

    public CargosDto(int id, String area, String cargo, double salario, String tipo) {
        this.setIdCargo(idCargo);
        this.setDescricaoArea(area);
        this.setDescricaoCargo(cargo);
        this.setSalario(salario);
        this.setTipo(tipo);
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getDescricaoArea() {
        return descricaoArea;
    }

    public void setDescricaoArea(String descricaoArea) {
        this.descricaoArea = descricaoArea;
    }

    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
