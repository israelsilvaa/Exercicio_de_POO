package tarefa_5;

public class Tarefa_5 {

    public static void main(String[] args) {
        Pessoa joão = new Pessoa("joão","masculino",18);
        Livro L = new Livro("a pequna orfã"," carla",3,4);
       
        
       joão.Ler(joão,L);
       L.avançarPag();
       
      
    }
    
}
