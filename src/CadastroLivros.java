public class CadastroLivros{
    public CadastroLivros(Livro [] livrosCadastrados){
        livrosCadastrados  = new Livro[10];
    }
    public static boolean adicionaLivro(Livro [] livros, String nomeLivro, int numExemplares){
        boolean conseguiu = false;
        for(int i = 0; i < livros.length;i++){
            if(livros[i] == null){
                livros[i] = new Livro(nomeLivro, numExemplares);
                conseguiu = true;
                break;
            }
        }  
        return conseguiu;
    }
    public static boolean removeLivro(Livro[]livros, String nomeLivro){
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
    public static void buscaLivroPeloNome(Livro []livros, String nomeLivro){
        for(int i = 0; i < livros.length;i++){
            if(livros[i].getNome() == nomeLivro){
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
            System.out.println("Livro - "+(i+1)+" :");
            System.out.println("Nome: " + livros[i].getNome());
            System.out.println("Codigo: " + livros[i].getCodigoLivro());
            System.out.println("Numero de Exemplares: " + livros[i].getNumExemplares());
            System.out.println("--------------------------------------------------------");
        }
    }
}