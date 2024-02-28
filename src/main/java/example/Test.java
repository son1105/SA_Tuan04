package example;

import jdepend.xmlui.JDepend;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("result.xml"));
        JDepend depend = new JDepend(printWriter);
        depend.addDirectory("T:\\nts\\tuan04");
        depend.analyze();

        String command_to_playwith =" cd T:\\tuan04\\jdepend-ui & npm run jdepend-ui T:\\nts\\tuan04\\result.xml example example2";
        System.out.println("Opening cmd window");
        try {
            String command = "cmd /c" + " start" + command_to_playwith;

            // starting the child process ....
            Process childprocess = Runtime.getRuntime().exec(command);
//            Process c = Runtime.getRuntime().exec("npm run jdepend-ui T:\\nts\\tuan04\\result.xml example example2");
            System.out.println("The child process is Alive: " + childprocess.isAlive());
            System.out.println();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
