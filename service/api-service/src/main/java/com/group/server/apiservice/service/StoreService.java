package com.group.server.apiservice.service;

import com.group.server.apiservice.response.StoreResponse;
import com.group.server.domain.store.StoreDomainService;
import com.group.server.domain.store.StoreMapper;
import com.group.server.domain.store.StoreVo;
import com.group.server.mysql.entity.store.Store;
import com.group.server.mysql.service.store.StoreInfraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreInfraService storeInfraService;
    private final StoreDomainService storeDomainService;

    public StoreResponse getStoreName(Long id) {
        Store store = storeInfraService.findStoreById(id);

        StoreVo storeVo = StoreMapper.toStoreVo(store.getId(), store.getName());

        boolean isTestStore = storeDomainService.isCheckTestStoreName(storeVo);

        return new StoreResponse(storeVo.name(), isTestStore);
    }

}
