package application.generators;

import domain.businessRules.AttributeRangeRule;

public class AttributeRangeRuleGenerator {

    public AttributeRangeRuleGenerator(){
    }

    public String generateAttributeRangeRuleTrigger(AttributeRangeRule attributeRangeRule){
        String forEachRow = "";

        if (attributeRangeRule.isForEachRow() == true) {
            forEachRow = "FOR EACH ROW";
        }
    }
}
