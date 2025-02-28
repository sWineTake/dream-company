package com.group.server.domain.store;

import org.springframework.stereotype.Service;

@Service
public class StoreDomainService {

    private final String TEST_STORE_NAME = "테스트 매장";

    /*
        테스트매장 여부 체크하기
     */
    public boolean isCheckTestStoreName(StoreVo storeVo) {

        return TEST_STORE_NAME.equals(storeVo.name());

    }


}
