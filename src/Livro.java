public class Livro {
    private static int SEQUENCIAL = 1000; 
    private String nome;
    private int numExemplares;
    private int codigoLivro;
    
    public Livro(String nomeDoLivro,int numExemplares ){
        this.nome = nomeDoLivro;
        this.numExemplares = numExemplares;
        this.codigoLivro = Livro.SEQUENCIAL;
        SEQUENCIAL++;
    }
    
    public boolean retirar(Livro livro){
        boolean conseguiu = false;
        if(livro.getNumExemplares()>=1){
            livro.numExemplares-=1;
            conseguiu = true;
           }
           return conseguiu;
    }

    public void devolver(Livro livro){
        livro.numExemplares+=1 ;
        System.out.println("O livro foi devolvido com sucesso!");
    }
    
    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    public String getNome() {
        return nome;
    }

    public int getNumExemplares() {
        return numExemplares;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
