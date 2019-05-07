import java.io.File;
import java.io.PrintWriter;
import java.io.Scanner;

public class Classes{
	public static void main(String[] args) throws Exception{
		try{
			;
		}catch(Exception e){
			;
		}catch(IOException e){
			throw new Exception("Rethrowing exception.");
		}finally{
			;
		}
	}
}

interface A extends B, C{
	public abstract void method();
}

class A implements B, C{
	// Make private, use getters and setters.
	;
}

class A extends B{
	public void method() throws Exception, IOException, OtherException{
		throw new Exception();
		throw new IOException("No such file.");
	}
}

public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
