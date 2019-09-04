package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis
 */
public class CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis   {
  private String customerTaxObligationFulfillmentArrangementInstanceAnalysisData = null;

  private String customerTaxObligationFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object customerTaxObligationFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerTaxObligationFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceAnalysisData() {
    return customerTaxObligationFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceAnalysisData(String customerTaxObligationFulfillmentArrangementInstanceAnalysisData) {
    this.customerTaxObligationFulfillmentArrangementInstanceAnalysisData = customerTaxObligationFulfillmentArrangementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerTaxObligationFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCustomerTaxObligationFulfillmentArrangementInstanceAnalysisReport() {
    return customerTaxObligationFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceAnalysisReport(Object customerTaxObligationFulfillmentArrangementInstanceAnalysisReport) {
    this.customerTaxObligationFulfillmentArrangementInstanceAnalysisReport = customerTaxObligationFulfillmentArrangementInstanceAnalysisReport;
  }


}

