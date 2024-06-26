public class CadastroLivros{
    private Livro [] livrosCadastrados;
    private int maxLivros;
    
    public CadastroLivros(){
        maxLivros = 10;
        livrosCadastrados = new Livro[maxLivros];
    }
    public boolean adicionaLivro(String nomeLivro, int numExemplares){
        boolean conseguiu = false;
        for(int i = 0; i < this.livrosCadastrados.length;i++){
            if(this.livrosCadastrados[i] == null){
                this.livrosCadastrados[i] = new Livro(nomeLivro, numExemplares);
                conseguiu = true;
                break;
            }
        }  
        return conseguiu;
    }
    public boolean removeLivro(Livro[]livros, String nomeLivro){
        boolean conseguiu = false;
        for(int i = 0; i < livros.length;i++){
            if(livros[i].getNome() == nomeLivro){
                livros[i] = null;
                conseguiu = true;
                break;
            }
        } 
        return conseguiu; 
    }
    public Livro buscaLivroPeloNome(String nome) {
        for (Livro livro : livrosCadastrados) {
            if (livro.getNome().equalsIgnoreCase(nome)) {
                return livro;
            }
        }
        return null;
    }

    public int totalExemplares(){
        int totalExmp = 0;
        for(int i = 0; i < livrosCadastrados.length;i++){
            if(livrosCadastrados[i] != null){
                totalExmp += livrosCadastrados[i].getNumExemplares();
            }
        }
        return totalExmp;
    }
    public void mostraLivros(){
        for(int i = 0; i < livrosCadastrados.length;i++){
            if(livrosCadastrados[i]!=null){
            System.out.println("Livro - "+(i+1)+" :");
            System.out.println("Nome: " + livrosCadastrados[i].getNome());
            System.out.println("Codigo: " + livrosCadastrados[i].getCodigoLivro());
            System.out.println("Numero de Exemplares: " + livrosCadastrados[i].getNumExemplares());
            System.out.println("--------------------------------------------------------");}
        }
    }
    public void mostrarInfos(Livro livro){
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Codigo: " + livro.getCodigoLivro());
        System.out.println("Numero de Exemplares: " + livro.getNumExemplares());
        System.out.println("--------------------------------------------------------");
    }
}