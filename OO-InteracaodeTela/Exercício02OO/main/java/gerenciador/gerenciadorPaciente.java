/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import classe.Paciente;
import file.filePersistence;
import java.util.ArrayList;
import java.util.List;
import serializador.serializadorCSVPaciente;

/**
 *
 * @author Windows
 */
public class gerenciadorPaciente {
    private List<Paciente> pacientes;

    public gerenciadorPaciente() {
        this.pacientes = new ArrayList<>();
    }
    
    public void addPaciente(Paciente newPaciente){
        pacientes.add(newPaciente);
    }
    
    public Paciente buscarPaciente(String cpf){
        for(Paciente paciente : pacientes){
            if(paciente.getCpf().equals(cpf)){
            return paciente;
        }
        }
        return null;
    }
    
    public void removePaciente(String cpf){
        pacientes.remove(buscarPaciente(cpf));
    }
    
    public void atualizarPaciente(String cpf, Paciente paciente){
        Paciente pacienteExistente = buscarPaciente(cpf);
        if(pacienteExistente != null){
            int indice = pacientes.indexOf(pacienteExistente);
            pacientes.set(indice, paciente);
            System.out.println("Atualizado com sucesso !");  
        }else{
            System.out.println("Não existe este cpf");
        }
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "gerenciadorPeciente{" + "pacientes=" + pacientes + '}';
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSVPaciente serializador = new serializadorCSVPaciente();
        String csvData = serializador.toCSV(pacientes);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Pacientes salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSVPaciente serializador = new serializadorCSVPaciente();
        this.pacientes = serializador.fromCSV(csvData);

        System.out.println("Pacientes carregados com sucesso de " + caminhoDoArquivo);
    }

    
    
    
    
    
    
    
}
