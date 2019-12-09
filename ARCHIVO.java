import java.io.*;
public class ARCHIVO {
    public static void main(String[] args) {
        try{
            String ruta="C:\\Users\\estudiante\\Desktop\\Archivo\\Hesca1110.txt";
            File Archivo1 = new File(ruta);
            
            if(!Archivo1.exists()){
                Archivo1.createNewFile();
                System.out.println("Archivo creado...");
            }
            
            /*FileWriter fw = new FileWriter(Archivo1,true);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("En Archivo");
            bw.write("Esta es la primera linea oja");
            bw.newLine();
            bw.write("Esta es la segunda linea");
            bw.newLine();
            bw.write(" ");
            String x="Esta es una nueva linea2";
            String nombre="Juan";
            String edad="25";
            bw.write(nombre+";"+edad);
            bw.append(x);
            bw.close();
            fw.close();*/
            
            FileReader fr;
            BufferedReader br;
            fr=new FileReader(ruta);
            br=new BufferedReader(fr);
            int con=0; String lin="";
            while(br.ready()){
                //System.out.println(br.readLine());
                con++;
                lin=br.readLine();
                System.out.println("La linea "+con+" tiene "+lin.length());
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
