/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalejc.entidade;

/**
 *
 * @author Thalles Belo
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private Integer dnascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getDnascimento() {
        return dnascimento;
    }

    public void setDnascimento(Integer dnascimento) {
        this.dnascimento = dnascimento;
    }
    
    
}
