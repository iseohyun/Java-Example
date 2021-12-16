package B_FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class B_MakeJavaFile {
	public static void main(String[] args) {
		try {
			String[] test = {
					"package B_FileIO;\n",
					"import java.io.*;\n",
					"public class C_Quiz {\n",
					"\tpublic static void main(String[] args) {\n",
					"try {\n",
					"\t\tString str = \"Run E_IOStream > B_FileIO > B_MakeJavaFile\";\n",
					"\t\tFile file = new File(\"src\\\\B_FileIO\\\\C_Quiz.java\");\n",
					"\t\tOutputStream stream = new FileOutputStream(file);\n",
					"\t\tbyte[] binary = str.getBytes();\n",
					"\t\tstream.write(binary);\n",
					"\t\tstream.close();\n",
					"\t\t} catch (Throwable e) {\n",
					"\t\t\te.printStackTrace();\n",
					"\t\t}\n",
					"\t}\n",
					"}",
			};

			File file = new File("src\\B_FileIO\\C_Quiz.java");
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
