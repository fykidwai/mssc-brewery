package guru.springframework.msscbrewery.web.service.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(final UUID beerId) {
        return BeerDtoV2.builder().id(beerId).beerName("Beer Name").beerStyle(BeerStyleEnum.ALE).build();
    }

    @Override
    public BeerDtoV2 saveBeer(final BeerDtoV2 beerDto) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(final UUID beerId, final BeerDtoV2 beerDto) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(final UUID beerId) {
        log.debug("Deleted beer with id" + beerId);
    }

}
