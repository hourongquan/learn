package Guara;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.common.io.LineProcessor;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileDemo {

    public static void main(String[] args) {
        File original = new File(Thread.currentThread().getContextClassLoader().getResource("").getPath()+"copy.txt");
        File desFile = new File(Thread.currentThread().getContextClassLoader().getResource("").getPath()+"des.txt");
        File newFile = new File(Thread.currentThread().getContextClassLoader().getResource("").getPath()+"newFile.txt");
        File writeFile = new File(Thread.currentThread().getContextClassLoader().getResource("").getPath()+"writeFile.txt");
        File linesFile = new File(Thread.currentThread().getContextClassLoader().getResource("").getPath()+"lines.txt");

        try{
            Files.copy(original,desFile);
            Files.move(original, newFile);
            Files.write("write",writeFile, Charsets.UTF_8);
            Files.append(" a hello",writeFile,Charsets.UTF_8);

            List<String> lines = Files.readLines(linesFile, Charsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }

            //通过回调函数单行处理
           String allLines= Files.readLines(linesFile, Charsets.UTF_8,new LineProcessor<String>() {
                private String allLines  = "";
                public boolean processLine(String s) throws IOException {
                    allLines += s+" ";
                    return true;
                }
                public String getResult() {
                    return allLines;
                }
            });
            System.out.println(allLines);


        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
