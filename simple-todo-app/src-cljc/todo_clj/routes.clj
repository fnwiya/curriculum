(ns todo-clj.routes)

(def main
  ["/" {"" :home
        "todo" {"" :todo-index
                ["/" [#"\d+" :id]] :todo-show}
        "settings" {"/user" {"" :user-index
                             "/add" {:get :user-add
                                     :post :user-add-post}
                             "/id" :user-show}}
        true :not-found}])
