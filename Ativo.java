public class Ativo {

    private String codigo;
    private String nome;
    private double precoAtual;

    public Ativo(String codigo, String nome, double precoAtual) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoAtual = precoAtual;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }
}