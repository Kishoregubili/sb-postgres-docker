package org.kishore.sbpostgresdocker.repository;

import org.kishore.sbpostgresdocker.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
