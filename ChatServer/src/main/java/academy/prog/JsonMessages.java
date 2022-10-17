package academy.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JsonMessages {
    private  List<Message> list = new ArrayList<>();

    public JsonMessages(List<Message> sourceList, int fromIndex, String user) {
        for (int i = fromIndex; i < sourceList.size(); i++)
            list.add(sourceList.get(i));
        list = list.stream().filter(a -> (a.getTo() == null || a.getTo().equals(user) || a.getFrom().equals(user))).collect(Collectors.toList());
    }
}
