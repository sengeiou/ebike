/*
 * Copyright 2020 聂钊 nz@qdigo.com
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

package com.qdigo.ebike.api.service.agent.ops;

import com.qdigo.ebike.api.ApiRoute;
import com.qdigo.ebike.api.domain.dto.agent.ops.OpsUseRecordDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description:
 *
 * date: 2020/3/13 9:45 AM
 * @author niezhao
 */
@FeignClient(name = "agent-center", contextId = "agent-ops-use-record")
public interface AgentOpsUseRecordService {

    @PostMapping(ApiRoute.AgentCenter.Ops.UseRecord.findByUsingBike)
    OpsUseRecordDto findByUsingBike(@RequestParam("imei") String imei);

}
