(ns richroslund.web
  (:use [ring.adapter.jetty :only [run-jetty]]
        [compojure.core])
  (:require [compojure.route :as route]))

(defroutes app
           (GET "/" [] "<html><h1>Hello World</h1><br><a href="http://amaliz.herokuapp.com">Check out Amaliz!</a></html>")
           (route/not-found "<h1>Page not found</h1>"))

(defn -main []
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (run-jetty app {:port port})))

