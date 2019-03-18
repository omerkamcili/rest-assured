package environments;

import interfaces.EnvironmentInterface;

public class Environments {

    public final static String local = "environments.Local";

    public final static String staging = "environments.Staging";

    public final static String preProduction = "environments.Staging";

    public static EnvironmentInterface getEnv(String env) {

        return new Staging();
    }

}
