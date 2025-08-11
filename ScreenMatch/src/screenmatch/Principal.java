package screenmatch;

import calculo.CalcPlano;
import observer.Dados;
import observer.GraficoBarra;
import observer.Tabela;
import screenmatch.models.Filme;

/**
 *
 * @author bruno
 */
public class Principal {

    public static void main(String[] args) {
//        Filme meuFilme = new Filme();
//        meuFilme.setNome("Detetive Pikachu");
//        meuFilme.setAnoDeLancamento(2019);
//        meuFilme.setDuracaoEmMinutos(210);
//        meuFilme.setIncluidoNoPlano(false);
//
//        meuFilme.exibeFichaTecnica();
//        meuFilme.avalia(8);
//        meuFilme.avalia(9);
//        meuFilme.avalia(10);
//        meuFilme.avalia(9);
//        meuFilme.avalia(7);
////        System.out.println(meuFilme.somaDasAvaliacoes);
//        System.out.println(meuFilme.getTotalDeAvaliacoes());
//        System.out.println(meuFilme.pegaMedia());
//        
//        CalcPlano cp_i = CalcPlano.getInstance().getInstance();
//        cp_i.calcular("Anual", "Duo", "Plus");

    Dados dados = new Dados(7, 3, 1);
//    dados.anexar(new Tabela(dados));
    dados.anexar(new GraficoBarra(dados));
    dados.setValorA(10);
    dados.setValorB(20);
    dados.setValorC(15);
        

    }

}
