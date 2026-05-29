package designPatterns.abstractFactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response getResponse();
}
