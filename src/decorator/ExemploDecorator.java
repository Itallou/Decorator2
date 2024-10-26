package decorator;

public class ExemploDecorator {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
	
	        cafe = new LeiteDecorator(cafe);
        cafe = new AcucarDecorator(cafe);
        cafe = new ChocolateDecorator(cafe);
        cafe = new ChantillyDecorator(cafe);
        

        System.out.println("Bebida: " + cafe.obterDescricao());
        System.out.println("Custo total: R$" + cafe.obterCusto());
    }
    
}