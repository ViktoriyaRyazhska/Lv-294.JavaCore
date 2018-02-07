package HW3;

public class numberErrors {
	 public enum HTTPError {
		 HTTP_Error_401("Unauthorized"), 
		 HTTP_Error_402("Payment Required"), 
		 HTTP_Error_403("Forbidden"), 
		 HTTP_Error_404("Not Found");
		    

	        private String description;

	        private HTTPError(String description) {
	            this.description = description;
	        }

	        public String getDescription() {return description;}
	    };
	public static void main(String[] args) {
		  for (HTTPError s : HTTPError.values())  
	            System.out.println(s + ": " + s.getDescription());  
	    }  

	}
