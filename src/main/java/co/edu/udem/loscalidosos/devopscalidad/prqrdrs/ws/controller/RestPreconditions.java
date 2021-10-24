package co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.controller;

public class RestPreconditions {
    public static <T> T checkFound(T resource) throws ClassNotFoundException {
        if (resource == null) {
            throw new ClassNotFoundException();
        }
        return resource;
    }
}