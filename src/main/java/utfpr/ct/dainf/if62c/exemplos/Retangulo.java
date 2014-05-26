package utfpr.ct.dainf.if62c.exemplos;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Retangulo extends Quadrilatero {

    public Retangulo() {
        super();
    }

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    public double getArea() {
        return getBase() * getAltura();
    }

    public double getPerimetro() {
        return (getBase() + getAltura()) * 2;
    }
}
