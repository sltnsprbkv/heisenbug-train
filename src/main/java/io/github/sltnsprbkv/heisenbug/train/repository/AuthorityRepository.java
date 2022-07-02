package io.github.sltnsprbkv.heisenbug.train.repository;

import io.github.sltnsprbkv.heisenbug.train.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
