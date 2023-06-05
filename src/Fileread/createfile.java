package Fileread;
	import java.util.Properties;
	import java.io.FileWriter;
	import java.io.IOException;

	public class createfile {
	    public static void main(String[] args) {
	        Properties props = new Properties();
	        props.setProperty("username", "root");
	        props.setProperty("password", "yeswanth@123");

	        try {
	            FileWriter writer = new FileWriter("File3.txt");
	            props.store(writer,"Properties file");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

