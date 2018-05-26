package run;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.xml.bind.JAXBException;

import xml.BDPC;

public class Run {
	public static void main (String args[]){
		File logFile = null;
		PrintStream logStream = null;
		try {
			logFile = new File("log\\logFile.txt");
			logStream = new PrintStream(logFile);
			BDPC bdpc;

			bdpc = xml.XmlOps.readXmlInput();

			bdpc.sort();

			System.out.println("Die nächsten " + args[0] + " Geburtstage sind:\n");
			for(int i = 0; i < Integer.parseInt(args[0]); i++){
				System.out.println(bdpc.getBd_list().get(i)  + " Er/Sie wird in "  + 
						bdpc.getBd_list().get(i).daysTillBirthday() + " Tagen "+ 
						bdpc.getBd_list().get(i).getAge() + "Jahre alt");
			}
			Thread.sleep(5000);

		} catch (JAXBException e) {
			e.printStackTrace(logStream);
		} catch (InterruptedException e) {
			e.printStackTrace(logStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace(logStream);
		}
	}
}