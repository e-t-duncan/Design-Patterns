package designPatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdapter implements DatabaseDataConvertor{
    @Override
    public List<DisplayDataThirdParty> convertData(List<DatabaseData> data) {
        List<DisplayDataThirdParty> returnList = new ArrayList<>();
        for (DatabaseData datum : data){
            float index = datum.position;
            String position = Integer.toString(datum.amount);
            DisplayDataThirdParty dd = new DisplayDataThirdParty(index,position);
            returnList.add(dd);
        }
        return returnList;
    }
}
