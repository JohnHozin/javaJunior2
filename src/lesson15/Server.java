package lesson15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


    public class Server {
        public static void main(String[] args) {
            //ArrayList<Socket> sockets = new ArrayList<>();
            ArrayList<User> users = new ArrayList<>();
            try {
                ServerSocket serverSocket = new ServerSocket(9446);
                System.out.println("Сервер запущен");
                while (true) {
                    Socket socket = serverSocket.accept();
                    User user = new User(socket);
                    users.add(user);
                    //sockets.add(socket);
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            //String name = null;
                            try {
                                //DataInputStream is = new DataInputStream(socket.getInputStream());
                                DataInputStream is = user.getIs();
                                //DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                                DataOutputStream out = user.getOut();
                                out.writeUTF("Введите имя: ");
                                //name = is.readUTF();
                                user.setName(is.readUTF());
                                System.out.println(user.getName() + " подключился");
                                while (true) {
                                    String massage = is.readUTF();
                                    //for(Socket socket1:sockets){
                                    for (User user1 : users) {
                                        //DataOutputStream out1 = new DataOutputStream(socket1.getOutputStream());
                                        DataOutputStream out1 = user1.getOut();
                                        if (user1.getUuid()==(user.getUuid())){
                                            continue;
                                        }
                                        out1.writeUTF(user.getName() + ": " + massage);
                                    }

                                    System.out.println(user.getName() + ": " + massage);
                                }
                            } catch (IOException e) {
                                //sockets.remove(socket);
                                users.remove(user);
                                System.out.println(user.getName() + ": отключился");
                                //for (Socket socket1 : sockets) {
                                for (User user1 : users) {
                                    try {
                                        //DataOutputStream out1 = new DataOutputStream(socket1.getOutputStream());
                                        DataOutputStream out1 = user1.getOut();
                                        out1.writeUTF(user.getName() + ": отключился");
                                    } catch (IOException ex) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    });
                    thread.start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


