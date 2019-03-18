package environments;

import interfaces.EnvironmentInterface;

public class Local implements EnvironmentInterface {

    public String path() {

        return "http://127.0.0.1";

    }

    public int port() {

        return 8000;

    }
}
