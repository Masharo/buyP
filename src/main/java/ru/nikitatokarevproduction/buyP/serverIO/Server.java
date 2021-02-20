package ru.nikitatokarevproduction.buyP.serverIO;

public class Server implements ServerSS {

    private boolean status = false;

    public boolean isStatus() {
        return status;
    }

    @Override
    public void start() throws Exception {
        if (this.status)
            throw new Exception();

        this.status = true;
    }

    @Override
    public void stop() throws Exception {
        if (!this.status)
            throw new Exception();

        this.status = false;
    }
}
