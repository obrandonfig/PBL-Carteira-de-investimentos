import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CarteiraInvestimentos {

    private Cliente cliente;
    private List<Posicao> posicoes;

    public CarteiraInvestimentos(Cliente cliente) {
        this.cliente = cliente;
        this.posicoes = new ArrayList<>();
    }

    public void adicionarPosicao(Ativo ativo, int quantidade) {
        posicoes.add(new Posicao(ativo, quantidade));
    }

    public double calcularPatrimonio() {
        double total = 0.0;
        for (Posicao p : posicoes) {
            total += p.calcularValor();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("CARTEIRA DE INVESTIMENTOS");
        System.out.println();
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println();

        if (posicoes.isEmpty()) {
            System.out.println("Nenhuma posicao cadastrada.");
            System.out.println();
        } else {
            for (Posicao p : posicoes) {
                Ativo a = p.getAtivo();
                System.out.println("Ativo: " + a.getCodigo() + " - " + a.getNome());
                System.out.println("Quantidade: " + p.getQuantidade());
                System.out.printf(Locale.forLanguageTag("pt-BR"),
                        "Preco atual: R$ %.2f%n", a.getPrecoAtual());
                System.out.printf(Locale.forLanguageTag("pt-BR"),
                        "Valor da posicao: R$ %.2f%n", p.calcularValor());
                System.out.println();
            }
        }

        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Patrimonio total: R$ %.2f%n", calcularPatrimonio());
    }

    public List<Posicao> getPosicoes() {
        return posicoes;
