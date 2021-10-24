package co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service;

import co.edu.udem.loscalidosos.devopscalidad.Foo;

import java.util.List;

public interface IFooService {
    public Foo findById(Long id);
    public List<Foo> findAll();

    public Long create(Foo resource);
    public void update(Foo resource);
    public void deleteById(Long id);
    public Foo getById(Long id);
}
