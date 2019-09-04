package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingRetrieveOutputModelReportingInstanceRecord
 */
public class BQReportingRetrieveOutputModelReportingInstanceRecord   {
  private String customerTaxReportInstanceReference = null;

  private String customerTaxReportType = null;

  private String customerTaxReportPeriod = null;

  private Object customerTaxReportReport = null;

  private String customerTaxHandlingReportingWorkProducts = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer tax report - sent to the customer or tax authority directly 
   * @return customerTaxReportInstanceReference
  **/

  public String getCustomerTaxReportInstanceReference() {
    return customerTaxReportInstanceReference;
  }

  public void setCustomerTaxReportInstanceReference(String customerTaxReportInstanceReference) {
    this.customerTaxReportInstanceReference = customerTaxReportInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of tax report, includes products/services covered and the tax jurisdiction/authority reference as necessary 
   * @return customerTaxReportType
  **/

  public String getCustomerTaxReportType() {
    return customerTaxReportType;
  }

  public void setCustomerTaxReportType(String customerTaxReportType) {
    this.customerTaxReportType = customerTaxReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reporting period, detailing from-to dates covered by the tax report 
   * @return customerTaxReportPeriod
  **/

  public String getCustomerTaxReportPeriod() {
    return customerTaxReportPeriod;
  }

  public void setCustomerTaxReportPeriod(String customerTaxReportPeriod) {
    this.customerTaxReportPeriod = customerTaxReportPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The customer's consolidated product/service tax report 
   * @return customerTaxReportReport
  **/

  public Object getCustomerTaxReportReport() {
    return customerTaxReportReport;
  }

  public void setCustomerTaxReportReport(Object customerTaxReportReport) {
    this.customerTaxReportReport = customerTaxReportReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the reporting task 
   * @return customerTaxHandlingReportingWorkProducts
  **/

  public String getCustomerTaxHandlingReportingWorkProducts() {
    return customerTaxHandlingReportingWorkProducts;
  }

  public void setCustomerTaxHandlingReportingWorkProducts(String customerTaxHandlingReportingWorkProducts) {
    this.customerTaxHandlingReportingWorkProducts = customerTaxHandlingReportingWorkProducts;
  }


}

