/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.remote.client.messages;

import com.clover.sdk.v3.payments.Credit;

/**
 * Response object for a manual refund (naked credit) request
 */
@SuppressWarnings(value="unused")
public class ManualRefundResponse extends BaseResponse {
  private Credit credit;

  /**
   * Constructor
   *
   * @param success If true then the requested operation succeeded
   * @param result The result of the requested operation
   */
  public ManualRefundResponse(boolean success, ResultCode result) {
    super(success, result);
  }

  /**
   * Get the field value
   *
   * @return the credit object for the manual refund
   */
  public Credit getCredit() {
    return credit;
  }

  /**
   * Set the field value
   *
   * @param credit the credit object for the manual refund
   */
  public void setCredit(Credit credit) {
    this.credit = credit;
  }
}