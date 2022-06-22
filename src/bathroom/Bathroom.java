package bathroom;

public class Bathroom {

    private boolean isDirty = true;

    public void fazendoNumero1() {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(name + " Entrando no bannheiro");
            while (isDirty) {
                System.out.println(name + " eca, o banheiro está sujo");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name + " Fazendo coisa rápida");
            this.isDirty = true;
            sleeping(5000);
            System.out.println(name + " Saindo do banheiro");
        }
    }

    public void fazendoNumero2() {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(name + " Entrando no banheiro");
            while (isDirty) {
                System.out.println(name + " eca, o banheiro está sujo");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name + " Fazendo coisa demorada");
            this.isDirty = true;
            sleeping(10000);
            System.out.println(name + " Saindo do banheiro");
        }
    }

    public void cleaning() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Batendo na porta");

        synchronized (this) {
            if (!isDirty) {
                System.out.println(name + " O banheiro não está sujo, estou saindo");
                return;
            }
            System.out.println(name + " limpando o banheiro");
            sleeping(2000);
            this.isDirty = false;
            this.notifyAll();
        }
    }

    private void sleeping(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
