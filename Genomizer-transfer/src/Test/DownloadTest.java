package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.Socket;

import org.junit.Test;

import download.DownloadData;

public class DownloadTest {

    @Test
    public void socketNotNull() {
	DownloadData dd = new DownloadData("C:/hej", new Socket());
	assertNotNull(dd.getSocket());
    }

    @Test
    public void filePathIsFilePath() {
	String filePath = "C:/hej";
	DownloadData dd = new DownloadData(filePath, new Socket());
	assertEquals(filePath, dd.getFilePath());
    }

    // @Test
    // public void testThatSocketIsConnected() {
    // DownloadData dd;
    // try {
    // String ipAddress = "127.0.0.1";
    // dd = new DownloadData("C:/hej", new Socket(ipAddress, 1337));
    // assertEquals(ipAddress, dd.getSocket().getInetAddress());
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    //
    // }
}
