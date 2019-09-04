package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisExchangeInputModelAnalysisExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAnalysisExchangeInputModel
 */
public class BQAnalysisExchangeInputModel   {
  private String customerTaxObligationFulfillmentArrangementInstanceReference = null;

  private String analysisInstanceReference = null;

  private Object analysisExchangeActionTaskRecord = null;

  private BQAnalysisExchangeInputModelAnalysisExchangeActionRequest analysisExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return analysisExchangeActionTaskRecord
  **/

  public Object getAnalysisExchangeActionTaskRecord() {
    return analysisExchangeActionTaskRecord;
  }

  public void setAnalysisExchangeActionTaskRecord(Object analysisExchangeActionTaskRecord) {
    this.analysisExchangeActionTaskRecord = analysisExchangeActionTaskRecord;
  }


  /**
   * Get analysisExchangeActionRequest
   * @return analysisExchangeActionRequest
  **/

  public BQAnalysisExchangeInputModelAnalysisExchangeActionRequest getAnalysisExchangeActionRequest() {
    return analysisExchangeActionRequest;
  }

  public void setAnalysisExchangeActionRequest(BQAnalysisExchangeInputModelAnalysisExchangeActionRequest analysisExchangeActionRequest) {
    this.analysisExchangeActionRequest = analysisExchangeActionRequest;
  }


}

