package dataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
@SuppressWarnings("resource")
public class ToReadFromCSVFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("./testResources/testData.csv");

		CSVReader csvReader = new CSVReader(fr);
		String[] lineData = csvReader.readNext();
		for(String d : lineData) {
			System.out.print(d);
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

		List<String[]> usernameData = csvReader.readAll();
		for(String[] sarr: usernameData) {
			for(String d : sarr) {
				System.out.print(d);
			}
			System.out.println();
		}
	}

}

