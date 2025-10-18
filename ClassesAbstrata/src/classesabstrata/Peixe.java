package classesabstrata;

public class Peixe extends Animal {

    public Peixe() {
        super(0);
    }

    @Override
    public void caminha() {
        System.out.println("O peixe nada ao inves de caminhar");
    }

    @Override
    public void emitirSom() {
        System.out.println("O peixe nao emite som audivel");
    }

    // sobrescrita do metodo comer
    @Override
    public void comer() {
        System.out.println("O peixe está comendo algas");
    }
}