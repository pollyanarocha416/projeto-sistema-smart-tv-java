public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("canal atual? "+smartTv.canal);
        System.out.println("qual o volume? "+smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("qual o volume atual? "+ smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("qual canal estar? "+smartTv.canal);
    }
}
