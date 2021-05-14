package aulas.oo.LiskovSubstitutionPrinciple.problem;

public class Main {

    public static void main(String[] args){
        Retangulo retangulo = new Quadrado();

        retangulo.setAltura(10);;
        retangulo.setLargura(5);

        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Area: " + retangulo.getArea());

    }
}
