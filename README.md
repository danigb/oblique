# oblique code

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

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



