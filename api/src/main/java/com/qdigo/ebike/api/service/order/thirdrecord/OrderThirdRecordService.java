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

package com.qdigo.ebike.api.service.order.thirdrecord;

import com.qdigo.ebike.api.ApiRoute;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description: 
 * date: 2020/1/8 1:59 PM
 * @author niezhao
 * @version
 * @since JDK 1.8
 */
@FeignClient(name = "order-center", contextId = "third-record")
public interface OrderThirdRecordService {

    @PostMapping(ApiRoute.OrderCenter.ThirdRecord.insert)
    void insert(@RequestBody Param param);


    @Value
    class Param {
        private Long agentId;
        private boolean succeed;
        private API api;
    }

    @Getter
    @AllArgsConstructor
    enum API {
        identifyIdCard("dataPay", "identifyIdCard", 0.17),
        identifyFace("dataPay", "identifyFace", 0.32);
        private String serviceName;
        private String apiName;
        private Double amount;
    }

}
