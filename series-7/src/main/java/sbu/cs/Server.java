package sbu.cs;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class Server {
        // uploaded file path
        private String filePath;
        // socket server address and port number
        private String host;
        private int port;

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

    /**
     * Create a socket and connect to server then send fileName and after that send file to be saved on server side.
     *  in here filePath == fileName
     *
     * @param args a string array with one element
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // below is the name of directory which you must save the file in it
        String directory = args[0];    // default: "server-database"
            Server fu = new Server();
            fu.setHost("127.0.0.1");
            fu.setPort(9000);
            fu.setFilePath(directory);
            fu.uploadFile("book.pdf");
        }

        /**
         * Client file upload
         * @param fileName filename
         */
        public void uploadFile(String fileName) {
            Socket s = null;
            try {
                s = new Socket(host, port);

                // Select the file to transfer
                File fi = new File(filePath);
                System.out.println("file length:" + (int) fi.length());

                DataInputStream fis = new DataInputStream(new FileInputStream(filePath ));
                DataOutputStream ps = new DataOutputStream(s.getOutputStream());
                ps.writeUTF(fi.getName());
                ps.flush();
                ps.writeLong((long) fi.length());
                ps.flush();

                int bufferSize = 8192;
                byte[] buf = new byte[bufferSize];

                while (true) {
                    int read = 0;
                    if (fis != null) {
                        read = fis.read(buf);
                    }

                    if (read == -1) {
                        break;
                    }
                    ps.write(buf, 0, read);
                }
                ps.flush();
                // Note that the socket link is closed, otherwise the client will wait for the server data to come over.
                // Until the socket times out, the data is incomplete.
                fis.close();
                ps.close();
                s.close();
                System.out.println("File Transfer Complete");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
