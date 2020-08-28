package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.repositories.BeerRepository;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * notice since we are using lombok's required args constructor annotation, the beer
 * repository and object mapper are brought into wired within the constructor. there
 * is no need for an auto wired annotation.
 */
@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    BeerRepository beerRepository;

    @Override
    public BeerDto getById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }
}
