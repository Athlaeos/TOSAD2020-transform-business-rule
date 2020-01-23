package application.generators;

import domain.businessRules.AttributeRangeRule;

public class AttributeRangeRuleGenerator {

	private String forEachRow = "";
	private String notter = "N";
	
    public AttributeRangeRuleGenerator(){
    }

    public String generateAttributeRangeRuleTrigger(AttributeRangeRule attributeRangeRule){
    	if (attributeRangeRule.isForEachRow()) {
    		forEachRow = "FOR EACH ROW";
    	}
    	if (attributeRangeRule.isNotter()) {
    		notter = "Y";
    	}
        return  String.format("CREATE OR REPLACE TRIGGER %s%n"
        		+ "--%s %n"
        		+ "%s %s ON %s%n"
        		+ "%s %n"
        		+ "DECLARE %n"
        		+ "e_customexception EXCEPTION; %n"
        		+ "v_errormessage varchar2(5000) = '%s'; %n"
        		+ "v_operatorvalue varchar(50) = '%s'; %n"
        		+ "v_comparevalue1 varchar(50) = '%s'; %n"
        		+ "v_comparevalue2 varchar(50) = '%s'; %n"
        		+ "v_notter char(1) = %s; %n"
        		+ "v_passed char(1); %n"
        		+ "BEGIN %n"
        		+ "IF v_notter == 'Y' THEN %n"
        		+ "IF v_operatorvalue NOT BETWEEN v_comparevalue1 AND v_comparevalue2 THEN %n"
        		+ "v_passed := 'Y'; %n"
        		+ "ELSE %n"
        		+ "v_passed := 'N'; %n"
        		+ "END IF; %n"
        		+ "ELSE %n"
        		+ "IF v_operatorvalue BETWEEN v_comparevalue1 AND v_comparevalue2 THEN %n"
        		+ "v_passed := 'Y'; %n"
        		+ "ELSE %n"
        		+ "v_passed := 'N'; %n"
        		+ "END IF; %n"
        		+ " %n"
        		+ "IF NOT v_passed THEN %n"
        		+ "RAISE e_customexception %n"
        		+ "END IF; %n"
        		+ " %n"
        		+ "EXCEPTION %n"
        		+ "WHEN e_customexception THEN %n"
        		+ "dbms_output.put_line(v_errormessage); %n"
        		+ "END; %n", attributeRangeRule.getName(), attributeRangeRule.getDescription(),attributeRangeRule.getWhen(), attributeRangeRule.getEvent(),
        		attributeRangeRule.getTableName(), forEachRow, attributeRangeRule.getErrorMessage(), attributeRangeRule.getOperatorValue(), 
				attributeRangeRule.getCompareValue(), attributeRangeRule.getCompareValue2(), notter);
	}
}
