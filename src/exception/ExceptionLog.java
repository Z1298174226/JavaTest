package exception;
import java.io.*;
import java.util.logging.*;
import Mr.zhao.util.*;
class LoggingException extends Exception{
	private static Logger logger=
			Logger.getLogger("LoggingException");
	public LoggingException(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
class InLoggingException extends LoggingException{
	private static Logger logger=
			Logger.getLogger("InLoggingException");
	public InLoggingException(String s){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
public class ExceptionLog {
	public static void f() throws InLoggingException{
		throw new InLoggingException("InLoggingException");
	}
	public static void g() throws LoggingException{
		f();
	}
	public static void h() throws Exception{
		try{
			g();
		}
		catch(Throwable e){
			System.err.println("Cought "+e);
			throw new LoggingException();
			//throw e.fillInStackTrace();
		}
	}
	public static void main(String[] args){
		try{
			h();
		}
		catch(Exception e){
			System.err.println("Cought "+e);
			//Print.print("getMessage() "+e.getMessage());
			//throw (LoggingException)e.fillInStackTrace();
			//throw new LoggingException();
		}
		try{
			f();
			//throw new LoggingException();
		}
		catch(InLoggingException e){
			System.err.println("Cought "+e);
		//	Print.print("getMessage() "+e.getMessage());
	   //   Print.print("getLocalizedMessage() "+e.getLocalizedMessage());
	//		Print.print("toString():"+e);
//			Print.print("printStackTrace():");
	//		e.printStackTrace(System.out);
		}
	}

}
