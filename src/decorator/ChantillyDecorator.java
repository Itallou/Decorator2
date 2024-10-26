package decorator;

public class ChantillyDecorator extends BebidaDecorator {

    public ChantillyDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + ", Chantilly";
    }

    @Override
    public double obterCusto() {
        return super.obterCusto() + 5.0;
    }
}