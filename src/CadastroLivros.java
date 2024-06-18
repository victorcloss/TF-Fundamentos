public class CadastroLivros{
    public CadastroLivros(Livro [] livrosCadastrados){
        livrosCadastrados  = new Livro[3];
    }
    public static boolean adicionaLivro(Livro [] livros, Livro livro){
        boolean conseguiu = false;
        for(int i = 0; i < livros.length;i++){
            if(livros[i] == null){
                livros[i] = livro;
                conseguiu = true;
                break;
            }
        }  
        return conseguiu;
    }
    public static boolean removeLivro(Livro[]livros, Livro livroRemover){
        boolean conseguiu = false;
        for(int i = 0; i < livros.length;i++){
            if(livros[i] == livroRemover){
                livros[i] = null;
                conseguiu = true;
                break;
            }
        } 
        return conseguiu; 
    }
    public static void buscaLivroPeloNome(Livro[]livros, String nomeLivro){
        for(int i = 0; i < livros.length;i++){
            if(livros[i].getNome()==nomeLivro){
                System.out.println("Nome: " + livros[i].getNome());
                System.out.println("Codigo: " + livros[i].getCodigoLivro());
                System.out.println("Numero de Exemplares: " + livros[i].getNumExemplares());
                break;
            }
        } 
    }
    public static int totalExemplares(Livro[]livros){
        int totalExmp = 0;
        for(int i = 0; i < livros.length;i++){
            if(livros[i] != null){
                totalExmp += livros[i].getNumExemplares();
            }
        }
        return totalExmp;
    }
    public static void mostraLivros(Livro[]livros){
        for(int i = 0; i < livros.length;i++){
            System.out.println("Nome: " + livros[i].getNome());
            System.out.println("Codigo: " + livros[i].getCodigoLivro());
            System.out.println("Numero de Exemplares: " + livros[i].getNumExemplares());
        }
    }
    public static void main(String[] args) {
        Livro [] livrosCadastrados = new Livro[3];
        livrosCadastrados[0] = new Livro("Percy Jackson",1);
        livrosCadastrados[1] = new Livro("Harry Potter",2);
        livrosCadastrados[2] = new Livro("Crepusculo",1);
        mostraLivros(livrosCadastrados);
    }
}