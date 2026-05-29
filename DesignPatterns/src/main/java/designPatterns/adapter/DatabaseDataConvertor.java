package designPatterns.adapter;

import java.util.List;

public interface DatabaseDataConvertor {

    public List<DisplayDataThirdParty> convertData(List<DatabaseData> data);

}
