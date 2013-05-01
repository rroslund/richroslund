(ns richroslund.web
  (:use [ring.adapter.jetty :only [run-jetty]]
        [compojure.core])
  (:require [compojure.route :as route]))

(defroutes app
           (GET "/" [] "<h1>Hello World</h1>")
           (route/not-found "<h1>Page not found</h1>"))

(defn -main []
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (run-jetty app {:port port})))

