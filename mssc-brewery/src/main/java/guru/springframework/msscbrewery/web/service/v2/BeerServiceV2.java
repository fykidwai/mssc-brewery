package guru.springframework.msscbrewery.web.service.v2;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);

}
