package AbstractClass;

import Interface.Client;
import Server.Receiver;

public abstract class AbstractCommandResult<T> extends AbstractCommand{
    protected AbstractCommandResult(String name, Client client, Receiver receiver) {
        super(name, client, receiver);
    }
    abstract T getResult();
}
