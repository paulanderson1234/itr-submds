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

package controllers

import fixtures.SubmissionFixture
import model.SubmissionResponse
import mongo.InvestmentTaxReliefSubmissionRepository
import uk.gov.hmrc.play.test.WithFakeApplication
import play.api.test.FakeRequest
import play.api.test.Helpers._
import uk.gov.hmrc.play.test.UnitSpec
import org.scalatest.mock.MockitoSugar


class SubmissionControllerSpec extends UnitSpec with WithFakeApplication with MockitoSugar with SubmissionFixture {

  val mockRepository = mock[InvestmentTaxReliefSubmissionRepository]

  class Setup {
    object TestController extends SubmissionStubController {
      val investmentTaxReliefSubmissionRepository: InvestmentTaxReliefSubmissionRepository = mockRepository
    }
  }

  "The stub should return a  " should {
    "return a valid json response with a bundle id and expected message detailing the status" in new Setup {

      val result = TestController.submitAdvancedAssuranceApplication().apply(FakeRequest().withBody(validJs))

      val submissionResponse: SubmissionResponse = jsonBodyOf(result).as[SubmissionResponse]
      submissionResponse.formBundleId.startsWith("FBUND") shouldEqual true
      submissionResponse.message shouldBe "Submission Request Successful"
      submissionResponse.status shouldEqual true
      status(result) shouldBe CREATED

    }
  }

  "The stub should return a bad request if the email contains the text badrequest " should {
    "return a json package detailing the status" in new Setup {

      val result = TestController.submitAdvancedAssuranceApplication().apply(FakeRequest().withBody(badRequestJs))
      status(result) shouldBe BAD_REQUEST
    }
  }


  "The stub should return an internal server error if the email contains the text internalservererror " should {
    "return a json package detailing the status" in new Setup {

      val result = TestController.submitAdvancedAssuranceApplication().apply(FakeRequest().withBody(internalServerErrorJs))
      status(result) shouldBe INTERNAL_SERVER_ERROR
    }
  }

  "The stub should return a service unavailable error if the email contains the text serviceunavailable " should {
    "return a json package detailing the status" in new Setup {

      val result = TestController.submitAdvancedAssuranceApplication().apply(FakeRequest().withBody(serviceUnavilableJs))
      status(result) shouldBe SERVICE_UNAVAILABLE
    }
  }

  "The stub should return a service unavailable error if the email contains the text forbidden " should {
    "return a json package detailing the status" in new Setup {

      val result = TestController.submitAdvancedAssuranceApplication().apply(FakeRequest().withBody(forbiddenJs))
      status(result) shouldBe FORBIDDEN
    }
  }
}
