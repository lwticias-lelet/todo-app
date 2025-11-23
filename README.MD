# Todo App – Clojure + ClojureScript

**Aluno:** Leticia Delfino de Araujo  
**Matrícula:** 2021061763  

**Tutorial seguido:**  
https://profsergiocosta.notion.site/Tutorial-Clojure-ClojureScript-Construindo-uma-Aplica-o-Persistente-e-Reativa-2a5cce975093807aa9f0f0cb0cf69645

---

## 📘 Sobre o Projeto

Este projeto implementa um **Todo App completo**, com um backend em **Clojure + SQLite** e um frontend em **ClojureScript + Reagent**, totalmente reativo e persistente.

Funcionalidades implementadas:

- ✔ Criar tarefas  
- ✔ Listar tarefas  
- ✔ Marcar tarefas como concluídas (toggle)  
- ✔ Interface reativa com Reagent  
- ✔ API REST usando Reitit  
- ✔ Banco de dados SQLite com JDBC  
- ✔ Atualização automática após alterações  

Esse projeto é parte das atividades do tutorial de desenvolvimento web com Clojure e ClojureScript.

---

## 🧰 Tecnologias Utilizadas

### **Backend**
- Clojure
- Jetty
- Reitit
- Ring
- Middleware JSON
- next.jdbc
- SQLite

### **Frontend**
- ClojureScript
- Reagent (React para ClojureScript)
- Shadow-CLJS

---

## 🚀 Como Rodar o Projeto

Siga estas instruções para rodar backend e frontend corretamente.

---

## 🔧 **1. Pré-requisitos**

Instale:

### **Backend**
- Java JDK 8+
- Clojure CLI (`clj`)

### **Frontend**
- Node.js + npm
- Shadow-CLJS

Verifique:

```bash
clj --version
java -version
node -v
npm -v

📦 2. Instalar dependências do frontend

Execute:

npm install

▶️ 3. Rodar o projeto

Você deve abrir dois terminais.

🖥️ Terminal 1 — Rodar o Backend
clj -M:run


Isso iniciará o servidor em:

http://localhost:3000

🌐 Terminal 2 — Rodar o Frontend
npx shadow-cljs watch app


Depois abra no navegador:

http://localhost:8000