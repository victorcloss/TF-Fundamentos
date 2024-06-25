import java.util.Scanner;

public class Livraria {
    
    public static void main(String[] args) {
        CadastroLeitor cl = new CadastroLeitor();
        CadastroLivros cb = new CadastroLivros();

        System.out.println("\f");
        Scanner input = new Scanner(System.in);
        int escolha;                                                                                                               
        do{
            System.out.println("====== MENU - Livraria ======");
            System.out.println("[1] - Incluir leitor");
            System.out.println("[2] - Mostrar leitores");
            System.out.println("[3] - Pesquisar leitor por nome");
            System.out.println("[4] - Incluir livro");
            System.out.println("[5] - Mostrar livros");
            System.out.println("[6] - Pesquisar livro por nome");
            System.out.println("[7] - Retirar livro ");
            System.out.println("[8] - Devolver livro ");
            System.out.println("[9] - Quantidade total de exemplares disponíveis no sistema de empréstimo");
            System.out.println("[10] - Sair do programa");
            System.out.print("Digite o número conforme a opção desejada: ");
        
            escolha = input.nextInt();
            input.nextLine();
            switch (escolha){
                case 1:{
                    System.out.println("Digite o nome do Leitor a ser incluido: ");
                    String nomeLeitor = input.nextLine();
                    System.out.println("Digite a cidade de origem de "+ nomeLeitor +": ");
                    String cidadeDeOrigem = input.nextLine();   
                    if(cl.adicionaLeitor(nomeLeitor,cidadeDeOrigem)){
                        System.out.println("Leitor incluido com sucesso!");
                    }else{System.out.println("Infelizmente o cadastro de leitores está cheio no momento!");}
                    break;
                }
                case 2:{
                    cl.mostrarDados();
                    break;
                }
                case 3:{
                    System.out.print("Nome do leitor: ");
                    String nomePesquisaLeitor = input.nextLine();
                    Leitor leitorEncontrado = cl.buscaLeitorPeloNome(nomePesquisaLeitor);
                    if (leitorEncontrado != null) {
                        cl.mostrarInfos(leitorEncontrado);
                    } else {
                        System.out.println("Leitor não encontrado.");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Digite o Livro que deseja adicionar: ");
                    String nomeLivro = input.nextLine();
                    System.out.println("Digite o numero de exemplares: ");
                    int numExemplares = input.nextInt();
                    input.nextLine();
                    if(cb.adicionaLivro(nomeLivro, numExemplares)){
                        System.out.println("Livro cadastrado com sucesso!");
                    }else System.out.println("Nao foi possivel cadastras o livro!");
                    break;
                }
                case 5:{
                    cb.mostraLivros();
                    break;
                }
                case 6:{
                    System.out.print("Nome do livro: ");
                    String nomePesquisaLivro = input.nextLine();
                    Livro livroEncontrado = cb.buscaLivroPeloNome(nomePesquisaLivro);
                    if (livroEncontrado != null) {
                        cb.mostrarInfos(livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                }
                case 7:{
                    System.out.print("Digite o nome do leitor para retirada: ");
                    String nomeLeitor = input.nextLine();
                    Leitor leitorEncontrado = cl.buscaLeitorPeloNome(nomeLeitor);
                    if (leitorEncontrado==null) {
                        System.out.println("O leitor ainda nao esta cadastrado no nosso sistema!");
                    } else if(leitorEncontrado != null && leitorEncontrado.getLivrosAlugados()<1) {
                        System.out.println("O leitor nao possui nenhum livro pendente");
                        System.out.print("Qual livro que "+nomeLeitor+" deseja fazer a retirada? ");
                        String livroAlugado = input.nextLine();
                        Livro livroAlugar = cb.buscaLivroPeloNome(livroAlugado);
                        if(livroAlugar.retirar(livroAlugar)){
                            System.out.println("A retirada de "+ livroAlugar.getNome()+ " foi realizada com sucesso!");
                            leitorEncontrado.setLivrosAlugados(1);
                        } else {System.out.println("Infelizmente o livro "+livroAlugar.getNome()+" nao possui exemplares disponiveis");}
                    }else System.out.println("O leitor precisa devolver os livros pendentes antes de retirar outro!");

                    break;
                }
                case 8:{

                    break;
                }
                case 9:{

                    break;
                }
                default: { System.out.println("O Programa foi encerrado!");}
            }
        }while(escolha != 10);  
    input.close();}
}
