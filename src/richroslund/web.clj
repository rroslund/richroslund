(ns richroslund.web
  (:use [ring.adapter.jetty :only [run-jetty]]
        [compojure.core])
  (:require [compojure.route :as route]))

(defroutes app
           (GET "/" [] "<html><head><title>Rich Roslund</title></head><h1>Hello World...and welcome to my site!</h1><p>Please forgive the ghetto feel. This is a side project in Clojure web development. Who knows where it could go! </p><br><a href=\"http://amaliz.herokuapp.com\">Check out Amaliz!</a></html>")
           (route/not-found "<h1>Page not found</h1>"))

(defn -main []
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (run-jetty app {:port port})))

