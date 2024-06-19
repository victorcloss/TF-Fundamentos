public class Livro {
    private static int SEQUENCIAL = 1; 
    
    private String nome;
    private int numExemplares;
    private int codigoLivro;
    
    public Livro(String nomeDoLivro,int numExemplares ){
        this.nome = nomeDoLivro;
        this.numExemplares = numExemplares;
        this.codigoLivro = Livro.SEQUENCIAL ++;
    }
    
    public void retirar(Livro livro){
        if(livro.getNumExemplares()>=1){
            livro.numExemplares-=1;
            System.out.println("O livro " + livro.getNome()+ " foi retirado com sucesso");
        }else{System.out.println("Infelizmente não há exemplares disponiveis");}

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
