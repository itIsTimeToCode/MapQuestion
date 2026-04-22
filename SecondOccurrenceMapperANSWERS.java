import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondOccurrenceMapper {

    public Map<String, Integer> mapSecondOccurrenceIndex(List<String> list) {
        //TODO: insert your code here
        Map<String,Integer> map = new HashMap<>();
        List<String> alreadyIndexed = new ArrayList<>();
        boolean isDuplicate = false;


        for(int i = 0; i < list.size(); i++){ //iterate throughout the entire array.
            isDuplicate = false;

            for(int j = 0; j < list.size(); j++){
                if((j > i) && (list.get(i).equals(list.get(j)))) {
                    isDuplicate = true;

                    if (isDuplicate && !alreadyIndexed.contains(list.get(i))) {
                        map.put(list.get(i), j);
                        alreadyIndexed.add(list.get(i));
                    }
                }
            }
        }
         return map;
    }
}
