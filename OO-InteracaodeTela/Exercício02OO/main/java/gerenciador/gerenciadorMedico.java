/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import classe.Medico;
import file.filePersistence;
import java.util.ArrayList;
import java.util.List;
import serializador.serializadorCSVMed;

/**
 *
 * @author Windows
 */
public class gerenciadorMedico {
    private List<Medico> medicos;

    public gerenciadorMedico() {
        this.medicos = new ArrayList<>();
    }
    
    public void addMedico(Medico newMedico){
        medicos.add(newMedico);
    }
    
    public Medico buscarMedico(String crm){
        for(Medico med : medicos){
           if( med.getCRM().equals(crm)){
           return med;
        }
    }
        return null;
    }
    
    public void removeMedico(String crm){
        medicos.remove(buscarMedico(crm));
    }
    
    public void atualizar(String crm, Medico newMed){
        Medico medExistente = buscarMedico(crm);
        
        if(medExistente != null){
            int indice = medicos.indexOf(medExistente);
            medicos.set(indice, newMed);
            System.out.println("Atualizado com sucesso!");
        }else{
            System.out.println("Não existe este crm.");
        }
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "gerenciadorMedico{" + "medicos=" + medicos + '}';
       
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSVMed serializador = new serializadorCSVMed();
        String csvData = serializador.toCSV(medicos);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Medicos salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSVMed serializador = new serializadorCSVMed();
        this.medicos = serializador.fromCSV(csvData);

        System.out.println("Medicos carregados com sucesso de " + caminhoDoArquivo);
    }

    
    
    
    
    
    
    
}
