package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord
 */
public class CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord   {
  private String customerTaxObligationFulfillmentArrangementInstanceReportReference = null;

  private String customerTaxObligationFulfillmentArrangementInstanceReportType = null;

  private String customerTaxObligationFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerTaxObligationFulfillmentArrangementInstanceReportReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceReportReference() {
    return customerTaxObligationFulfillmentArrangementInstanceReportReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReportReference(String customerTaxObligationFulfillmentArrangementInstanceReportReference) {
    this.customerTaxObligationFulfillmentArrangementInstanceReportReference = customerTaxObligationFulfillmentArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerTaxObligationFulfillmentArrangementInstanceReportParameters
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceReportParameters() {
    return customerTaxObligationFulfillmentArrangementInstanceReportParameters;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReportParameters(String customerTaxObligationFulfillmentArrangementInstanceReportParameters) {
    this.customerTaxObligationFulfillmentArrangementInstanceReportParameters = customerTaxObligationFulfillmentArrangementInstanceReportParameters;
  }


}

