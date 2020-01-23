package application.serviceInterfaces;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.businessRules.AttributeRangeRule;

import java.io.IOException;
import java.util.Map;

public class Controller {
    public Controller(){
    }

    public AttributeRangeRule createAttributeRangeRule(boolean notter, String operatorValue, String CompareValue, String CompareValue2, String name, String description, String when, String event, boolean forEachRow, String errorMessage, String tableName){
        AttributeRangeRule attributeRangeRule = new AttributeRangeRule(notter,operatorValue,CompareValue,CompareValue2,name,description,when,event,forEachRow,errorMessage,tableName);
        return attributeRangeRule;
    }

    public GeneratorController generatorController(){
        return new GeneratorController();

    }

    public String generateAttributeRangeRuleTriggerQuery(AttributeRangeRule attributeRangeRule){
        return generatorController().generateBusinessRuleTriggerQuery(attributeRangeRule);
    }

    public String generateAttributeRangeRuleConstraintQuery(AttributeRangeRule attributeRangeRule){
        return generatorController().generateBusinessRuleConstraintrQuery(attributeRangeRule);
    }

    public AttributeRangeRule mapToRangeRule(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Map value = mapper.readValue(json, Map.class);
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
                    value.get("ErrorMessage").toString(),
                    value.get("tableName").toString()
            );

            return attributeRangeRule;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
