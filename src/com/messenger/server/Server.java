package com.messenger.server;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public int port;


    //Здесь идём и гуглим что такое сокеты, который в дальнейшем получает экземаляр объекта
    private DatagramSocket socket;
    private Thread serverRun, manage, receive; // Через класс Thread собираемся создать потоки
    private boolean running = false; // В дальнейшем мы его переобределим

    public Server(int port) {
        this.port = port;
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }

        //Создаём несколь потоков
        //Runnable() - Это внутрений интерфейс класса Thread
        serverRun = new Thread(new Runnable() {
            @Override
            public void run() {
                running = true;
                manage();
                receive();
            }
        }, "serverRun"); //МетаДанные Java
    }

    private void manage() {
        manage = new Thread(new Runnable() {
            @Override
            public void run() {
                while (running) {
                    //TODO(Edu): manage the (client), potkclichen
                }

            }
        });
        manage.start();
    }
    private void receive() {
        receive = new Thread(new Runnable() {
            @Override
            public void run() {
                while (running) {
                    //TODO(Edu): manage the (client), potkclichen
                }

            }
        });
        receive.start();

    }
}
