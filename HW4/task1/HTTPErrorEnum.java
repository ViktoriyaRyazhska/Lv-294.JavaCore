package hw04.task1;

public enum HTTPErrorEnum {
	BAD_REQUEST(400), UNAUTHORIZED(401), PAYMENT_REQUIRED(402), FORBIDDEN(403), NOT_FOUND(
			404), METHOD_NOT_ALLOWED(405),NOT_ACCEPTABLE(406);

	private int num;

	private HTTPErrorEnum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
