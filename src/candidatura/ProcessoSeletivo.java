package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
  
    public static void main(String[] args) {
        selecaoCandidatos();
        
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"Lucas", "Mariana", "Pedro", "Ana", "João", "Clara", "Carlos", "Sofia", "Bruno", "Laura", "Miguel", "Julia", "Rafael", "Beatriz", "Gabriel"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
                if(salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                    candidatosSelecionados++;
                }
                candidatosAtual++;
        }

    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }



    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
