/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.Objects;

/**
 *
 * @author Windows
 */
public class Produto {
    private String nomeProd;
    private String id;
    private Double preco;
    private Double custo;

    

    public Produto(String nomeProd, String id, double preco) {
        this.nomeProd = nomeProd;
        this.id = id;
        this.preco = preco;
        this.custo = custo;
       
    }

    public Produto() {
        this.nomeProd = "";
        this.id = "";
        this.preco = 0.0;
        this.custo = 0.0;
       

    }

   

    

    public void imprimir() {
        System.out.println(toString());
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public String getId() {
        return id;
    }


    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Double getCusto() {
        return custo;
    }
    
    
    @Override
    public String toString() {
        return "Produto{" + "nomeProd=" + nomeProd + ", id=" + id + ", preco=" + preco + ", custo=" + custo + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nomeProd);
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.preco);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nomeProd, other.nomeProd)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.preco, other.preco);
    }
    
}

    

