public interface Money {
	default int salary() {return 500;}
	int bonus();
	void print(String s);

}
