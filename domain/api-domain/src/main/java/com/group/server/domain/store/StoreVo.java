package com.group.server.domain.store;

public record StoreVo(Long id, String name) {

    public static StoreVo of(Long id, String name) {
        return new StoreVo(id, name);
    }

}
