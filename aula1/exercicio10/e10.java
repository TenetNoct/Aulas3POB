package aula1.exercicio10;


import java.util.Scanner;

// No exercício 10 decidi tomar a iniciativa de tentar testar coisas diferentes 
// dos outros códigos então fiz a busca de como quebrar Strings 
// aplicar funções que aqui são chamadas de métodos 
// Distância euclidiana é a distância entre dois pontos em um plano cartesiano

public class e10 {

    public static double calcularDistancia(String ponto1, String ponto2) {
        // Divide a string do primeiro ponto usando a vírgula como separador, criando um array com as coordenadas x e y
        String[] coordenadas1 = ponto1.split(",");
        // Divide a string do segundo ponto usando a vírgula como separador, criando um array com as coordenadas x e y
        String[] coordenadas2 = ponto2.split(",");

        // Converte a primeira posição do array (coordenada x) do primeiro ponto para um número decimal, removendo espaços extras
        double x1 = Double.parseDouble(coordenadas1[0].trim());
        // Converte a segunda posição do array (coordenada y) do primeiro ponto para um número decimal, removendo espaços extras
        double y1 = Double.parseDouble(coordenadas1[1].trim());
        // Converte a primeira posição do array (coordenada x) do segundo ponto para um número decimal, removendo espaços extras
        double x2 = Double.parseDouble(coordenadas2[0].trim());
        // Converte a segunda posição do array (coordenada y) do segundo ponto para um número decimal, removendo espaços extras
        double y2 = Double.parseDouble(coordenadas2[1].trim());

        // Calcula a distância euclidiana entre os dois pontos usando a fórmula: √[(x₂-x₁)² + (y₂-y₁)²]
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Retorna o valor calculado da distância entre os dois pontos
        return distancia;
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Porfavor digite o valor de x e y do primeiro ponto no seguinte formato x,y: ");
        
        String ponto1 = scanf.nextLine();

        System.out.print("Porfavor digite o valor de x e y do segundo ponto no seguinte formato x,y: ");

        String ponto2 = scanf.nextLine();

        double distancia = calcularDistancia(ponto1, ponto2);

        System.out.println("A distância entre os pontos é: " + distancia);  

        scanf.close();
    }
}
