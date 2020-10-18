package guru.springframework.msscbrewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(final UUID customerId) {
        return CustomerDto.builder().id(customerId).name("Faiz").build();
    }

    @Override
    public CustomerDto saveCustomer(final CustomerDto customerDto) {
        return CustomerDto.builder().id(customerDto.getId()).name(customerDto.getName()).build();
    }

    @Override
    public void updateCustomer(final UUID customerId, final CustomerDto customerDto) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(final UUID customerId) {
        log.debug("Deleted customer with id: " + customerId);

    }

}
