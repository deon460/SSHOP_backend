package com.dmon.sshop._domain.shopping.service;

import com.dmon.sshop._domain.shopping.model.entity.Address;

public interface IAddressDomainService {
    //HELPER//
    Address findOrError(String addressId);
}
