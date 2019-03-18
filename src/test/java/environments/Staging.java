package environments;

import interfaces.EnvironmentInterface;

public class Staging implements EnvironmentInterface {

    public String path() {

        return "https://samples.openweathermap.org/";

    }

    public int port() {

        return 80;

    }
}
