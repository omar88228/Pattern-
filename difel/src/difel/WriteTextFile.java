package difel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public final class WriteTextFile {

	  //..other methods elided

	  /**
	  * Change the contents of a text file in its entirety, overwriting any
	  * existing text.
	  *
	  * @param file is an existing file (not a directory) which can be written.
	  * @param contents is the text to be placed into aFile.
	  *
	  * @exception FileNotFoundException if file does not exist.
	  * @exception IOException if stream to file cannot be written to or closed.
	  *
	  * @exception IllegalArgumentException if file is a directory.
	  * @exception IllegalArgumentException if file cannot be written.
	  * @exception SecurityException if a SecurityManager exists and
	  * disallows read or write access to aFile.
	  */
	  static public void setContents(File file, String contents)
	                                 throws FileNotFoundException, IOException {
	    if (file == null) {
	      throw new NullPointerException("File must not be null.");
	    }
	    if (contents == null) {
	      throw new NullPointerException("Contents must not be null.");
	    }
	    if (!file.exists()) {
	      throw new FileNotFoundException ("File does not exist: " + file);
	    }
	    if (!file.isFile()) {
	      throw new IllegalArgumentException("Must not be a directory: " + file);
	    }
	    if (!file.canWrite()) {
	      throw new IllegalArgumentException("File cannot be written: " + file);
	    }

	    try (Writer output = new BufferedWriter(new FileWriter(file))) {
	      output.write(contents);
	    }
	  }

	  public static void main (String... args) throws IOException {
	    File testFile = new File("C:\\Temp\\blah.txt");
	    setContents(testFile, "blah blah blah");
	  }
	}
