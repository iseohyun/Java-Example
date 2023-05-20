/*
 * C_Quiz파일을 생성합니다. 디렉토리 경로에 유의하세요. eclipse환경에서 제작되었습니다.
 */

package h_FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class B_MakeJavaFile {
    public static void main(String[] args) {
        try {
            String[] test = {
                    "package h_FileIO;\n",
                    "import java.io.*;\n",
                    "public class C_Quiz {\n",
                    "\tpublic static void main(String[] args) {\n",
                    "\t\ttry {\n",
                    "\t\t\tString str = \"Run E_IOStream > B_FileIO > B_MakeJavaFile\";\n",
                    "\t\t\tFile file = new File(\"Librarys\\\\h_FileIO\\\\C_Quiz.java\");\n",
                    "\t\t\tOutputStream stream = new FileOutputStream(file);\n",
                    "\t\t\tbyte[] binary = str.getBytes();\n",
                    "\t\t\tstream.write(binary);\n",
                    "\t\t\tstream.close();\n",
                    "\t\t} catch (Throwable e) {\n",
                    "\t\t\te.printStackTrace();\n",
                    "\t\t}\n",
                    "\t}\n",
                    "}",
            };

            File file = new File("Librarys\\h_FileIO\\C_Quiz.java");
            OutputStream stream = new FileOutputStream(file);

            for (String str : test) {
                byte[] binary = str.getBytes();
                stream.write(binary);
            }
            stream.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
