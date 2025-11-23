(ns todo.frontend.core
  (:require
    [reagent.core :as r]
    [reagent.dom.client :as rdom]
    [clojure.string :as str]))

;; --- 1. Estado Global Reativo ---
(defonce app-state
  (r/atom {:next-id 1
           :input-text ""
           :todos []}))

;; --- 2. Lógica ---
(defn adicionar-todo-local []
  (swap! app-state
         (fn [estado-atual]
           (let [novo-titulo (:input-text estado-atual)
                 novo-id (:next-id estado-atual)]
             (if (str/blank? novo-titulo)
               estado-atual
               {:next-id (inc novo-id)
                :input-text ""
                :todos (conj (:todos estado-atual)
                             {:id novo-id
                              :title novo-titulo})})))))


;; --- 3. Formulário Conectado ao Estado ---
(defn todo-form []
  [:div.todo-input
   [:input
    {:type "text"
     :placeholder "O que precisa ser feito?"
     :value (:input-text @app-state)
     :on-change #(swap! app-state assoc :input-text (-> % .-target .-value))}]

   [:button
    {:on-click adicionar-todo-local}
    "Adicionar (Local)"]])


;; --- 4. Lista lendo direto do Estado ---
(defn todo-list []
  [:ul.todo-list
   (for [todo (:todos @app-state)]
     ^{:key (:id todo)}
     [:li.todo-item
      (:title todo)])])


;; --- 5. App principal sem dados falsos ---
(defn app []
  [:div.todo-app
   [:h1 "Todo App (Somente Frontend)"]
   [:p "Isto é 100% local. Recarregue (F5) para ver os dados sumirem."]

   [todo-form]
   [todo-list]])


;; Inicialização React 18
(defn ^:export init []
  (println "Frontend inicializado...")
  (let [root (rdom/create-root (js/document.getElementById "app"))]
    (.render root (r/as-element [app]))))
