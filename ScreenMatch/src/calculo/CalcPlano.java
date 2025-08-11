package calculo;


// O calc plano vai realizar o cálculo do plano de assinatura do usuário.
// Vamos levar em consideração as seguintes variáveis do cálculo:
// - Duração do Plano (Mensal/Semestral/Anual (de 1 à 2 anos);
// - Tipo do Plano (Individual/Duo/Família; (1/2/4 membros)
// - Nível do Plano (Plus/Premium);

// O plano mais baixo é o plano Free e o mais alto é o plano Premium Anual de 2 anos para Família.
public class CalcPlano {

    private static CalcPlano instance;
    
    public static CalcPlano getInstance() {
        if (instance == null) instance = new CalcPlano();
        return instance;
    }    
    private CalcPlano() {}
    
    public void calcular(String DuracaoPlano, String TipoPlano, String NivelPlano) {
        float valorPlano = 0.0f;
        switch (DuracaoPlano) {
            case "Mensal" -> valorPlano += 19.90;
            case "Semestral" -> valorPlano += (8.90 * 6);
            case "Anual" -> valorPlano += (5.90 * 12);
            default -> System.out.println("Insira uma duração de plano disponível.");
        }
        switch (TipoPlano) {
            case "Individual" -> valorPlano += 10;
            case "Duo" -> valorPlano += 15;
            case "Familia" -> valorPlano += 30;
            default -> System.out.println("Insira um tipo de plano disponível.");
        }
        switch (NivelPlano) {
            case "Free" -> valorPlano += 0;
            case "Plus" -> valorPlano += 15;
            case "Premium" -> valorPlano += 30;
            default -> System.out.println("Insira um nível de plano disponível.");
        }
        
        System.out.println("Seu plano será de R$ " + valorPlano);
    }
    
    
}
