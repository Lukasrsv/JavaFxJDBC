/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lukas
 */
public class Empresa {
    private String id;
    private String nome;
    private String cnpj;
    private String email;
    
    public Empresa(){
    
    }

    public Empresa(String id, String nome, String cnpj, String email) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   
    
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
