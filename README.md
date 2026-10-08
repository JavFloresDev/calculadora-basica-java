# Calculadora Básica de Consola

Calculadora simple desarrollada en Java que funciona completamente por consola. Permite realizar las cuatro operaciones básicas (suma, resta, multiplicación y división) de forma continua hasta que el usuario decide salir.

## Características

- Operaciones: suma (`+`), resta (`-`), multiplicación (`*`) y división (`/`)
- Soporte para números enteros y decimales
- Control de división por cero
- Bucle continuo para realizar varias operaciones sin reiniciar el programa
- Opción clara para salir escribiendo `salir` (también acepta `0 : 0` como salida rápida)

## Tecnologías utilizadas

- Java (JDK 8 o superior)
- Apache Ant (para compilar y ejecutar sin IDE)
- NetBeans (IDE original del proyecto)

## Requisitos previos

- Tener instalado el **JDK** (versión 8 o superior). Verifica con:
  ```bash
  java -version
  javac -version
  ```
- Opcional pero recomendado: tener instalado **Apache Ant** si quieres compilar sin IDE:
  ```bash
  ant -version
  ```

## Cómo ejecutar el proyecto

### Paso 1: Clonar el repositorio

```bash
git clone https://github.com/JavFloresDev/calculadora-basica-java
```

### Paso 2: Entrar a la carpeta del proyecto

```bash
cd calculadora-basica-java
```

### Paso 3: Elegir una forma de ejecución

#### Opción 1: Ejecutar el JAR ya compilado (la más fácil)

El repositorio incluye una carpeta `dist/` con el archivo `.jar` ya generado. Solo ejecuta:

```bash
java -jar dist/calculadora-basica-java.jar
```

> **Nota:** El nombre exacto del `.jar` puede variar. Revisa el contenido de `dist/` con `ls dist/`.

#### Opción 2: Compilar y ejecutar con Apache Ant

Si tienes Ant instalado, desde la raíz del proyecto:

```bash
ant run
```

Otros comandos útiles:

| Comando       | Descripción                          |
|---------------|--------------------------------------|
| `ant compile` | Solo compila el proyecto             |
| `ant jar`     | Genera el archivo `.jar` en `dist/`  |
| `ant clean`   | Limpia los archivos compilados       |
| `ant run`     | Compila y ejecuta el programa        |

#### Opción 3: Compilar manualmente con `javac`

Si tu archivo `Calculadora.java` está dentro de un paquete (por ejemplo `calculadora`), la estructura sería:

```
src/
└── calculadora/
    └── Calculadora.java
```

En ese caso, compila y ejecuta así:

```bash
# Compilar (desde la raíz del proyecto)
javac -d build/classes src/calculadora/Calculadora.java

# Ejecutar (indicando el paquete)
java -cp build/classes calculadora.Calculadora
```

Si tu archivo **no tiene paquete** y está directamente en `src/Calculadora.java`:

```bash
javac -d build/classes src/Calculadora.java
java -cp build/classes Calculadora
```

> **Importante:** Ajusta la ruta según la ubicación real de tu archivo. Puedes verificarla con `find src -name "*.java"`.

## Ejemplo de uso

```
=== Calculadora Básica ===
Operaciones disponibles: + - * /
Escribe 'salir' para terminar.

Primer número: 25
Segundo número: 5
Operación (+, -, *, /): /
Resultado: 5.0

Primer número: 10
Segundo número: 0
Operación (+, -, *, /): /
Error: No se puede dividir por cero.

Primer número: salir
¡Hasta luego!
```

## Estructura del proyecto

```
calculadora-basica-java/
├── build/          # Archivos compilados (generados)
├── dist/           # JAR ejecutable (generado)
├── nbproject/      # Configuración de NetBeans
├── src/            # Código fuente Java
├── build.xml       # Script de compilación de Ant
├── manifest.mf     # Manifiesto del JAR
├── LICENSE         # Licencia MIT
└── README.md       # Este archivo
```

## Autor

**JavFloresDev** — Jhonny Flores

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
