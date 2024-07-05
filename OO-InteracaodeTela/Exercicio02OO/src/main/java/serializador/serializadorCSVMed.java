/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializador;

import classe.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class serializadorCSVMed {
    public String toCSV(List<Medico> med) {
        String csv = "Nome;CRM;Especialidade;Horarios\n"; // Cabeçalho
        for (Medico medico : med) {
            csv += medico.getNome() + ";"
                    + medico.getCRM() + ";"
                    + medico.getEspecialidade()+ ";"
                    + medico.getHorarios() + ";\n";
                    
                    
        }
        return csv;
    }

    //Deserializa uma String no formato CSV para uma lista de alunos
    public List <Medico> fromCSV(String data) {
        List <Medico> med = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=4 ) {
                // Cria uma nova aluno com os dados da linha
                Medico medico = new Medico(
                        partes[0], // Nome
                        partes[1],//CRM
                        partes[2], //Especialidade
                        partes[3]//Horarios
                      
                );

                // Adiciona a aluno à lista
                med.add(medico);
            }
        }
        return med;
    }
    
}
