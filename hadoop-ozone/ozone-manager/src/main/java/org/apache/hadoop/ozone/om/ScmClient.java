/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership.  The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.apache.hadoop.ozone.om;

import org.apache.hadoop.hdds.scm.protocol.ScmBlockLocationProtocol;
import org.apache.hadoop.hdds.scm.protocol.StorageContainerLocationProtocol;
import org.apache.hadoop.hdds.scm.update.client.SCMUpdateServiceGrpcClient;

/**
 * Wrapper class for Scm protocol clients.
 */
public class ScmClient {

  private final ScmBlockLocationProtocol blockClient;
  private final StorageContainerLocationProtocol containerClient;
  private SCMUpdateServiceGrpcClient updateServiceGrpcClient;

  ScmClient(ScmBlockLocationProtocol blockClient,
            StorageContainerLocationProtocol containerClient) {
    this.containerClient = containerClient;
    this.blockClient = blockClient;
  }

  public ScmBlockLocationProtocol getBlockClient() {
    return this.blockClient;
  }

  public StorageContainerLocationProtocol getContainerClient() {
    return this.containerClient;
  }

  public void setUpdateServiceGrpcClient(
      SCMUpdateServiceGrpcClient updateClient) {
    this.updateServiceGrpcClient = updateClient;
  }

  public SCMUpdateServiceGrpcClient getUpdateServiceGrpcClient() {
    return updateServiceGrpcClient;
  }
}
