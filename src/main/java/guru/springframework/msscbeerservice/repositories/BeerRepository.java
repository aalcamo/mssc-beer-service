package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * It is no longer necessary to annotate with the @Repository annotation.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
