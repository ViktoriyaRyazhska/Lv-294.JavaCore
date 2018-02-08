import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum Continent {
    ASIA,
    AFRICA,
    AMERICA,
    EUROPE,
    AUSTRALIA;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Continent continent;
        System.out.println("Enter the name of the country");
        String countryName = br.readLine();
        switch (countryName) {
            case "China":
            case "India":
                continent = Continent.ASIA;
                System.out.println(countryName + " is Asia!");
                break;
            case "Madagascar":
            case "Tunisia":
                continent = Continent.AFRICA;
                System.out.println(countryName + " is Africa!");
                break;
            case "Canada":
            case "Brazil":
                continent = Continent.AMERICA;
                System.out.println(countryName + " is America!");
                break;
            case "Ukraine":
            case "England":
                continent = Continent.EUROPE;
                System.out.println(countryName + " is Europe!");
                break;
            case "Australia":
                continent = Continent.AUSTRALIA;
                System.out.println(countryName + " is Australia!");
                break;
            default:
                System.out.println("Error");
                System.exit(0);
        }
    }
}
