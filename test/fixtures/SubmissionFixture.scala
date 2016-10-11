/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fixtures

import models.submission.DesSubmitAdvancedAssuranceModel
import play.api.libs.json.{JsValue, Json}

trait SubmissionFixture {

  val validSubmitJson = """{"acknowledgementReference":"AARN1234567","submissionType":{"agentReferenceNumber":"AARN1234567","correspondenceDetails":{"contactName":{"name1":"Fred","name2":"Flinsstone"},"contactDetails":{"phoneNumber":"01952 255899","emailAddress":"rubble@jurassic.com"},"contactAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"organisationType":"Limited","submission":{"advancedAssurance":{"schemeTypes":{"eis":true,"seis":false,"sitr":false,"vct":false},"trade":{"businessActivity":"Research And Development","baDescription":"Some nature of business description","marketInfo":{"newGeographicMarket":false,"newProductMarket":true},"dateTradeCommenced":"2001-12-01","annualCosts":{"annualCost":[{"periodEnding":"2005","operatingCost":{"amount":"101","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"201","currency":"GBP"}},{"periodEnding":"2004","operatingCost":{"amount":"102","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"202","currency":"GBP"}},{"periodEnding":"2003","operatingCost":{"amount":"103","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"203","currency":"GBP"}}]},"annualTurnover":{"annualTurnover":[{"periodEnding":"2003","turnover":{"amount":"66","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"67","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"68","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"69","currency":"GBP"}},{"periodEnding":"2005","turnover":{"amount":"70","currency":"GBP"}}]}},"proposedInvestment":{"growthJustification":"It will help me invest in new equipment and R&D","unitType":"Shares","investmentAmount":{"amount":"250000","currency":"GBP"}},"subsidiaryPerformingTrade":{"ninetyPercentOwned":true,"companyDetails":{"organisationName":"Made up test subsidiary org name","ctUtr":"1234567891","crn":"555589852","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}}},"knowledgeIntensive":{"skilledEmployeesConditionMet":true,"innovationConditionMet":"reason met","kiConditionMet":true},"organisation":{"utr":"1234567891","chrn":"2222222222","startDate":"2007-06-05","firstDateOfCommercialSale":"2009-04-01","orgDetails":{"organisationName":"my org name","ctUtr":"5555555555","crn":"crnvalue","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"previousRFIs":{"previousRFI":[{"schemeType":"EIS","name":"Other 1","issueDate":"2003-02-01","amount":{"amount":"2000","currency":"GBP"},"amountSpent":{"amount":"19","currency":"GBP"}},{"schemeType":"EIS","name":"Other 2","issueDate":"2004-03-02","amount":{"amount":"5000","currency":"GBP"},"amountSpent":{"amount":"20","currency":"GBP"}},{"schemeType":"EIS","name":"Other 3","issueDate":"2006-05-04","amount":{"amount":"6000","currency":"GBP"},"amountSpent":{"amount":"21","currency":"GBP"}}]}}}}}}"""
  val internalServerErrorJson = """{"acknowledgementReference":"AARN1234567","submissionType":{"agentReferenceNumber":"AARN1234567","correspondenceDetails":{"contactName":{"name1":"Fred","name2":"Flinsstone"},"contactDetails":{"phoneNumber":"01952 255899","emailAddress":"ginternalservererrorrequest@jurassic.com"},"contactAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"organisationType":"Limited","submission":{"advancedAssurance":{"schemeTypes":{"eis":true,"seis":false,"sitr":false,"vct":false},"trade":{"businessActivity":"Research And Development","baDescription":"Some nature of business description","marketInfo":{"newGeographicMarket":false,"newProductMarket":true},"dateTradeCommenced":"2001-12-01","annualCosts":{"annualCost":[{"periodEnding":"2005","operatingCost":{"amount":"101","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"201","currency":"GBP"}},{"periodEnding":"2004","operatingCost":{"amount":"102","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"202","currency":"GBP"}},{"periodEnding":"2003","operatingCost":{"amount":"103","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"203","currency":"GBP"}}]},"annualTurnover":{"annualTurnover":[{"periodEnding":"2003","turnover":{"amount":"66","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"67","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"68","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"69","currency":"GBP"}},{"periodEnding":"2005","turnover":{"amount":"70","currency":"GBP"}}]}},"proposedInvestment":{"growthJustification":"It will help me invest in new equipment and R&D","unitType":"Shares","investmentAmount":{"amount":"250000","currency":"GBP"}},"subsidiaryPerformingTrade":{"ninetyPercentOwned":true,"companyDetails":{"organisationName":"Made up test subsidiary org name","ctUtr":"1234567891","crn":"555589852","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}}},"knowledgeIntensive":{"skilledEmployeesConditionMet":true,"innovationConditionMet":"reason met","kiConditionMet":true},"organisation":{"utr":"1234567891","chrn":"2222222222","startDate":"2007-06-05","firstDateOfCommercialSale":"2009-04-01","orgDetails":{"organisationName":"my org name","ctUtr":"5555555555","crn":"crnvalue","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"previousRFIs":{"previousRFI":[{"schemeType":"EIS","name":"Other 1","issueDate":"2003-02-01","amount":{"amount":"2000","currency":"GBP"},"amountSpent":{"amount":"19","currency":"GBP"}},{"schemeType":"EIS","name":"Other 2","issueDate":"2004-03-02","amount":{"amount":"5000","currency":"GBP"},"amountSpent":{"amount":"20","currency":"GBP"}},{"schemeType":"EIS","name":"Other 3","issueDate":"2006-05-04","amount":{"amount":"6000","currency":"GBP"},"amountSpent":{"amount":"21","currency":"GBP"}}]}}}}}}"""
  val badRequestJson = """{"acknowledgementReference":"AARN1234567","submissionType":{"agentReferenceNumber":"AARN1234567","correspondenceDetails":{"contactName":{"name1":"Fred","name2":"Flinsstone"},"contactDetails":{"phoneNumber":"01952 255899","emailAddress":"rubbbadrequeste@jurassic.com"},"contactAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"organisationType":"Limited","submission":{"advancedAssurance":{"schemeTypes":{"eis":true,"seis":false,"sitr":false,"vct":false},"trade":{"businessActivity":"Research And Development","baDescription":"Some nature of business description","marketInfo":{"newGeographicMarket":false,"newProductMarket":true},"dateTradeCommenced":"2001-12-01","annualCosts":{"annualCost":[{"periodEnding":"2005","operatingCost":{"amount":"101","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"201","currency":"GBP"}},{"periodEnding":"2004","operatingCost":{"amount":"102","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"202","currency":"GBP"}},{"periodEnding":"2003","operatingCost":{"amount":"103","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"203","currency":"GBP"}}]},"annualTurnover":{"annualTurnover":[{"periodEnding":"2003","turnover":{"amount":"66","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"67","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"68","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"69","currency":"GBP"}},{"periodEnding":"2005","turnover":{"amount":"70","currency":"GBP"}}]}},"proposedInvestment":{"growthJustification":"It will help me invest in new equipment and R&D","unitType":"Shares","investmentAmount":{"amount":"250000","currency":"GBP"}},"subsidiaryPerformingTrade":{"ninetyPercentOwned":true,"companyDetails":{"organisationName":"Made up test subsidiary org name","ctUtr":"1234567891","crn":"555589852","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}}},"knowledgeIntensive":{"skilledEmployeesConditionMet":true,"innovationConditionMet":"reason met","kiConditionMet":true},"organisation":{"utr":"1234567891","chrn":"2222222222","startDate":"2007-06-05","firstDateOfCommercialSale":"2009-04-01","orgDetails":{"organisationName":"my org name","ctUtr":"5555555555","crn":"crnvalue","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"previousRFIs":{"previousRFI":[{"schemeType":"EIS","name":"Other 1","issueDate":"2003-02-01","amount":{"amount":"2000","currency":"GBP"},"amountSpent":{"amount":"19","currency":"GBP"}},{"schemeType":"EIS","name":"Other 2","issueDate":"2004-03-02","amount":{"amount":"5000","currency":"GBP"},"amountSpent":{"amount":"20","currency":"GBP"}},{"schemeType":"EIS","name":"Other 3","issueDate":"2006-05-04","amount":{"amount":"6000","currency":"GBP"},"amountSpent":{"amount":"21","currency":"GBP"}}]}}}}}}"""
  val forbiddenJson = """{"acknowledgementReference":"AARN1234567","submissionType":{"agentReferenceNumber":"AARN1234567","correspondenceDetails":{"contactName":{"name1":"Fred","name2":"Flinsstone"},"contactDetails":{"phoneNumber":"01952 255899","emailAddress":"rforbiddenrequest@jurassic.com"},"contactAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"organisationType":"Limited","submission":{"advancedAssurance":{"schemeTypes":{"eis":true,"seis":false,"sitr":false,"vct":false},"trade":{"businessActivity":"Research And Development","baDescription":"Some nature of business description","marketInfo":{"newGeographicMarket":false,"newProductMarket":true},"dateTradeCommenced":"2001-12-01","annualCosts":{"annualCost":[{"periodEnding":"2005","operatingCost":{"amount":"101","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"201","currency":"GBP"}},{"periodEnding":"2004","operatingCost":{"amount":"102","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"202","currency":"GBP"}},{"periodEnding":"2003","operatingCost":{"amount":"103","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"203","currency":"GBP"}}]},"annualTurnover":{"annualTurnover":[{"periodEnding":"2003","turnover":{"amount":"66","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"67","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"68","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"69","currency":"GBP"}},{"periodEnding":"2005","turnover":{"amount":"70","currency":"GBP"}}]}},"proposedInvestment":{"growthJustification":"It will help me invest in new equipment and R&D","unitType":"Shares","investmentAmount":{"amount":"250000","currency":"GBP"}},"subsidiaryPerformingTrade":{"ninetyPercentOwned":true,"companyDetails":{"organisationName":"Made up test subsidiary org name","ctUtr":"1234567891","crn":"555589852","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}}},"knowledgeIntensive":{"skilledEmployeesConditionMet":true,"innovationConditionMet":"reason met","kiConditionMet":true},"organisation":{"utr":"1234567891","chrn":"2222222222","startDate":"2007-06-05","firstDateOfCommercialSale":"2009-04-01","orgDetails":{"organisationName":"my org name","ctUtr":"5555555555","crn":"crnvalue","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"previousRFIs":{"previousRFI":[{"schemeType":"EIS","name":"Other 1","issueDate":"2003-02-01","amount":{"amount":"2000","currency":"GBP"},"amountSpent":{"amount":"19","currency":"GBP"}},{"schemeType":"EIS","name":"Other 2","issueDate":"2004-03-02","amount":{"amount":"5000","currency":"GBP"},"amountSpent":{"amount":"20","currency":"GBP"}},{"schemeType":"EIS","name":"Other 3","issueDate":"2006-05-04","amount":{"amount":"6000","currency":"GBP"},"amountSpent":{"amount":"21","currency":"GBP"}}]}}}}}}"""

  val serviceUnavilableJson = """{"acknowledgementReference":"AARN1234567","submissionType":{"agentReferenceNumber":"AARN1234567","correspondenceDetails":{"contactName":{"name1":"Fred","name2":"Flinsstone"},"contactDetails":{"phoneNumber":"01952 255899","emailAddress":"hserviceunavailablerequest@jurassic.com"},"contactAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"organisationType":"Limited","submission":{"advancedAssurance":{"schemeTypes":{"eis":true,"seis":false,"sitr":false,"vct":false},"trade":{"businessActivity":"Research And Development","baDescription":"Some nature of business description","marketInfo":{"newGeographicMarket":false,"newProductMarket":true},"dateTradeCommenced":"2001-12-01","annualCosts":{"annualCost":[{"periodEnding":"2005","operatingCost":{"amount":"101","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"201","currency":"GBP"}},{"periodEnding":"2004","operatingCost":{"amount":"102","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"202","currency":"GBP"}},{"periodEnding":"2003","operatingCost":{"amount":"103","currency":"GBP"},"researchAndDevelopmentCost":{"amount":"203","currency":"GBP"}}]},"annualTurnover":{"annualTurnover":[{"periodEnding":"2003","turnover":{"amount":"66","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"67","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"68","currency":"GBP"}},{"periodEnding":"2004","turnover":{"amount":"69","currency":"GBP"}},{"periodEnding":"2005","turnover":{"amount":"70","currency":"GBP"}}]}},"proposedInvestment":{"growthJustification":"It will help me invest in new equipment and R&D","unitType":"Shares","investmentAmount":{"amount":"250000","currency":"GBP"}},"subsidiaryPerformingTrade":{"ninetyPercentOwned":true,"companyDetails":{"organisationName":"Made up test subsidiary org name","ctUtr":"1234567891","crn":"555589852","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}}},"knowledgeIntensive":{"skilledEmployeesConditionMet":true,"innovationConditionMet":"reason met","kiConditionMet":true},"organisation":{"utr":"1234567891","chrn":"2222222222","startDate":"2007-06-05","firstDateOfCommercialSale":"2009-04-01","orgDetails":{"organisationName":"my org name","ctUtr":"5555555555","crn":"crnvalue","companyAddress":{"addressLine1":"line 1","addressLine2":"Line 2","addressLine3":"Line 3","addressLine4":"Line 4","postalCode":"TF1 4NY","countryCode":"GB"}},"previousRFIs":{"previousRFI":[{"schemeType":"EIS","name":"Other 1","issueDate":"2003-02-01","amount":{"amount":"2000","currency":"GBP"},"amountSpent":{"amount":"19","currency":"GBP"}},{"schemeType":"EIS","name":"Other 2","issueDate":"2004-03-02","amount":{"amount":"5000","currency":"GBP"},"amountSpent":{"amount":"20","currency":"GBP"}},{"schemeType":"EIS","name":"Other 3","issueDate":"2006-05-04","amount":{"amount":"6000","currency":"GBP"},"amountSpent":{"amount":"21","currency":"GBP"}}]}}}}}}"""
  lazy val targetSubmissionModel =  Json.parse(validSubmitJson.toString).as[DesSubmitAdvancedAssuranceModel]
  lazy val validJs: JsValue = Json.toJson(targetSubmissionModel)

  val badRew =  Json.parse(badRequestJson.toString).as[DesSubmitAdvancedAssuranceModel]
  val badRequestJs: JsValue = Json.toJson(badRew)

  val forbidden =  Json.parse(forbiddenJson.toString).as[DesSubmitAdvancedAssuranceModel]
  val forbiddenJS: JsValue = Json.toJson(forbidden)

  val internalErrModel =  Json.parse(internalServerErrorJson.toString).as[DesSubmitAdvancedAssuranceModel]
  val InternalServerErrJs: JsValue = Json.toJson(internalErrModel)

  val unavailable =  Json.parse(serviceUnavilableJson.toString()).as[DesSubmitAdvancedAssuranceModel]
  val unavailableJs: JsValue = Json.toJson(unavailable)
}