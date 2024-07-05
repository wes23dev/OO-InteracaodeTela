/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

//Cada paciente deve ser cadastrado com informações como nome,

import java.util.Objects;

//CPF, data de nascimento, e históricomédico(um texto sobre a saude do paciente).
public class Paciente {
    private String nome;
    private String cpf;
    private String dataNasc;
    private String historicoMedico;

    public Paciente(String nome, String cpf, String dataNasc, String historicoMedico) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.historicoMedico = historicoMedico;
    }
    
    public Paciente() {
        this.nome = "";
        this.cpf = "";
        this.dataNasc = "";
        this.historicoMedico = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.cpf);
        hash = 17 * hash + Objects.hashCode(this.dataNasc);
        hash = 17 * hash + Objects.hashCode(this.historicoMedico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.dataNasc, other.dataNasc)) {
            return false;
        }
        return Objects.equals(this.historicoMedico, other.historicoMedico);
    }
    
    public void imprimir (){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", historicoMedico=" + historicoMedico + '}';
    }
    
    
    
    
    
    
    
}
