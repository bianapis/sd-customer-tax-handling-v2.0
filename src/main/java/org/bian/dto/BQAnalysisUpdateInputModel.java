package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisUpdateInputModelAnalysisInstanceRecord;
import org.bian.dto.BQAnalysisUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAnalysisUpdateInputModel
 */
public class BQAnalysisUpdateInputModel   {
  private BQAnalysisUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;

  private String customerTaxObligationFulfillmentArrangementInstanceReference = null;

  private String analysisInstanceReference = null;

  private BQAnalysisUpdateInputModelAnalysisInstanceRecord analysisInstanceRecord = null;

  private Object analysisUpdateActionTaskRecord = null;

  private String analysisUpdateActionRequest = null;


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceRecord
  **/

  public BQAnalysisUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(BQAnalysisUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Tax Obligation Fulfillment Arrangement instance 
   * @return customerTaxObligationFulfillmentArrangementInstanceReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceReference() {
    return customerTaxObligationFulfillmentArrangementInstanceReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReference(String customerTaxObligationFulfillmentArrangementInstanceReference) {
    this.customerTaxObligationFulfillmentArrangementInstanceReference = customerTaxObligationFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis instance 
   * @return analysisInstanceReference
  **/

  public String getAnalysisInstanceReference() {
    return analysisInstanceReference;
  }

  public void setAnalysisInstanceReference(String analysisInstanceReference) {
    this.analysisInstanceReference = analysisInstanceReference;
  }


  /**
   * Get analysisInstanceRecord
   * @return analysisInstanceRecord
  **/

  public BQAnalysisUpdateInputModelAnalysisInstanceRecord getAnalysisInstanceRecord() {
    return analysisInstanceRecord;
  }

  public void setAnalysisInstanceRecord(BQAnalysisUpdateInputModelAnalysisInstanceRecord analysisInstanceRecord) {
    this.analysisInstanceRecord = analysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return analysisUpdateActionTaskRecord
  **/

  public Object getAnalysisUpdateActionTaskRecord() {
    return analysisUpdateActionTaskRecord;
  }

  public void setAnalysisUpdateActionTaskRecord(Object analysisUpdateActionTaskRecord) {
    this.analysisUpdateActionTaskRecord = analysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return analysisUpdateActionRequest
  **/

  public String getAnalysisUpdateActionRequest() {
    return analysisUpdateActionRequest;
  }

  public void setAnalysisUpdateActionRequest(String analysisUpdateActionRequest) {
    this.analysisUpdateActionRequest = analysisUpdateActionRequest;
  }


}

