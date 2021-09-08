public class Main implements Runnable {

    Engine engine = new Engine();

    public static void main(String[] args) {
        new Thread(new Main()).start();

    }

    @Override
    public void run() {
        while (true) {
            engine.repaint();
            if (!engine.resettle) {
                engine.checkVictoryStatus();
            }
        }

    }
}
