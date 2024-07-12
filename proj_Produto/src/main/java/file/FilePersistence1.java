
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class FilePersistence1 {
      public void saveToFile(String texto, String filePath) {

        try {
            FileWriter arq = new FileWriter(filePath);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(texto);
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(FilePersistence1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      //O savetoFile tenho texto e uma pasta (o caminho do arquivo) e tento usando
      //um gravador de arquivo FileWriter chamando de arq tendo a pasta;
      //Print chamado de gravarArq tendo arq;
      //pego gravarArq printo o texto e depois fecho o arq. e caso não acha o nome do  arq recebe null;
      

    public String loadFromFile(String filePath) {
        String conteudoLido = "";
        try {
            //cria o objeto arquivo
            File file = new File(filePath);
            //cria o scanner que vai ler o arquivo
            Scanner scanner = new Scanner(file);

            //efetua a litura linha por linha, copiando do arquivo para uma string 'ConteudoLido'
            scanner.useDelimiter("\\Z"); // ler até o final da linha
            while (scanner.hasNext()) {
                conteudoLido += scanner.next();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersistence1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conteudoLido;
    }
}
// LoadFromFile pega o conteudo da pasta ;
// Usando a pasta, crio objeto arq usando a pasta;
//Uso o Scanner q vai lar o arquivo;
//O Scanner vai ter um limite quando for passar linha por linha;
//usando um while passando o Scanner para o conteudoLido ate chegar no limitador;
//se Caso se não estiver o nome do arquivo recebe null;
//Retorno o conteudoLido.
    

