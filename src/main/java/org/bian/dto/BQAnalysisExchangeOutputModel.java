package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisExchangeOutputModel
 */
public class BQAnalysisExchangeOutputModel   {
  private String analysisExchangeActionTaskReference = null;

  private Object analysisExchangeActionTaskRecord = null;

  private String analysisExchangeActionResponse = null;

  private String analysisInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis instance exchange service call 
   * @return analysisExchangeActionTaskReference
  **/

  public String getAnalysisExchangeActionTaskReference() {
    return analysisExchangeActionTaskReference;
  }

  public void setAnalysisExchangeActionTaskReference(String analysisExchangeActionTaskReference) {
    this.analysisExchangeActionTaskReference = analysisExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return analysisExchangeActionResponse
  **/

  public String getAnalysisExchangeActionResponse() {
    return analysisExchangeActionResponse;
  }

  public void setAnalysisExchangeActionResponse(String analysisExchangeActionResponse) {
    this.analysisExchangeActionResponse = analysisExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Analysis instance (e.g. accepted, rejected, verified) 
   * @return analysisInstanceStatus
  **/

  public String getAnalysisInstanceStatus() {
    return analysisInstanceStatus;
  }

  public void setAnalysisInstanceStatus(String analysisInstanceStatus) {
    this.analysisInstanceStatus = analysisInstanceStatus;
  }


}

