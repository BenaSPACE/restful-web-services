package com.in28Minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionUserController {

    @GetMapping("/v1/user")
    public UserV1 getUserV1() {
        return new UserV1("Bob Charlie");
    }

    @GetMapping("/v2/user")
    public UserV2 getUserV2() {
        return new UserV2(new Name("Bob", "Marley"));
    }

    @GetMapping(path = "/user", params = "version=1")
    public UserV1 ParamGetUserV1() {
        return new UserV1("Bob Charlie");
    }

    @GetMapping(path = "/user", params = "version=2")
    public UserV2 ParamGetUserV2() {
        return new UserV2(new Name("Bob", "Marley"));
    }

    @GetMapping(path = "/user/header", headers = "X-API-VERSION=1")
    public UserV1 HeaderGetUserV1() {
        return new UserV1("Bob Charlie");
    }

    @GetMapping(path = "/user/header", headers = "X-API-VERSION=2")
    public UserV2 HeaderGetUserV2() {
        return new UserV2(new Name("Bob", "Marley"));
    }

    @GetMapping(path = "/user/accept", produces = "application/vnd.company.app-v1+json")
    public UserV1 AcceptHeaderGetUserV1() {
        return new UserV1("Bob Charlie");
    }

    @GetMapping(path = "/user/accept", produces = "application/vnd.company.app-v2+json")
    public UserV2 AcceptHeaderGetUserV2() {
        return new UserV2(new Name("Bob", "Marley"));
    }
}
