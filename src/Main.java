import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter arquivador = new FileWriter("arquivo.txt");
            arquivador.write("Conteúdo a ser gravado no arquivo");
            arquivador.close();
        }catch(IOException e){
            System.out.println("o arquivo está vazio");
        }

    }
}