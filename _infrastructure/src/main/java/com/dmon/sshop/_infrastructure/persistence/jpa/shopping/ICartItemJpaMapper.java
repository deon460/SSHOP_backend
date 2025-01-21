package com.dmon.sshop._infrastructure.persistence.jpa.shopping;

import com.dmon.sshop._domain.inventory.model.entity.Sku;
import com.dmon.sshop._domain.shopping.model.entity.Cart;
import com.dmon.sshop._domain.shopping.model.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICartItemJpaMapper extends JpaRepository<CartItem, String> {
    Optional<CartItem> findBySkuAndCart(Sku sku, Cart cart);

    void deleteAllById(Iterable<? extends String> ids);
}
