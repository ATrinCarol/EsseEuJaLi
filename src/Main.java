import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Carol", "carol@email.com", "carol123");

        System.out.println("Digite seu login: ");
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        System.out.println("Digite sua senha: ");
        String senha = sc.next();
        if (email.equals(user1.getEmail()) && senha.equals(user1.getPassword()))
            System.out.println("Acesso liberado!");
        else {
            System.out.println("Dados incorretos! Faça o login novamente!");
            System.exit(1);
        }

        System.out.println("Boas vindas ao 'ESSE EU JÁ LI', " + user1.getName() + "!!!");
        System.out.println("Seus pontos atualmente são: " + user1.getScore());
        System.out.println("Seus troféus atualmente são: " + user1.getTrophy());

        System.out.println("********Lista de Livros********");
        Books livro1 = new Books(1, "Uma dobra no tempo", 240, "Ação");
        Books livro2 = new Books(2, "Torto Arado", 264, "Romance");
        Books livro3 = new Books(3, "Ponto de Impacto", 448, "Ação");
        Books livro4 = new Books(4, "Capitães da Areia", 280, "Romance");
        Books livro5 = new Books(5, "Glória Sombria", 150, "Ficção Científica");
        Books livro6 = new Books(6, "Demônios", 208, "Horror");
        Books livro7 = new Books(7, "O caçador cibernético da Rua Treze", 208, "Ficção Científica");
        Books livro8 = new Books(8, "Marighella: O guerrilheiro que incendiou o mundo", 784, "Biografia");
        Books livro9 = new Books(9, "Venha ver o pôr-do-sol", 112, "Horror");
        Books livro10 = new Books(10, "Olga", 392, "Biografia");

        List<Books> leituras = new ArrayList<>();
        leituras.add(livro1);
        leituras.add(livro2);
        leituras.add(livro3);
        leituras.add(livro4);
        leituras.add(livro5);
        leituras.add(livro6);
        leituras.add(livro7);
        leituras.add(livro8);
        leituras.add(livro9);
        leituras.add(livro10);

        for (Books leitura : leituras) {
            System.out.println("Código: " + leitura.getId() + "\nTítulo: " + leitura.getTitle() + "\n");
        }

        System.out.println("Digite o código do livro que você deseja visualizar: ");
        int codigo = sc.nextInt();
        switch (codigo) {
            case 1:
                System.out.println(livro1.exibirLivro());
                break;
            case 2:
                System.out.println(livro2.exibirLivro());
                break;
            case 3:
                System.out.println(livro3.exibirLivro());
                break;
            case 4:
                System.out.println(livro4.exibirLivro());
                break;
            case 5:
                System.out.println(livro5.exibirLivro());
                break;
            case 6:
                System.out.println(livro6.exibirLivro());
                break;
            case 7:
                System.out.println(livro7.exibirLivro());
                break;
            case 8:
                System.out.println(livro8.exibirLivro());
                break;
            case 9:
                System.out.println(livro9.exibirLivro());
                break;
            case 10:
                System.out.println(livro10.exibirLivro());
                break;
        }

        System.out.println("Desejar marcar o livro como 'Já lido'?");
        System.out.println("1 -- Sim");
        System.out.println("0 -- Não");
        int confirma = sc.nextInt();
        if (confirma == 1) {
            user1.acrescentaPonto(1);
            System.out.println("Seus pontos são: " + user1.getScore());
        }

        for (Books livro : leituras) {
            if (livro.getPages() >= 100 && livro.getPages() < 200) {
                user1.acrescentaPonto(1);
                break;
            } if (livro.getPages() >= 200 && livro.getPages() < 300) {
                user1.acrescentaPonto(2);
                break;
            } if (livro.getPages() >= 300 && livro.getPages() < 400) {
                user1.acrescentaPonto(3);
                break;
            } if (livro.getPages() >= 400 && livro.getPages() < 500) {
                user1.acrescentaPonto(4);
                break;
            } if (livro.getPages() >= 500 && livro.getPages() < 600) {
                user1.acrescentaPonto(5);
                break;
            } if (livro.getPages() >= 600 && livro.getPages() < 700) {
                user1.acrescentaPonto(6);
                break;
            } if (livro.getPages() >= 700 && livro.getPages() < 800) {
                user1.acrescentaPonto(7);
                break;
            } if (livro.getPages() >= 800 && livro.getPages() < 900) {
                user1.acrescentaPonto(8);
                break;
            } if (livro.getPages() >= 900 && livro.getPages() < 1000) {
                user1.acrescentaPonto(9);
                break;
            } if (livro.getPages() >= 1000) {
                user1.acrescentaPonto(10);
                break;
            }
        }
        System.out.println("Pontos atualizados: " + user1.getScore());
    }
}