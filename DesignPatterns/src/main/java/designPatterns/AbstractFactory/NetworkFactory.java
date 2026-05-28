package designPatterns.AbstractFactory;

public class NetworkFactory implements DataSourceAbstractFactory{
    @Override
    public Service createService() {
        return new NetworkService();
    }

    @Override
    public Response getResponse() {
        return new NetworkResponse();
    }
}
