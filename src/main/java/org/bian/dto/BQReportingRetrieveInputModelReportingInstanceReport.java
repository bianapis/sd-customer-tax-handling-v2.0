package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingRetrieveInputModelReportingInstanceReport
 */
public class BQReportingRetrieveInputModelReportingInstanceReport   {
  private String reportingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return reportingInstanceReportReference
  **/

  public String getReportingInstanceReportReference() {
    return reportingInstanceReportReference;
  }

  public void setReportingInstanceReportReference(String reportingInstanceReportReference) {
    this.reportingInstanceReportReference = reportingInstanceReportReference;
  }


}

