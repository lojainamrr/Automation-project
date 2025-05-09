package Utilities;

import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
public class DataReader {
    public static Map<String,String> getData(String filePath){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(filePath), Map.class);
        }
        catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
