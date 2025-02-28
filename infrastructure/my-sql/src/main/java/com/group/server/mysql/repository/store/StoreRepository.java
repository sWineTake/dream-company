package com.group.server.mysql.repository.store;

import com.group.server.mysql.entity.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
