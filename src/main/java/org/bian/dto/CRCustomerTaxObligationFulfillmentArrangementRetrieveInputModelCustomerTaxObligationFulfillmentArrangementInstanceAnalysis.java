package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis
 */
public class CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis   {
  private String customerTaxObligationFulfillmentArrangementInstanceAnalysisReference = null;

  private String customerTaxObligationFulfillmentArrangementInstanceAnalysisReportType = null;

  private String customerTaxObligationFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerTaxObligationFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceAnalysisReference() {
    return customerTaxObligationFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceAnalysisReference(String customerTaxObligationFulfillmentArrangementInstanceAnalysisReference) {
    this.customerTaxObligationFulfillmentArrangementInstanceAnalysisReference = customerTaxObligationFulfillmentArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerTaxObligationFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceAnalysisReportType() {
    return customerTaxObligationFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceAnalysisReportType(String customerTaxObligationFulfillmentArrangementInstanceAnalysisReportType) {
    this.customerTaxObligationFulfillmentArrangementInstanceAnalysisReportType = customerTaxObligationFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerTaxObligationFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceAnalysisParameters() {
    return customerTaxObligationFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceAnalysisParameters(String customerTaxObligationFulfillmentArrangementInstanceAnalysisParameters) {
    this.customerTaxObligationFulfillmentArrangementInstanceAnalysisParameters = customerTaxObligationFulfillmentArrangementInstanceAnalysisParameters;
  }


}

