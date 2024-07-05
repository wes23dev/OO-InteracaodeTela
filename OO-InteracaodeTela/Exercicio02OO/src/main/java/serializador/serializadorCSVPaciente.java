/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializador;

import classe.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class serializadorCSVPaciente {
    public String toCSV(List<Paciente> paciente) {
        String csv = "Nome;CPF;Data de Nascimento;Horario Medico\n"; // Cabeçalho
        for (Paciente pacien :paciente ) {
            csv += pacien.getNome() + ";"
                    + pacien.getCpf() + ";"
                    + pacien.getDataNasc() + ";"
                    + pacien.getHistoricoMedico() + ";\n";
                    
                    
        }
        return csv;
    }

    //Deserializa uma String no formato CSV para uma lista de alunos
    public List <Paciente> fromCSV(String data) {
        List <Paciente> paciente = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=4 ) {
                // Cria uma nova aluno com os dados da linha
                Paciente pa = new Paciente(
                        partes[0], // Nome
                        partes[1], // CPf
                        partes[2], //Data
                        partes[3]//Horario
                      
                );

                // Adiciona a aluno à lista
                paciente.add(pa);
            }
        }
        return paciente;
    }
    
}
