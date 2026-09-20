public class Posicao {

    private Ativo ativo;
    private int quantidade;

   public Posicao(Ativo ativo, int quantidade) {
    this.ativo = ativo;
    this.quantidade = quantidade;
   } 

   public Ativo getAtivo() {
    return ativo;
   }

   public int getQuantidade() {
    return quantidade;
   }

   public double calcularValor() {
    return ativo.getPrecoAtual() * quantidade;

   }
    
}
