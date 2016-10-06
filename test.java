import java.io.*;
import java.util.*;
import java.math.*;
public class test{





public static void main(String[] args) {
	//three parameters
	if(args.length != 3){
		System.out.println("ERROR: THREE PARAMATERS DUUUDE");
		System.exit(-1);
	}
	String encrypt = "e",decrypt = "d";
	String option = args[0],keyFile = args[1],inputFile = args[2];
	Scanner scan_keyFile;
	Scanner scan_InputFile;

	try{
		scan_keyFile = new Scanner(new File(keyFile));
		scan_InputFile = new Scanner(new File(inputFile));
	} catch(java.io.FileNotFoundException e){
		System.out.println("Unable to open" + keyFile + " or " + inputFile);
		return;
	}

	String key = scan_keyFile.nextLine().trim();
	//System.out.println("Key: " + key);
	String binary = new BigInteger(key,16).toString(2);
	//pad binary string
	while(binary.length() < 256){
		binary = "0" + binary;
	}
	
	for (int i = 0;i < binary.length();i++) {
		bin_key[i] = Integer.parseInt(String.valueOf(binary.charAt(i)));
	}


	System.out.println(hex);
	System.out.println(binary);
	scan_keyFile.close();
	scan_InputFile.close();
	//System.out.println("Key: " + key);
	
	/*String binary = new BigInteger(key,16).toString(2);
	//pad binary string
	while(binary.length() < 256){
		binary = "0" + binary;
	}

	//char bin_key [] = binary.toCharArray();
	int bin_key [] = new int [256];
	for (int i = 0;i < binary.length();i++) {
		bin_key[i] = Integer.parseInt(String.valueOf(binary.charAt(i)));
	}

	//System.out.println("Key: " + Arrays.toString(bin_key));

	scan_keyFile.close();

	File output_file;
	if(option.equalsIgnoreCase(encrypt)){
		output_file = new File(inputFile + ".enc");
	}else{
		output_file = new File(inputFile + ".dec");
	}

		//encrypt file
		while(scan_InputFile.hasNextLine()){

			//read line convert to bin array, encrypt and finally read to output file 
			String block = scan_InputFile.nextLine().trim();
			//System.out.println("Text Line: " + block);
			validate_block(block);
			String temp = new BigInteger(block,16).toString(2);
			//pad line
			while(temp.length() < 128){
				temp = "0" + temp;
			}
			//char bin_block [] = temp.toCharArray();

			int bin_block [] = new int [128];
			for (int i = 0;i < temp.length();i++) {
				bin_block[i] = Integer.parseInt(String.valueOf(temp.charAt(i)));
			}

			//System.out.println("Line: " + Arrays.toString(bin_block));
			//System.out.println("length: " + bin_block.length);
			int [] output_block;
			if(option.equalsIgnoreCase(encrypt)){
				output_block = init_encryption(bin_block,bin_key);
			}else{
				output_block = init_decryption(bin_block,bin_key);
			}
			//System.out.println("Output: " + Arrays.toString(output_block));
			//write to file 
		}	

*/

}


}