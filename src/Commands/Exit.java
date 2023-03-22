package Commands;

import AbstractClass.AbstractCommand;
import Interface.Client;
import Server.Receiver;

public class Exit extends AbstractCommand {
    protected Exit(String name, Client client, Receiver receiver) {
        super("exit", client, receiver);
    }

    @Override
    public void fulfill() {
        client.exit();
    }
}
