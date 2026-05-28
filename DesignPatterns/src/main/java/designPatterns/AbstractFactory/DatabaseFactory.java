package designPatterns.AbstractFactory;

public class DatabaseFactory implements DataSourceAbstractFactory{
    @Override
    public Service createService() {
        return new DatabaseService();
    }

    @Override
    public Response getResponse() {
        return new DatabaseResponse();
    }
}
