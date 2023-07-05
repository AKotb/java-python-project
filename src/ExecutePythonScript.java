
/**
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ahmed.kotb
 *
 */
public class ExecutePythonScript {

	public void executePython() {
		String[] cmd = new String[5];
		cmd[0] = "python";
		cmd[1] = "C:/Users/ahmed.kotb/EclipseProjects/Java-Python-Project/src/my-python-file.py";
		cmd[2] = "Param11";
		cmd[3] = "Param22";
		cmd[4] = "Param33";

		try {
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
