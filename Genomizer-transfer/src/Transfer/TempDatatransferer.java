package Transfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;

public class TempDatatransferer {

	private FileInputStream instream;
	private Socket socket;

	public TempDatatransferer(String filepath, Socket socket) throws FileNotFoundException {
		instream = new FileInputStream(filepath);
		this.socket = socket;
	}

	public FileInputStream getInputStream() {
		return instream;
	}

	public Socket getSocket() {
		return socket;

	}


}
