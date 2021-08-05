
package tarefa_5;

public class Livro implements Publicação {
    private String titulo, autor, leitor; 
    private int totPagi, pagAtual;
    private boolean aberto = false;

    public Livro(String titulo, String autor, int totPagi, int pagAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagi = totPagi;
        this.pagAtual = pagAtual;
    }
    
    public void detalhes(Pessoa pessoa){
        System.out.println("Titulo:"+this.getTitulo()+"  Autor:"+this.getAutor());
        System.out.println("Totalde paginas:"+this.getTotPagi()+" Pagina atual:");
        System.out.println("Estado do livro:"+this.getAberto()+" Leitor:"+pessoa.getNome()+"\n");
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public int getTotPagi() {
        return totPagi;
    }

    public void setTotPagi(int totPagi) {
        this.totPagi = totPagi;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
       return aberto;
    }
    
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("O livro foi aberto!\n");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("O livro foi fechado!\n");
    }

    @Override
    public void folhear() {
        if ((true == this.getAberto())  &&  (this.getTotPagi() > this.getPagAtual()) ){
            System.out.println("Folheando  paginas!\n");
        }else{
            System.out.println("Livro fechado ou na ultima pagina, não é possivel folhear mais!\n");
        }
    }

    @Override
    public void avançarPag() {
        if (this.getPagAtual() > this.getTotPagi()){
            this.setPagAtual(this.getPagAtual()+1);
            System.out.println("Avnaçando uma pagina\n");
        }else{
            System.out.println("Voce esta na ultima pagina, não é possivel avançar!\n");
        }
    }

    @Override
    public void VoltarPag() {
        if (this.getPagAtual()<= this.getTotPagi() &&  this.getPagAtual()> 0 ){
            this.setPagAtual(this.getPagAtual()-1);
            System.out.println("Voltando uma pagina!\n");
        }
    }
}
