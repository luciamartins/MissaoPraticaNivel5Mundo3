
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroclient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;
/**
 *
 * @author Lucia
 */
public class CadastroClient {

    /**
     * @throws java.io.IOException
     */
    public void run() throws IOException, ClassNotFoundException {
        try(Socket socket = new Socket("localhost", 4321)){
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            out.writeUTF("op1");
            out.writeUTF("op1");
            out.flush();

            out.writeUTF("L");
            out.flush();

            List<Produto> lista = (List<Produto>) in.readObject();
            for(Produto p : lista){
                System.out.println(p.getNome() + " - " + p.getQuantidade());
            }
        }catch(IOException | ClassNotFoundException ex){
            System.out.println("Client error...");
            Logger.getLogger(CadastroClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new CadastroClient().run();
    }

}