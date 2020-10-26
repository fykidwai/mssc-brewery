package guru.springframework.msscbrewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(final UUID beerId) {
		return BeerDto.builder().id(beerId).beerName("Beer Name").beerStyle("Pale Ale").build();
	}

	@Override
	public BeerDto saveBeer(final BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateBeer(final UUID beerId, final BeerDto beerDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(final UUID beerId) {
		log.debug("Deleted beer with id" + beerId);
	}

}
