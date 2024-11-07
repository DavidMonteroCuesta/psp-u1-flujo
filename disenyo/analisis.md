```mermaid

flowchart LR

F[Flujo] --> DF[df]
DF -. INFO DE DF .-> F

F --> FR[free]
FR -. INFO DE FREE .-> F

F --> PS[ps]
PS -. INFO DE PS .-> F

F -. INFO DE TODOS LOS COMANDOS .-> MD[MarkDown]

```