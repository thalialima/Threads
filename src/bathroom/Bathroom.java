package bathroom;

public class Bathroom {
    public void fazendoNumero1() {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(name + " Entrando no bannheiro");
            System.out.println(name + " Fazendo coisa rápida");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " Saindo do banheiro");
        }
    }

    public void fazendoNumero2() {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(name + " Entrando no banheiro");
            System.out.println(name + " Fazendo coisa demorada");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " Saindo do banheiro");
        }
    }
}
