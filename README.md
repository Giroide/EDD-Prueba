# Registro cronológico de comandos

## Comandos ejecutados en orden cronológico

1. `git init -b main` — Inicializa el repositorio Git local creando la rama principal `main`.
2. `git config user.name "Telmo"` — Configura el nombre de autor para los commits del repositorio.
3. `git add README.md` — Prepara el archivo inicial de documentación para el primer commit en `main`.
4. `git commit -m "docs(main): crea README.md e inicia registro cronologico de comandos"` — Registra el commit inicial de documentación en `main`.
5. `git checkout -b backend` — Crea y cambia a la rama `backend` para desarrollar exclusivamente la lógica en Java (`.java`).
6. `git add Calculadora.java` — Añade el archivo fuente Java al área de preparación de la rama `backend`.
7. `git commit -m "feat(backend): implementa suma, resta, multiplicacion y potencia en [-99999, 99999]"` — Registra el commit inicial de `Calculadora.java` en `backend`.
8. `javac Calculadora.java` — Compila el código fuente Java para comprobar sintaxis y generar el bytecode.
9. `javac Calculadora.java` — Recompila `Calculadora.java` tras completar la implementación y validación del rango `[-99999, 99999]`.
10. `java Calculadora` — Ejecuta la calculadora en consola y verifica el rechazo de entradas fuera del rango permitido (`-1040204295` y `125532953969`).
11. `git add Calculadora.java` — Prepara la versión final de `Calculadora.java` con las operaciones permitidas (`+`, `-`, `*`, `^`) y validación de rango.
12. `git commit -m "feat(backend): implementa calculadora con suma, resta, multiplicacion y potencia"` — Guarda en `backend` la implementación completa del archivo `.java`.
13. `rm -f Calculadora.class` — Elimina el archivo compilado `.class` para mantener en `backend` únicamente código fuente `.java`.
14. `git checkout main` — Vuelve a la rama `main` antes de crear la rama de interfaz.
15. `git checkout -b frontend` — Crea y cambia a la rama `frontend` para desarrollar exclusivamente archivos `.html`.
16. `git add index.html` — Prepara `index.html` con la interfaz y validación para enteros en `[-99999, 99999]`.
17. `git commit -m "feat(frontend): crea index.html para operaciones en [-99999, 99999]"` — Registra en `frontend` el commit exclusivo del archivo `.html`.
18. `git checkout main` — Cambia a `main` para integrar el trabajo de las ramas `backend` y `frontend`.
19. `git merge backend -m "merge: integra rama backend (.java)"` — Fusiona en `main` los cambios de la rama `backend`.
20. `git merge frontend -m "merge: integra rama frontend (.html)"` — Fusiona en `main` los cambios de la rama `frontend`.