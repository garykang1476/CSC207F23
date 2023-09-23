package week3;

import java.io.*;

public class FileIOExample {

    public static void main(String[] args) throws IOException {
//        FileReader reader = new FileReader("data.csv");
//        BufferedReader bufferedReader = new BufferedReader(reader);
//
//        String line;
//        while((line = bufferedReader.readLine()) != null){
//            String[] temp = line.split(",");
//            System.out.println(temp[1]);
//
//        }
//        reader.close();

        FileWriter writer =  new FileWriter("data.csv");
        BufferedWriter  bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("1,Gary,0012");
        bufferedWriter.newLine();
        bufferedWriter.write("2,Joy,1012\n");
        bufferedWriter.write("3,Alex,999");
        bufferedWriter.newLine();
        bufferedWriter.close();


    }
}
