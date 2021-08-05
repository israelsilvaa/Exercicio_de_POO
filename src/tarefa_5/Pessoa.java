package tarefa_5;

/**
 *
 * @author Israel Silva
 */
public class Pessoa {
    private String  nome, sexo;
    private int idade;
    Livro livro;
    Livro L = new Livro("a pequna orfã"," carla",3,4);

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Parabens hoje é seu aniversário, agora vc tem "+this.getIdade()+" anos\n");
    }
    
    public void Ler(Pessoa pessoa, Livro livro){
        
        livro.setLeitor(pessoa.getNome());
        livro.abrir();
        
        System.out.println("O "+livro.getLeitor());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}