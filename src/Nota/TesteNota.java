package Nota;

public class TesteNota {
    public static void main(String[] args) {
        Nota nota = new Nota();
        
        float nota1 = 25;
        float nota2 = 55;
        float nota3 = 75;
        float nota4 = 95;

        char conceito1 = nota.retornaConceitoNota(nota1);
        char conceito2 = nota.retornaConceitoNota(nota2);
        char conceito3 = nota.retornaConceitoNota(nota3);
        char conceito4 = nota.retornaConceitoNota(nota4);

        System.out.println("Nota 1: " + nota1 + " => Conceito: " + conceito1);
        System.out.println("Nota 2: " + nota2 + " => Conceito: " + conceito2);
        System.out.println("Nota 3: " + nota3 + " => Conceito: " + conceito3);
        System.out.println("Nota 4: " + nota4 + " => Conceito: " + conceito4);
    }
}

