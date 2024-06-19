public class CadastroLeitor {
    public CadastroLeitor(Leitor [] leitores){
        leitores = new Leitor[10];
    }
    public boolean adicionaLeitor(Leitor [] leitores, String cidadeOrigem,String nome){
        boolean conseguiu = false;
        for(int i = 0; i < leitores.length;i++){
            if(leitores[i] == null){
                leitores[i] = new Leitor(nome, cidadeOrigem);
                conseguiu = true;
                break;
            }                                                                                                                                                                              
        } return conseguiu;
    }
    public Leitor buscaLeitorPeloNome(String nomeLeitor, Leitor [] leitores){
        int i;
        for(i = 0; i < leitores.length;i++){
            if(leitores[i].getNome() == nomeLeitor){
                return leitores[i];
            }
        }return leitores[i];
    }
    public void mostrarDados(Leitor [] leitores){
        for(int i = 0; i < leitores.length;i++){
            System.out.println("Leitor - "+(i+1)+" :");
            System.out.println("Nome: " + leitores[i].getNome());
            System.out.println("Cidade de Origem: " + leitores[i].getCidadeOrigem());
            System.out.println("--------------------------------------------------------");
        }
    }
}
