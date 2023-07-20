import com.messenger.server.Server;

public class Main {
    private int port;
    private Server server;

    //Конструктор создает экземпляр класса Server
    public Main(int port){
        this.port = port;
        new Server(port);
    }

    public static void main(String[] args) {
        int port;
        /*
        Проверяется условие длина массива args не равен 1,
        Думаю что это нужно что бы сказать серверу, чувак в args есть что-то можешь начинать работать.
         */
        if(args.length != 1) {
            System.out.println("Пользователь: java -jar programa.jar [port]");
            System.exit(1);
        }
        port = Integer.parseInt(args[0]);
        new Main(port);

    }
}