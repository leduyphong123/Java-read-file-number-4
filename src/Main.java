import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try{
            FileReader fr = new FileReader("gia.txt");
            BufferedReader br= new BufferedReader(fr);
            String line="";
            while ((line=br.readLine()) !=null){
                getGia(line);
            }
            fr.close();
            br.close();
        }catch (Exception e){

        }
    }
    public static void getGia(String line){
        String[] result = line.split(",");
        System.out.println("id: " +result[0]+" - Mv: "+result[1] +" - Qg: "+result[2]);
    }
}