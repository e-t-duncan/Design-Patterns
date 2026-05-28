package designPatterns.AbstractFactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response getResponse();
}
