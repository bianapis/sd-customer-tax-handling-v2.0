package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord
 */
public class CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord   {
  private String customerReference = null;

  private Object customerTaxHandlingArrangementRecord = null;

  private String taxationJurisdictionReference = null;

  private String applicableTaxationRuleReference = null;

  private String applicableTaxationRuleDefinition = null;

  private String customerTaxReportingSchedule = null;

  private Object customerProductServiceEligibilityInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer for whom the consolidated tax position is maintained 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The consolidated record of the customer tax reporting position - basis for generating tax reports 
   * @return customerTaxHandlingArrangementRecord
  **/

  public Object getCustomerTaxHandlingArrangementRecord() {
    return customerTaxHandlingArrangementRecord;
  }

  public void setCustomerTaxHandlingArrangementRecord(Object customerTaxHandlingArrangementRecord) {
    this.customerTaxHandlingArrangementRecord = customerTaxHandlingArrangementRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the applicable tax authority/jurisdiction that applies for the customer - can be multiple for the customer 
   * @return taxationJurisdictionReference
  **/

  public String getTaxationJurisdictionReference() {
    return taxationJurisdictionReference;
  }

  public void setTaxationJurisdictionReference(String taxationJurisdictionReference) {
    this.taxationJurisdictionReference = taxationJurisdictionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Tax handling and reporting regulation that is applied to this customer 
   * @return applicableTaxationRuleReference
  **/

  public String getApplicableTaxationRuleReference() {
    return applicableTaxationRuleReference;
  }

  public void setApplicableTaxationRuleReference(String applicableTaxationRuleReference) {
    this.applicableTaxationRuleReference = applicableTaxationRuleReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Covers all tax reporting guidelines, schedule and position reporting requirements for the customer 
   * @return applicableTaxationRuleDefinition
  **/

  public String getApplicableTaxationRuleDefinition() {
    return applicableTaxationRuleDefinition;
  }

  public void setApplicableTaxationRuleDefinition(String applicableTaxationRuleDefinition) {
    this.applicableTaxationRuleDefinition = applicableTaxationRuleDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the customer tax reporting obligations, recording target and actual dates 
   * @return customerTaxReportingSchedule
  **/

  public String getCustomerTaxReportingSchedule() {
    return customerTaxReportingSchedule;
  }

  public void setCustomerTaxReportingSchedule(String customerTaxReportingSchedule) {
    this.customerTaxReportingSchedule = customerTaxReportingSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: This is the customer's eligibility profile including in-force product terms for the customer - defining the taxation consolidation sources 
   * @return customerProductServiceEligibilityInstanceRecord
  **/

  public Object getCustomerProductServiceEligibilityInstanceRecord() {
    return customerProductServiceEligibilityInstanceRecord;
  }

  public void setCustomerProductServiceEligibilityInstanceRecord(Object customerProductServiceEligibilityInstanceRecord) {
    this.customerProductServiceEligibilityInstanceRecord = customerProductServiceEligibilityInstanceRecord;
  }


}

