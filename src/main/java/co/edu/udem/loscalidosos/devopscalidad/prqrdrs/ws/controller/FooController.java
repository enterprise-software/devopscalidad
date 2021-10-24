package co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.controller;

import co.edu.udem.loscalidosos.devopscalidad.Foo;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.FooService;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.IFooService;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.WeatherService;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/foos")
public class FooController {
    @Autowired
    private IFooService service;

    @GetMapping
    public List<Foo> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Foo findById(@PathVariable("id") Long id) throws ClassNotFoundException {
        return RestPreconditions.checkFound(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody Foo resource) {
        Preconditions.checkNotNull(resource);
        return service.create(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Foo resource) throws ClassNotFoundException {
        Preconditions.checkNotNull(resource);
        RestPreconditions.checkFound(service.getById(resource.getId()));
        service.update(resource);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
