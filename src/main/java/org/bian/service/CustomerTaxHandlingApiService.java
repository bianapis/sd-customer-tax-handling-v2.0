/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerTaxHandlingApiService {

	SDCustomerTaxHandlingActivateOutputModel activate(SDCustomerTaxHandlingActivateInputModel request);
	
	SDCustomerTaxHandlingConfigureOutputModel configure(String sdReferenceId, SDCustomerTaxHandlingConfigureInputModel request);
	
	CRCustomerTaxObligationFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerTaxObligationFulfillmentArrangementControlInputModel request);
	
	BQAnalysisExchangeOutputModel exchangeAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisExchangeInputModel request);
	
	BQReportingExchangeOutputModel exchangeReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingExchangeInputModel request);
	
	CRCustomerTaxObligationFulfillmentArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerTaxObligationFulfillmentArrangementExecuteInputModel request);
	
	SDCustomerTaxHandlingFeedbackOutputModel feedback(String sdReferenceId, SDCustomerTaxHandlingFeedbackInputModel request);
	
	CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCustomerTaxObligationFulfillmentArrangementInitiateInputModel request);
	
	CRCustomerTaxObligationFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerTaxObligationFulfillmentArrangementRequestInputModel request);
	
	CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAnalysisRetrieveOutputModel retrieveAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReportingRetrieveOutputModel retrieveReporting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerTaxHandlingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerTaxObligationFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerTaxObligationFulfillmentArrangementUpdateInputModel request);
	
	BQAnalysisUpdateOutputModel updateAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisUpdateInputModel request);
	
	BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request);
	
	BQReportingUpdateOutputModel updateReporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReportingUpdateInputModel request);
	
}
