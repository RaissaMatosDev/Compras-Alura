public class Produtos implements Comparable<Produtos>{
    private String nome;
    private Integer valor;

    public Produtos(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public int compareTo(Produtos outro) {
        return Integer.compare(this.valor,(outro.valor));
    }
}
