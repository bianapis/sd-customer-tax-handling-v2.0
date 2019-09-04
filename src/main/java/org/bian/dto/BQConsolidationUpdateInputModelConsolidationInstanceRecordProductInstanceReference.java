package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReference
 */
public class BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReference   {
  private String productFulfillmentArrangementInstanceReportType = null;

  private BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport productFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The types of product fulfillment reports available - in this case transaction details used for tax obligations and reporting 
   * @return productFulfillmentArrangementInstanceReportType
  **/

  public String getProductFulfillmentArrangementInstanceReportType() {
    return productFulfillmentArrangementInstanceReportType;
  }

  public void setProductFulfillmentArrangementInstanceReportType(String productFulfillmentArrangementInstanceReportType) {
    this.productFulfillmentArrangementInstanceReportType = productFulfillmentArrangementInstanceReportType;
  }


  /**
   * Get productFulfillmentArrangementInstanceReport
   * @return productFulfillmentArrangementInstanceReport
  **/

  public BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport getProductFulfillmentArrangementInstanceReport() {
    return productFulfillmentArrangementInstanceReport;
  }

  public void setProductFulfillmentArrangementInstanceReport(BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReferenceProductFulfillmentArrangementInstanceReport productFulfillmentArrangementInstanceReport) {
    this.productFulfillmentArrangementInstanceReport = productFulfillmentArrangementInstanceReport;
  }


}

