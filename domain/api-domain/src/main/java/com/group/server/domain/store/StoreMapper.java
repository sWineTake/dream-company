package com.group.server.domain.store;

public class StoreMapper {

    public static StoreVo toStoreVo(Long id, String name) {
        return StoreVo.of(id, name);
    }

}
