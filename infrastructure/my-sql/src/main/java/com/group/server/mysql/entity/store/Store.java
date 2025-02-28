package com.group.server.mysql.entity.store;

import com.group.server.mysql.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
@Entity
@Table(name = "store")
public class Store extends BaseEntity {

    @Column(name = "name", nullable = false, length = 40)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "head_store")
    private Store headStore;

    @Column(name = "expired_at")
    private LocalDateTime expiredAt;

    @Column(name = "expired_type")
    private Boolean expiredType;

}
