package defi;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorld implements RequestHandler<Object, Object>{

	@Override
	public Object handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		System.out.println("hello world lambda logging..!");
		return "Hello world from NmacBoss Project..!";
	}

}