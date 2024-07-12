/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;


import file.FilePersistence1;

import file.SerializadorCSVProdt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class GerenciadorProd {
    private List<Produto> listProd;

    public GerenciadorProd() {
        this.listProd = new ArrayList<>();
    }
    
    
    public void addProd(Produto prod){
        listProd.add(prod);
        
    }
    
    public void removeProd(String nome){
        listProd.remove(buscaProd(nome));

    }
    
    public Produto buscaProd(String nome){
        Produto procurado= new Produto();
        for(Produto p : listProd){
            if(p.getId().equals(nome))
                procurado = p;
        }
        return procurado;
        
    }
    // A função buscar criamos um produto nomeado de procurado, fazemos um for 
    //passando na lista e verificando se o nome produto é igual do que estou procurando
    //se for procurado recebe p e retorno procurado.
    
     public void atualizarProd(String nome , Produto newProd){
         Produto existenteProd = buscaProd(nome);
         
         if(existenteProd != null){
             int indice = listProd.indexOf(existenteProd);
             listProd.set(indice, newProd);
             System.out.println("Atualizado com sucesso !!");    
         }else{
             System.out.println("Não existe este produto.");
         }
         
    }
     //Este codigo atualizar: 1ª Buscamos o produto
     // 2ª Verificamos o produto não é null, se não é cria um int indice recebendo  indexOf da lista
     // onde está o ProdutoExistente 
     // assim atualizando a lista como um novoProd e o indice
     // Se for null retorna "Não existe este produto.

    @Override
    public String toString() {
        return "GerenciadorProd{" + "listProd=" + listProd + '}';
    }

    
    
    
     public void salvarNoArquivo(String caminhoDoArquivo) {
        //Serializando CSV
        SerializadorCSVProdt serializadorCSV = new SerializadorCSVProdt();
        String csvData = serializadorCSV.toCSV(this.listProd);
        
        FilePersistence1 filePersistence = new FilePersistence1();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Produtos salvos  com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence1 filePersistence = new FilePersistence1();
        String csv = filePersistence.loadFromFile(caminhoDoArquivo);

        //Desserializando CSV
        SerializadorCSVProdt desserializadorCSV = new SerializadorCSVProdt();
        this.listProd = desserializadorCSV.fromCSV(csv);

        System.out.println("Produtos carregados com sucesso de " + caminhoDoArquivo);
    }






    
    
    
    
    
    
    
    
}
