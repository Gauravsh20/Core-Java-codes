package Fileread;
	import java.util.Properties;
	import java.io.FileInputStream;
	import java.io.IOException;

	public class Readfile {
	    public static void main(String[] args) {
	        Properties props = new Properties();

	        try {
	            FileInputStream fis = new FileInputStream("file3.txt");
	            props.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        String username = props.getProperty("username");
	        String password = props.getProperty("password");
	        System.out.println("The value of the property is: " + username);
	        System.out.println("The value of the property is: " + password);
	    }
	}

