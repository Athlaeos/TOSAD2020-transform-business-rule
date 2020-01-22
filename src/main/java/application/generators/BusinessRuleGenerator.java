package application.generators;

import domain.businessRules.BusinessRule;

public abstract class BusinessRuleGenerator {
    private BusinessRule businessRule;

    public BusinessRuleGenerator(BusinessRule businessRule){
        this.businessRule = businessRule;
    }
}
