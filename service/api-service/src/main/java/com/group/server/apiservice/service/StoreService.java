package com.group.server.apiservice.service;

import com.group.server.domain.store.StoreDomainService;
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

    public String getStoreName(Long id) {
        Store store = storeInfraService.findStoreById(id);
        StoreVo storeVo = new StoreVo(store.getId(), store.getName());
        boolean checkTestStoreName = storeDomainService.isCheckTestStoreName(storeVo);

        return "테스트 스토어 이름 : " + id + ", 테스트 매장 여부 : " + checkTestStoreName;
    }

}
