package download;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class DownloadData extends Thread {

	private int chunkSize = 1000;
	private String filePath;

	private Socket socket;


	public DownloadData(String filePath, Socket socket) {
		this.filePath = filePath;
		this.socket = socket;
	}

	@Override
	public void start() {

			try {
				byte[] byteArray = new byte[chunkSize];
				FileOutputStream fos = new FileOutputStream(filePath);
				InputStream is = socket.getInputStream();
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				int bytesRead = is.read(byteArray, 0, byteArray.length);
			    bos.write(byteArray, 0, byteArray.length);
			    bos.close();
			    socket.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

	public Socket getSocket() {
		return socket;
	}

	public String getFilePath() {
		return filePath;
	}

	public static void main(String[] args) {

		try {
			DownloadData dd = new DownloadData("/home/dv12/dv12tkn/test.txt",
					new Socket("silence", 1337));
			dd.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
