/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Dados {

    private int valorA, valorB, valorC;

    public Dados(int valorA, int valorB, int valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    
    
    private List<Observador> observadores = new ArrayList<>();

    public void anexar(Observador obs) {
        this.observadores.add(obs);
    }

    public void desanexar(Observador obs) {
        this.observadores.remove(obs);
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
        for (Observador obs : observadores) {
            obs.atualizarValorA(valorA);
        }
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
        for (Observador obs : observadores) {
            obs.atualizarValorB(valorB);
        }
    }

    public void setValorC(int valorC) {
        this.valorC = valorC;
        for (Observador obs : observadores) {
            obs.atualizarValorC(valorC);
        }
    }
}
