package sprin3disetter;

public class Helper {

	private Service service;
	
	
	
	
	public void setService(Service service) {
		this.service = service;
	}
	
	
	
	
	public  void startService()
	{
		
		service.myservice();
	}
	
	public String CheckValidationOFEmail(String emailID)
	{
		
		return service.validmailCheckService(emailID);
		
	}
}
