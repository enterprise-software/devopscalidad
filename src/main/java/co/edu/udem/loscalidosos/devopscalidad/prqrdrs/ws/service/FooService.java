package co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service;

import co.edu.udem.loscalidosos.devopscalidad.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FooService implements IFooService{

    @Override
    public Foo findById(Long id) {
        return null;
    }

    @Override
    public List<Foo> findAll() {
        return null;
    }

    @Override
    public Long create(Foo resource) {
        return null;
    }

    @Override
    public void update(Foo resource) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Foo getById(Long id) {
        return null;
    }
}
