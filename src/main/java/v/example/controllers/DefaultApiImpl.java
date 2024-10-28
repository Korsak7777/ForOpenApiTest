package v.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import v.examples.stub.mock.spy.openapi.api.DefaultApi;
import v.examples.stub.mock.spy.openapi.model.*;

@Controller
public class DefaultApiImpl implements DefaultApi {
    @Override
    public ResponseEntity<Object> getClientData(final String clientId) {
        return null;
    }

//    @Override
//    public ResponseEntity<PublishOffersMessage> getClientData(final String clientId) {
//        return null;
//    }

}
