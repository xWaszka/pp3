public class Processor {
    int cores;
    int threads;
    int speed;

    public Processor(int cores, int threads, int speed){
        this.cores = cores;
        this.threads = threads;
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString(){
        return ("Cores: " + cores + " Threads: " + threads + " Speed: " + speed + "MHz");
    }
}
