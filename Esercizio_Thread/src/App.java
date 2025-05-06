public class App {
    static final int MAX = 4;
    public static void main(String[] args) throws Exception {
        String corridori[] = {"Giovanni", "Claudio", "Giuseppe", "Michele"};
        Corridore lista[] = new Corridore[MAX];

        System.out.println("Pronti Partenza...VIA!");

        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Corridore(corridori[i]);
            lista[i].start();
        }
    }
}

class Corridore extends Thread {
    private String nome;

    public Corridore(String nome){
        this.nome = nome;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(nome + " " + i + " metri");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
        System.out.println("Il Corridore " + nome + " è arrivato");
    }
}


