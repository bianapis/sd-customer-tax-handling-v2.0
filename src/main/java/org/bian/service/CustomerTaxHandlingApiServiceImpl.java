/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerTaxHandlingApiServiceImpl implements CustomerTaxHandlingApiService {

	public SDCustomerTaxHandlingActivateOutputModel activate(SDCustomerTaxHandlingActivateInputModel request){
		return JsonReader.read("activate-SDCustomerTaxHandlingActivateOutputModel.json",new TypeReference<SDCustomerTaxHandlingActivateOutputModel>(){});
	}
	
	public SDCustomerTaxHandlingConfigureOutputModel configure(String sdReferenceId, SDCustomerTaxHandlingConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerTaxHandlingConfigureOutputModel.json",new TypeReference<SDCustomerTaxHandlingConfigureOutputModel>(){});
	}
	
	public CRCustomerTaxObligationFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerTaxObligationFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCustomerTaxObligationFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCustomerTaxObligationFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQAnalysisExchangeOutputModel exchangeAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisExchangeInputModel request){
		return JsonReader.read("exchange-BQAnalysisExchangeOutputModel.json",new TypeReference<BQAnalysisExchangeOutputModel>(){});
	}
	
	public BQReportingExchangeOutputModel exchangeReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingExchangeInputModel request){
		return JsonReader.read("exchange-BQReportingExchangeOutputModel.json",new TypeReference<BQReportingExchangeOutputModel>(){});
	}
	
	public CRCustomerTaxObligationFulfillmentArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerTaxObligationFulfillmentArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerTaxObligationFulfillmentArrangementExecuteOutputModel.json",new TypeReference<CRCustomerTaxObligationFulfillmentArrangementExecuteOutputModel>(){});
	}
	
	public SDCustomerTaxHandlingFeedbackOutputModel feedback(String sdReferenceId, SDCustomerTaxHandlingFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerTaxHandlingFeedbackOutputModel.json",new TypeReference<SDCustomerTaxHandlingFeedbackOutputModel>(){});
	}
	
	public CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCustomerTaxObligationFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public CRCustomerTaxObligationFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerTaxObligationFulfillmentArrangementRequestInputModel request){
		return JsonReader.read("request-CRCustomerTaxObligationFulfillmentArrangementRequestOutputModel.json",new TypeReference<CRCustomerTaxObligationFulfillmentArrangementRequestOutputModel>(){});
	}
	
	public CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAnalysisRetrieveOutputModel retrieveAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAnalysisRetrieveOutputModel.json",new TypeReference<BQAnalysisRetrieveOutputModel>(){});
	}
	
	public BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQConsolidationRetrieveOutputModel.json",new TypeReference<BQConsolidationRetrieveOutputModel>(){});
	}
	
	public BQReportingRetrieveOutputModel retrieveReporting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReportingRetrieveOutputModel.json",new TypeReference<BQReportingRetrieveOutputModel>(){});
	}
	
	public SDCustomerTaxHandlingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerTaxHandlingRetrieveOutputModel.json",new TypeReference<SDCustomerTaxHandlingRetrieveOutputModel>(){});
	}
	
	public CRCustomerTaxObligationFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerTaxObligationFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCustomerTaxObligationFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCustomerTaxObligationFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQAnalysisUpdateOutputModel updateAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQAnalysisUpdateOutputModel.json",new TypeReference<BQAnalysisUpdateOutputModel>(){});
	}
	
	public BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request){
		return JsonReader.read("update-BQConsolidationUpdateOutputModel.json",new TypeReference<BQConsolidationUpdateOutputModel>(){});
	}
	
	public BQReportingUpdateOutputModel updateReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingUpdateInputModel request){
		return JsonReader.read("update-BQReportingUpdateOutputModel.json",new TypeReference<BQReportingUpdateOutputModel>(){});
	}
	
}
