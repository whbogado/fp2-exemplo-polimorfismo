
import utfpr.ct.dainf.if62c.exemplos.Figura;
import utfpr.ct.dainf.if62c.exemplos.Quadrado;
import utfpr.ct.dainf.if62c.exemplos.Retangulo;
import utfpr.ct.dainf.if62c.exemplos.TrianguloEquilatero;

/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class ExemploPolimorfismo {

    public static final String FORMAT_MSG = "%s de %s = %g";
    public static void main(String[] args) {
        // um vetor de 4 figuras
        Figura[] figuras = new Figura[4];

        // instanciação dos elementos do vetor de figuras
        figuras[0] = new Quadrado(1);
        figuras[1] = new TrianguloEquilatero(2);
        figuras[2] = new Retangulo(3, 4);
        figuras[3] = new Retangulo(5, 6);

        // processamento das figuras
        for (Figura f : figuras) {
            System.out.println(String.format(FORMAT_MSG, "Área", f, f.getArea()));
            System.out.println(String.format(FORMAT_MSG, "Perímetro", f, f.getPerimetro()));
            System.out.println();
        }

        // usando a função somaAreas
        Retangulo r = new Retangulo(2.5, 5.4);
        TrianguloEquilatero t = new TrianguloEquilatero(3.45);
        System.out.println(String.format("Soma das áreas de %s e %s: %g",
            r, t, somaAreas(r, t)));
    }

    // um método que recebe argumentos do tipo Figura
    public static double somaAreas(Figura f1, Figura f2) {
        return f1.getArea() + f2.getArea();
    }
}
