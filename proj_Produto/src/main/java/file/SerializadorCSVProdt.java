
package file;


import classe.Produto;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Windows
 */
public class SerializadorCSVProdt {
     public String toCSV(List<Produto> produtos) {
        String csv = "Nome;Id;Preco;Custo;\n";
        for (Produto p : produtos) {
            csv += p.getNomeProd()+ ";" 
                + p.getId() + ";"
                + p.getPreco() + ";"
                + p.getCusto() + ";\n";
        }
        return csv;
    }

    // Deserializa uma String no formato CSV para uma lista de produtos
    public List<Produto> fromCSV(String data) {
        List<Produto> produtos = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Produto p = new Produto();
                p.setNomeProd(partes[0]);
                p.setId(partes[1]);
                p.setPreco(Double.valueOf(partes[2]));
                p.setCusto(Double.valueOf(partes[3]));
                
                //apos montar um produto, adiciono na lista
                produtos.add(p);
            }
        }
        return produtos;
    }

}
  
    

