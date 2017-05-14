# Things I Learn

## Format clojure code, argggg...

`
:plugins [[lein-cljfmt "0.5.6"]]

lein cljfmt check
lein cljfmt fix
`

- https://github.com/weavejester/cljfmt

## configure Clojure Code Extension (Visual Studio COde)

```

tools jar: /Library/Java/JavaVirtualMachines/jdk1.8.0_40.jdk/Contents/Home/lib/tools.jar

{:debug-repl {:resource-paths [#=(eval (System/getenv "PATH_TO_TOOLS_JAR"))]
              :repl-options {:nrepl-middleware [debug-middleware.core/debug-middleware]}
              :dependencies [[debug-middleware #=(eval (System/getenv "DEBUG_MIDDLEWARE_VERSION"))]]}
````
## yada 

- https://github.com/juxt/yada
- manual: https://juxt.pro/yada/manual/index.html

## mount (app lifecyle aka state)

- https://github.com/tolitius/mount
- used to refresh repl: [org.clojure/tools.namespace "0.2.11"]
- mount with aleph: https://github.com/luminus-framework/luminus-aleph/blob/master/src/luminus/http_server.clj

## Use `dev` folder

- https://github.com/juxt/yada/blob/master/examples/phonebook/dev/dev.clj
- https://github.com/juxt/edge/blob/master/dev/user.clj

## Web server

- Aleph: https://github.com/ztellman/aleph
- Routing: https://github.com/juxt/bidi

#### Aero configuration

#### `defstate`

> Outside of ‘defstate’s which work like regular ‘def’ variables everything is a function. In my opinion, the above looks more idiomatic and I find it easier to read than the componentized version. In my experience mount’ed code ends up being shorter as a bonus. A big takeaway from using mount is that you can require defstate variables like you would any other var in a namespace and it just works. 

Source : http://danboykis.com/?p=2263

- https://github.com/luminus-framework/luminus/blob/master/resources/md/components.md#managing-component-lifecycle
- The lib: https://github.com/tolitius/mount


#### ^ is for meta

> Another shorthand version allows the metadata to be a keyword, in which case it is treated as a single entry map with a key of the keyword and a value of true, e.g.: `^:dynamic x is the same as ^{:dynamic true} x`

```clojure
(defstate ^:dynamic *db* ...) => (defstate ^{:dynamic true} *db* ...)
````

- https://clojure.org/reference/reader