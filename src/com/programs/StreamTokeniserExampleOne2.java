package com.programs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.nio.channels.NonReadableChannelException;

public class StreamTokeniserExampleOne2 {

	public static void main(String[] args) throws IOException {

		String textToBeSearchedString = "ewrwer ERWERW 2343432 45 43543 435. 454.45435 54.4545 #@$#@$$ ;)";
		// this works fine without @ being printed in first line in output.
//	String textToBeSearchedString = "ewrwer ERWERW 2343432 #@$#@$$ ;)"; 
		FileOutputStream fos = new FileOutputStream("E:/Idly.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeUTF(textToBeSearchedString);
		oos.flush();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Idly.txt"));

		Reader r1 = new BufferedReader(new InputStreamReader(ois));

		StreamTokenizer st = new StreamTokenizer(r1);

		// use while loop and check if we get output.
		// we are also omitting the sentence where we mentioned if we get exclamation
		// then exit.
		boolean endoffile = false;
		while (!endoffile) {

			int token1 = st.nextToken();
			switch (token1) {
			case StreamTokenizer.TT_EOF: {
				System.out.println("end of file token");
				endoffile = true;
				break;
			}
			case StreamTokenizer.TT_EOL: {
				System.out.println("end of line token");
				break;
			}
			case StreamTokenizer.TT_NUMBER: {
				double d1 = st.nval;
				System.out.println("number token " + d1);
				break;
			}
			case StreamTokenizer.TT_WORD: {
				String s2 = st.sval;
				System.out.println("word token " + s2);
				break;
			}
			default:
				char c1 = (char) token1;
				System.out.println(c1 + " is printed");
			}
		}

	}

	// why @ is printed as first line in output
	// The @ being printed as the first line in the output is due to how the
	// StreamTokenizer processes the ObjectInputStream. The ObjectInputStream reads
	// the file in its serialized format, and the data is not interpreted as plain
	// text until deserialized properly.
	// When you used writeUTF to write the string to the file, it added additional
	// metadata specific to the UTF encoding format. These metadata bytes are
	// interpreted as part of the stream when read back using the StreamTokenizer,
	// which causes unexpected behavior like the @ appearing at the beginning.
	// Solution:To resolve this, you should:
	// Avoid using ObjectInputStream and ObjectOutputStream for text processing.
	// These are designed for serialization of objects, not plain text.Use standard
	// FileReader and BufferedReader to handle plain text files.
	// corrected version of code-
//	import java.io.BufferedReader;
//	import java.io.FileReader;
//	import java.io.IOException;
//	import java.io.StreamTokenizer;
//
//	public class StreamTokeniserExampleOne2 {
//
//	    public static void main(String[] args) throws IOException {
//
//	        String textToBeSearchedString = "ewrwer ERWERW 2343432 45 43543 435. 454.45435 54.4545 #@$#@$$ ;)";
//
//	        // Write text to file
//	        String filePath = "E:/Dosa.txt";
//	        try (FileOutputStream fos = new FileOutputStream(filePath)) {
//	            fos.write(textToBeSearchedString.getBytes());
//	        }
//
//	        // Read and tokenize
//	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//	            StreamTokenizer st = new StreamTokenizer(reader);
//
//	            boolean endoffile = false;
//	            while (!endoffile) {
//	                int token1 = st.nextToken();
//	                switch (token1) {
//	                    case StreamTokenizer.TT_EOF: {
//	                        System.out.println("end of file token");
//	                        endoffile = true;
//	                        break;
//	                    }
//	                    case StreamTokenizer.TT_EOL: {
//	                        System.out.println("end of line token");
//	                        break;
//	                    }
//	                    case StreamTokenizer.TT_NUMBER: {
//	                        double d1 = st.nval;
//	                        System.out.println("number token " + d1);
//	                        break;
//	                    }
//	                    case StreamTokenizer.TT_WORD: {
//	                        String s2 = st.sval;
//	                        System.out.println("word token " + s2);
//	                        break;
//	                    }
//	                    default:
//	                        char c1 = (char) token1;
//	                        System.out.println(c1 + " is printed");
//	                }
//	            }
//	        }
//	    }
//	}
	// Key Fixes:
	// The file content is written as plain text using FileOutputStream without the
	// writeUTF method.
	// The file is read using BufferedReader and processed correctly.
	// This ensures that StreamTokenizer will only process the actual content of
	// your string, without interference from serialized metadata.

}
