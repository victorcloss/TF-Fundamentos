public class Leitor {
    private static int SEQUENCIAL = 0001;
    private int matricula;
    private String nome;
    private String cidadeOrigem;
    private int livrosAlugados = 0;
    private Livro livroRetirado;

    public Livro getLivroRetirado() {
        return livroRetirado;
    }

    public void setLivroRetirado(Livro livroRetirado) {
        this.livroRetirado = livroRetirado;
    }

    public int getLivrosAlugados() {
        return livrosAlugados;
    }

    public void setLivrosAlugados(int livrosAlugados) {
        this.livrosAlugados = livrosAlugados;
    }

    public Leitor(String nome, String cidadeOrigem){
        this.matricula = Leitor.SEQUENCIAL;
        this.nome = nome;
        this.cidadeOrigem = cidadeOrigem;
        SEQUENCIAL++;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }
}