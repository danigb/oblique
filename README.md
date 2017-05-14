# oblique code

An example application with a Clojure/ClojureScript modern stack:

#### Server

- HTTP API - yada https://github.com/juxt/yada
- Lifecycle - mount https://github.com/tolitius/mount

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
```

You can access at: http://localhost:8080/api/1.0/status

Using Figwheel within nREPL: https://github.com/bhauman/lein-figwheel/wiki/Using-the-Figwheel-REPL-within-NRepl



