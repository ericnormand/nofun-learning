(ns {{name}}.utils
  (:require [re-frame.core :as re-frame]
            [cljs.pprint :refer [pprint]]
            [{{name}}.cards :as cards]))

(defn state-viewer []
  (let [app-state (re-frame/subscribe [:app-state])]
    (fn []
      [:pre {:style {:margin-top "3em"}}
       (with-out-str (pprint @app-state))])))
