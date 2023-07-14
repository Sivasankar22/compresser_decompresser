package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class compresser {
	public static void method (File file) throws IOException{ 
	String fileDirectory=file.getParent();
	FileInputStream fis=new FileInputStream(file);
	FileOutputStream fos=new FileOutputStream(fileDirectory+"/compressedFile.gz");
	GZIPOutputStream gzip=new GZIPOutputStream(fos);
	byte[] buffer=new byte[1024];
	int len = 0;
	while((len=fis.read(buffer))!=-1)
	{ 
		gzip.write(buffer, 0, len);
	}
	gzip.close();
	fos.close();
	fis.close();
	}
	public static void main(String[] args) throws IOException
	{
	File path = new File("C:/Users/Shiva Shankar/OneDrive/Desktop/dat 45 notes.txt");
	method(path);
}
}