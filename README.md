# oblique code

An example application with a Clojure/ClojureScript modern stack:

#### Server

- web server: aleph https://github.com/ztellman/aleph
- HTTP API - yada https://github.com/juxt/yada
- Lifecycle - mount https://github.com/tolitius/mount
- URI dispatch - bidi https://github.com/juxt/bidi

#### Client

- View - reagent 

## Running

To compile clojurescript, run:

    lein figwheel

To start a web server for the application, run:

```
lein repl
user=> (dev)
user=> (go)
user=> (reset)
user=> (start-figwheel!)
user=> (cljs-repl)
```

- Server: http://localhost:8080/api/1.0/status
- Client: 



