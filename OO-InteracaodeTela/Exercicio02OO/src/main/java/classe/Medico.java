/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

//Cada médico deve ser cadastrado com informações como nome, CRM, especialidade,

import java.util.Objects;

//e horários disponíveis(use string por enquanto) para consulta.
public class Medico {
    private String nome;
    private String CRM;
    private String especialidade;
    private String horarios;

    public Medico(String nome, String CRM, String especialidade, String horarios) {
        this.nome = nome;
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.horarios = horarios;
    }
    
    public Medico() {
        this.nome = "";
        this.CRM = "";
        this.especialidade = "";
        this.horarios = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.CRM);
        hash = 47 * hash + Objects.hashCode(this.especialidade);
        hash = 47 * hash + Objects.hashCode(this.horarios);
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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.CRM, other.CRM)) {
            return false;
        }
        if (!Objects.equals(this.especialidade, other.especialidade)) {
            return false;
        }
        return Objects.equals(this.horarios, other.horarios);
    }
    
    public void imprimir (){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Medico{" + "nome=" + nome + ", CRM=" + CRM + ", especialidade=" + especialidade + ", horarios=" + horarios + '}';
    }
    
    
    
    
    
     
    
    
}
