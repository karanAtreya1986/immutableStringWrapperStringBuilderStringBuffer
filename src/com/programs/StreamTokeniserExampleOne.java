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

public class StreamTokeniserExampleOne {

	public static void main(String[] args) throws IOException {

//		String textToBeSearchedString="string Tokensier EXAMPLE 1 2 3 56 ; ) ";
//		String textToBeSearchedString="stringTokensierEXAMPLE12356;)";
		String textToBeSearchedString = "ewrwer ERWERW 2343432 #@$#@$$ ;)";

		// Create file reader and file writer , else stream tokeniser wont work.
		// write to the mentioned file on machine.
		// Write everything to file.
		FileOutputStream fos = new FileOutputStream("E:/Dosa.txt");
		// Create object output stream to deal with all kinds of objects.
		// Pass in the file output stream to object output stream.
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// write to the file.
		oos.writeUTF(textToBeSearchedString);
		// release memory.
		oos.flush();

		// Create object input stream to deal with all kinds of objects.
		// give object reader so all types of objects can be read
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Dosa.txt"));

		// read from file
		Reader r1 = new BufferedReader(new InputStreamReader(ois));

		// The input to stream tokeniser is reader class object.
		// only Normal reader is given to stream tokeniser.
		StreamTokenizer st = new StreamTokenizer(r1);

		// lets see do while loop.
		// same can be done with while also and its more easy.
		// Use loops and get the token.

		boolean endoffile = false;
		do {
			int token1 = st.nextToken();
			switch (token1) {
			// Handle end of file scenario and turn on the flag and stop the run.
			case StreamTokenizer.TT_EOF: {
				System.out.println("end of file token");
				endoffile = true;
				break;
			}
			// Handle end of line scenario.
			case StreamTokenizer.TT_EOL: {
				System.out.println("end of line token");
				break;
			}
			// Handle numbers. See how to read words using nval.
			case StreamTokenizer.TT_NUMBER: {
				double d1 = st.nval;
				System.out.println("number token " + d1);
				break;
			}
			// Handle words. See how to read words using sval.
			case StreamTokenizer.TT_WORD: {
				String s2 = st.sval;
				System.out.println("word token " + s2);
				break;
			}
			// Use default for special character handling, other than words and numbers.
			default:
				char c1 = (char) token1;
				System.out.println(c1 + " is printed");
				// Exclamation point is not mandatory. Just written that if exclamation
				// comes, break and stop.
				// this can be omitted.
				if (token1 == '!') {
					endoffile = true;
				}
			}
		} while (!endoffile);

	}

	// Note -stream tokenizer used for identification of alphabets, numbers, special
	// characters.
	// string tokeniser just breaks the strings into tokens based on delimiter.
	// stream tokeniser also breaks into tokens plus additional tasks like searching
	// grouping etc.

	// We can differentiate same string based on character, number etc.
	// Stream tokeniser works with reader class only. So file component has to be
	// involved.

	// If you want to break numbers, special characters etc which are not of string
	// format, then use streams tokeniser. Streams tokeniser is deprecated.

}
