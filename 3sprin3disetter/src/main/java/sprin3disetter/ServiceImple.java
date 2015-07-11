package sprin3disetter;

public class ServiceImple implements Service {

	@Override
	public void myservice() {
		System.out.println("service started successfully");

	}

	@Override
	public String validmailCheckService(String userid) {
	 
		
		return  "SUCCESS "+userid+" is valid";
	}

}
