package tarefa_5;

public class Tarefa_5 {

    public static void main(String[] args) {
        Pessoa j = new Pessoa("joão","masculino",18);
        Livro l = new Livro("a pequna orfã"," carla",j,10);
       
        System.out.println("Comando 1:");
        //tentativa de avançar pagina com o livro fechado.
        l.avançarPag();
        System.out.println("----------------");
        
        System.out.println("Comando 2:");
        j.fazerAniversario();
        
        System.out.println("Comando 3:");
        //Jão começou a ler o livro, iniciando da pagina 1
        j.Ler(j, l);
        System.out.println("----------------");
        
        System.out.println("Comando 4:");
        //Jão avancou uma pagina
        l.avançarPag();
        System.out.println("----------------");
        
        System.out.println("Comando 5:");
        //verificando nos detalhes, agora estmos na pagina 2
        l.detalhes(j);
        System.out.println("----------------");
        
        System.out.println("Comando 6:");
        //folheando o livro(Avançando 5 paginas)
        l.folhear();
        l.folhear();
        System.out.println("----------------");
        
        System.out.println("Comando 7:");
        //verificando nos detalhes.
        l.detalhes(j);
        System.out.println("----------------");
    
    }
}
