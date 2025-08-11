/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author bruno
 */
public class GraficoBarra implements Observador {
    
    private String barraA, barraB, barraC;
    private Dados dados;
    
    public GraficoBarra(Dados dados) {
        this.dados = dados;
    }
    
    private void desenhar() {
        System.out.println("Barras:\n Valor A: " + barraA + "\nValor B: " + barraB + "\nValor C: " + barraC);
    }
    
    @Override
    public void atualizarValorA(int valorA) {
        barraA = "";
        for (int i = 0; i < valorA; i++) {
            barraA += '=';
        }
        desenhar();
    }
    
    @Override
    public void atualizarValorB(int valorB) {
        barraA = "";
        for (int i = 0; i < valorB; i++) {
            barraA += '=';
        }
        desenhar();
    }
    
    @Override
    public void atualizarValorC(int valorC) {
        barraA = "";
        for (int i = 0; i < valorC; i++) {
            barraA += '=';
        }
        desenhar();
    }
}
