package domain.businessRules;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AttributeRangeRule extends BusinessRule{
    private boolean notter;
    private String operatorValue;
    private String CompareValue;
    private String CompareValue2;

    public AttributeRangeRule(boolean notter, String operatorValue, String CompareValue, String CompareValue2, String name, String description, String when, String event, boolean forEachRow, String errorMessage, String tableName){
        super(name, description, when, event, forEachRow, errorMessage, tableName);
        this.notter = notter;
        this.operatorValue = operatorValue;
        this.CompareValue = CompareValue;
        this.CompareValue2 = CompareValue2;
    }

    public boolean isNotter() {
        return notter;
    }

    public void setNotter(boolean notter) {
        this.notter = notter;
    }

    public String getOperatorValue() {
        return operatorValue;
    }

    public void setOperatorValue(String operatorValue) {
        this.operatorValue = operatorValue;
    }

    public String getCompareValue() {
        return CompareValue;
    }

    public void setCompareValue(String compareValue) {
        CompareValue = compareValue;
    }

    public String getCompareValue2() {
        return CompareValue2;
    }

    public void setCompareValue2(String compareValue2) {
        CompareValue2 = compareValue2;
    }

    public String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(this);
    }
}
