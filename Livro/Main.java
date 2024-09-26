package exercicios;

public class Main {
    public static void main(String[] args){
        Ebook livro1 = new Ebook("1984", "George Orwell", 20.99, 2.5);
        Ebook livro2 = new Ebook("Duna", "Frank Herbert", 73.99, 5.0);
        Ebook livro3 = new Ebook("Eu, Robô", "Isaac Asimov", 64.99, 3.3);
        Ebook livro4 = new Ebook("Fundação", "Isaac Asimov", 152.49, 10.0);
        Ebook livro5 = new Ebook("A Guerra dos Mundos", "H.G Wells", 54.90, 2.4);

        Ebook[] listaEbooks = {livro1, livro2, livro3, livro4, livro5};
        
        for (int i = 0; i < listaEbooks.length; i++){
            listaEbooks[i].exibirDetalhes();
        }
    }
}
