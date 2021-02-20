package ru.nikitatokarevproduction.buyP.serverIO;

public class CoreServer {

    private static CoreServer thisClass = null;

    private CoreServer() {}

    public CoreServer getInstance() {
        if (thisClass == null)
            thisClass = new CoreServer();

        return thisClass;
    }
}
