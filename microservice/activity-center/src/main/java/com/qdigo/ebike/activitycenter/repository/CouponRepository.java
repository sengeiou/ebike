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

package com.qdigo.ebike.activitycenter.repository;

import com.qdigo.ebike.activitycenter.domain.entity.coupon.Coupon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by niezhao on 2018/1/19.
 */
public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Optional<Coupon> findFirstByUserId(long userId);

    List<Coupon> findByUserIdAndCouponTemplateId(long userId, long couponTemplateId);

    Page<Coupon> findByUserId(long userId, Pageable pageable);

    List<Coupon> findByUserId(long userId);
}
