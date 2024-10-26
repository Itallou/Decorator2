package decorator;

public class ChocolateDecorator extends BebidaDecorator {

    public ChocolateDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + ", Chocolate";
    }

    @Override
    public double obterCusto() {
        return super.obterCusto() + 3.0;
    }
}