/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screenmatch.models;

/**
 *
 * @author bruno
 */
public abstract class Titulo {
    // Especifica o conteúdo do objeto
    
    // Pilar Abstração: O que é comum à todos os filmes? Sejam características, métodos etc...
    // Pilar Encapsulamento: impedir alterações em métodos e atributos ou restrições de acesso com
    // modificadores de acesso
    
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
    
    
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    
    public void setNome() {
        
    }
            
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme:" + nome);
        System.out.println("No plano?: " + incluidoNoPlano);
        System.out.println("Avaliação: " + somaDasAvaliacoes + "(" + totalDeAvaliacoes + ")");
        System.out.println("Duração (em minutos): " + duracaoEmMinutos);
    }
    
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes += 1;
    }
    
    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
