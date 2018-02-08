package third.exercise;

public enum HTTPError {
	Continue(100, "Only a part of the request has been received by the server, but as long as it has" + 
				  "not been rejected, the client should continue with the request."),
	SwitchingProtocols(101, "The server switches protocol."),
	OK(200, "The request is OK."),
	Created(201, "The request is complete, and a new resource is created."),
	Accepted(202, "The request is accepted for processing, but the processing is not complete."),
	MultipleChoices(300, "A link list. The user can select a link and go to that location. Maximum five raddresses."),
	MovedPermanently(301, "The requested page has moved to a new url."),
	BadRequest(400, "The server did not understand the request."),
	Unauthorized(401, "The requested page needs a username and a password."),
	PaymentRequired(402, "You can not use this code yet."),
	InternalServerError(500, "The request was not completed. The server met an unexpected condition."),
	NotImplemented(501, "The request was not completed. The server did not support the functionality required."),
	BadGateway(502, "The request was not completed. The server received an invalid response from the upstream server.");
		
	private int number;
	private String description;
	
	
	private HTTPError(int number, String description) {
		this.number = number;
		this.description = description;
	}


	public int getNumber() {
		return number;
	}


	public String getDescription() {
		return description;
	}
	
	
	
	
}
