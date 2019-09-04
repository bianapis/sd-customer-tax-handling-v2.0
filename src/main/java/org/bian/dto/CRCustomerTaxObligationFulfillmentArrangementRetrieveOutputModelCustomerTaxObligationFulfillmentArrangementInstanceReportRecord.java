package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord
 */
public class CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord   {
  private String customerTaxObligationFulfillmentArrangementInstanceReportData = null;

  private String customerTaxObligationFulfillmentArrangementInstanceReportType = null;

  private Object customerTaxObligationFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerTaxObligationFulfillmentArrangementInstanceReportData
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceReportData() {
    return customerTaxObligationFulfillmentArrangementInstanceReportData;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReportData(String customerTaxObligationFulfillmentArrangementInstanceReportData) {
    this.customerTaxObligationFulfillmentArrangementInstanceReportData = customerTaxObligationFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerTaxObligationFulfillmentArrangementInstanceReportType
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceReportType() {
    return customerTaxObligationFulfillmentArrangementInstanceReportType;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReportType(String customerTaxObligationFulfillmentArrangementInstanceReportType) {
    this.customerTaxObligationFulfillmentArrangementInstanceReportType = customerTaxObligationFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerTaxObligationFulfillmentArrangementInstanceReport
  **/

  public Object getCustomerTaxObligationFulfillmentArrangementInstanceReport() {
    return customerTaxObligationFulfillmentArrangementInstanceReport;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReport(Object customerTaxObligationFulfillmentArrangementInstanceReport) {
    this.customerTaxObligationFulfillmentArrangementInstanceReport = customerTaxObligationFulfillmentArrangementInstanceReport;
  }


}

