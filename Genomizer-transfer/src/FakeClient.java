import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FakeClient {

    public static void main(String[] args) {
	ServerSocket servsock;
	String rawFile = "/kurser/5DV151/VT14/examples/Data/Raw/MOF_male_wt_reads.fastq";
	String myFiles = "/home/dv12/dv12tkn/Documents/big_file.txt";
	try {
	    servsock = new ServerSocket(1337);
	    File myFile = new File(myFiles);
	    while (true) {
		Socket sock = servsock.accept();
		byte[] mybytearray = new byte[(int) myFile.length()];
		BufferedInputStream bis = new BufferedInputStream(
			new FileInputStream(myFile));
		bis.read(mybytearray, 0, mybytearray.length);
		OutputStream os = sock.getOutputStream();
		os.write(mybytearray, 0, mybytearray.length);
		System.out.println("Writing to: "
			+ sock.getInetAddress().getCanonicalHostName());
		os.flush();
		sock.close();
	    }

	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }
}
