package academy.prog;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class OnlineMap {

    private static final OnlineMap onlineMap = new OnlineMap();

    private final Map<String, Boolean> onlineList = new HashMap<>();

    private OnlineMap(){}

    public static OnlineMap getInstance(){return onlineMap;}

    @Override
    public String toString(){
        String text = System.lineSeparator();
        for(String key : onlineList.keySet()){
            if(onlineList.get(key))
                text += key + " online" + System.lineSeparator();
        }
        return text;
    }
}
