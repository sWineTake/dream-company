package com.group.server.mysql.service.store;

import com.group.server.mysql.repository.store.StoreRepository;
import com.group.server.mysql.entity.store.Store;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StoreInfraService {

    private final StoreRepository storeRepository;

    @Transactional(readOnly = true)
    public Store findStoreById(Long id) {
        Optional<Store> byId = storeRepository.findById(id);
        Store store = byId.get();
        return store;
    }

}
