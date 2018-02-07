package Homework;

public enum HTTPError {
	BAD_REQUEST(400), UNAUTHORIZED(401), PAYMENT_REQUIRED(402), FORBIDDEN(403), NOT_FOUND(
			404), METHOD_NOT_ALLOWED(405),NOT_ACCEPTABLE(406),
	PROXY_AUTHENTICATION_REQUIRED(407),REQUEST_TIMEOUT(408),CONFLICT(409),GONE(410),I_AM_A_TEAPOT(418);
	
	private int code;
	
	HTTPError(int code) {
		this.code=code;
	}
	
	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
