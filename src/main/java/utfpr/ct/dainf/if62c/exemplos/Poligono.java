package utfpr.ct.dainf.if62c.exemplos;

import java.io.Serializable;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public abstract class Poligono implements Figura, Serializable {

    /**
     * Retorna o nome da figura.
     * Este método retorno o nome não qualificado da classe.
     * @return O nome da figura.
     */
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getNome();
    }

}
