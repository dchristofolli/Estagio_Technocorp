package com.github.dchristofolli.technocorp.estagio.apresentacao02.threadSemaphoreSynchronized;

public class Filosofo extends Thread {
    public static final String NOME_F1 = "Filosofo 1";
    public static final String NOME_F2 = "Filosofo 2";
    public static final String NOME_F3 = "Filosofo 3";
    public static final String NOME_F4 = "Filosofo 4";
    public static final String NOME_F5 = "Filosofo 5";

    private static final int TEMPO_OCIOSO = 1000;

    public static Garfo[] garfos;

    private int usaGarfo1, usaGarfo2;

    public Filosofo(String name, int usaGarfo1, int usaGarfo2) {
        super(name);
        this.usaGarfo1 = usaGarfo1;
        this.usaGarfo2 = usaGarfo2;
    }

    @Override
    public void run() {

        while (true) {
            if (pegarGarfo()) {

                System.out.println(getName() + " está com fome... ");
                System.out.print(getName() + " pega o " + garfos[usaGarfo1].getNome() +
                                   " e o " + garfos[usaGarfo2].getNome());
                System.out.println(" e começa a comer...\n");
                filosofoOcioso(TEMPO_OCIOSO);

                System.out.println(getName() + " fica pensando enquanto faz a digestão");
                garfos[usaGarfo1].release();
                garfos[usaGarfo2].release();
                filosofoOcioso(TEMPO_OCIOSO);
            }
        }
    }


    private boolean pegarGarfo(){
        try {
            garfos[usaGarfo1].acquire();
            garfos[usaGarfo2].acquire();

            if(garfos[usaGarfo1].availablePermits() == 0 && garfos[usaGarfo2].availablePermits() == 0) {
                return true;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return false;
    }

    private void filosofoOcioso(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
