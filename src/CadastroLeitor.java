public class CadastroLeitor {
    private Leitor [] leitores;
    private int maxLeitores;

    public CadastroLeitor(){
       maxLeitores = 10;
       leitores = new Leitor[maxLeitores];
    }   
    public Leitor[] getLeitores() {
        return leitores;
    }

    public boolean adicionaLeitor(String nome, String cidadeOrigem){
        boolean conseguiu = false;
        for(int i = 0; i < leitores.length;i++){
            if(leitores[i] == null){
                leitores[i]= new Leitor(nome,cidadeOrigem);
                conseguiu = true;
                break;
            }                                                                                                                                                                              
        } return conseguiu;
    }

    public Leitor buscaLeitorPeloNome(String nome) {
        for (Leitor leitor : leitores) {
            if (leitor.getNome().equalsIgnoreCase(nome)) {
                return leitor;
            }
        }
        return null;
    }
    
    public void mostrarDados(){
        for(int i = 0; i < leitores.length;i++){
            if(leitores[i]!=null){ 
            System.out.println("Leitor - "+(i+1)+" :");
            System.out.println("Nome: " + leitores[i].getNome());
            System.out.println("Cidade de Origem: " + leitores[i].getCidadeOrigem());
            System.out.println("Matricula: "+leitores[i].getMatricula());
            System.out.println("--------------------------------------------------------");}
        }
    }
    public void mostrarInfos(Leitor leitor){
        System.out.println("Nome: " + leitor.getNome());
        System.out.println("Cidade de Origem: " + leitor.getCidadeOrigem());
        System.out.println("Matricula: "+leitor.getMatricula());
        System.out.println("--------------------------------------------------------");
    }
}
