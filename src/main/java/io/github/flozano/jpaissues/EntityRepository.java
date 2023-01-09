package io.github.flozano.jpaissues;

import io.hypersistence.utils.spring.repository.BaseJpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EntityRepository<T> extends BaseJpaRepository<T, Long> { //, ListPagingAndSortingRepository<T, Long> {
}
