[![Release](https://jitpack.io/v/Joni-Lover/rancher-java-sdk.svg)]
(https://jitpack.io/#Joni-Lover/rancher-java-sdk)

# Rancher Java SDK

This project is a autogenerated Java Client for [Rancher](rancher.com)

This project automatically generates the type definitions use a Go template generator and the Rancher provided API schema.
It was originally derived from the [Go-Rancher](https://github.com/rancher/go-rancher) library.

There services definitions are built using Square's [Retrofit2](http://square.github.io/retrofit/) library.

This code is currently untested and is not published to an artifact repository.
Use at your own risk.

You can pull this library into your project using [JitPack.io](jitpack.io)

```gradle
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
        compile 'com.github.Joni-Lover:rancher-java-sdk:SNAPSHOT'
}
```

## Example

That entry point for this library is the `io.rancher.Rancher` class.
You must first create an API key in your Rancher installation for this library to use.

First, initialize your Rancher client:

```java
Rancher.Config config = new Rancher.Config(new URL("https://rancher.mydomain.com/v2-beta/"), "MyAPIAccessKey", "MyAPISecretKey");
Rancher rancher = new Rancher(config);
```

Once the client is created, you can interact with Rancher by having the client generate a proxy for one of the service
interfaces for you.

```java
ServiceService service = rancher.type(io.rancher.service.ServiceService.class);

List<io.rancher.type.Service> services = service.list().execute();
```

## Updating the Rancher API

The API definitions in this project are automatically generated from the Rancher API definition.
To update the API, perform the following steps:

1. `cd generator`
1. `curl -o schemas.json https://raw.githubusercontent.com/rancher/go-rancher/master/generator/schemas.json`
1. `make && ./generator`
