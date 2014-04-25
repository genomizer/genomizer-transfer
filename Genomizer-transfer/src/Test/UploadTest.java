package Test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Before;
import org.junit.Test;

import Transfer.TempDatatransferer;

public class UploadTest {


	private TempDatatransferer datatransferer;

	
	
	@Before
	public void setup() {
		try {
			datatransferer = new TempDatatransferer("/home/c11/c11vlg/Downloads/test.txt", new Socket("ganger", 1111));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    @Test
    public void shouldNotHaveNullSocket() {
    	assertNotNull(datatransferer.getSocket());
    }

    @Test
    public void shouldHaveValidConnection() {

    }

}
