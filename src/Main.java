import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("Alphabet.txt");
        writer.write("Aa\n");
        writer.write("Bb\n");
        writer.write("Cc\n");
        writer.write("Dd\n");
        writer.write("Ee\n");
        writer.write("Ff\n");
        writer.write("Gg\n");
        writer.write("Hh\n");
        writer.write("Ii\n");
        writer.write("Jj\n");
        writer.write("Kk\n");
        writer.write("Ll\n");
        writer.write("Mm\n");
        writer.write("Nn\n");
        writer.write("Oo\n");
        writer.write("Pp\n");
        writer.write("Qq\n");
        writer.write("Rr\n");
        writer.write("Ss\n");
        writer.write("Tt\n");
        writer.write("Uu\n");
        writer.write("Vv\n");
        writer.write("Ww\n");
        writer.write("Xx\n");
        writer.write("Yy\n");
        writer.write("Zz\n");
        for (int i = 0; i <=9; i++) {
            writer.write(i+"\n");
        }
        writer.close();
        FileReader reader=new FileReader("Alphabet.txt");
        Scanner sc=new Scanner(reader);
        int a=1;
        int b=36;
        while(a<=b && sc.hasNext()){
            System.out.println(a+" "+sc.nextLine());
            a++;
        }
        reader.close();
    }
}
