package ObjectData;

import java.util.ArrayList;
import java.util.List;

public class GeneralObject {

    public List<String> gePreparedValue(String value) {

        List<String> result = new ArrayList<>();
        String[] valueSplit = value.split(",");
        for(int i=0; i <valueSplit.length; i++) {
            result.add(valueSplit[i]);
        }
        return result;
    }
}
