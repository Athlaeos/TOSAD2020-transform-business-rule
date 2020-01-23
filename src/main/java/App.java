import com.fasterxml.jackson.databind.ObjectMapper;
import domain.businessRules.AttributeRangeRule;
import java.io.IOException;
import java.util.Map;

public class App {
    public static void main( String[] args ){
        // @TODO deze data komt uit de define.
        String input = "{" +
                "\"notter\": true," +
                "\"operatorValue\": \"Test1\"," +
                "\"compareValue\": \"10\"," +
                "\"compareValue2\": \"100\"," +
                "\"name\": \"between10And100\"," +
                "\"description\": \"check if value is between 10 and 100\"," +
                "\"when\": \"before\"," +
                "\"event\": \"update,insert\"," +
                "\"forEachRow\": false," +
                "\"ErrorMessage\": \"Error message\"" +
                "}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            Map value = mapper.readValue(input, Map.class);
            System.out.println(value);
            AttributeRangeRule attributeRangeRule = new AttributeRangeRule(
                    Boolean.parseBoolean(value.get("notter").toString()),
                    value.get("operatorValue").toString(),
                    value.get("compareValue").toString(),
                    value.get("compareValue2").toString(),
                    value.get("name").toString(),
                    value.get("description").toString(),
                    value.get("when").toString(),
                    value.get("event").toString(),
                    Boolean.parseBoolean(value.get("forEachRow").toString()),
                    value.get("ErrorMessage").toString()
            );
            System.out.println(attributeRangeRule.getName());

            System.out.println(attributeRangeRule.toJson());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}