# Calculadora Básica de Consola

Calculadora simple en Java que funciona por consola. Permite realizar suma, resta, multiplicación y división de forma continua hasta que el usuario decide salir.

## Características

- Operaciones: suma (+), resta (-), multiplicación (*) y división (/)
- Soporte para números enteros y decimales
- Control de división por cero
- Bucle continuo para realizar varias operaciones sin reiniciar el programa
- Salir escribiendo `salir`

## Requisitos

- Java JDK 17 o superior
- Apache Ant

Instalación en Fedora:

```bash
sudo dnf install java-17-openjdk-devel ant
```

Instalación en Ubuntu/Debian:

```bash
sudo apt install openjdk-17-jdk ant
```

## Cómo ejecutar

```bash
git clone https://github.com/JavFloresDev/calculadora-basica-java
cd calculadora-basica-java
chmod +x run.sh
./run.sh
```

El script `run.sh` limpia, compila y ejecuta el proyecto automáticamente.

### Alternativa con Ant

```bash
ant clean run
```

### Ejecutar el JAR ya compilado

```bash
java -jar dist/CalculadoraAnt.jar
```

## Ejemplo de uso

```
=== Calculadora Básica ===
Operaciones: + - * /
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
├── src/            # Código fuente
├── build.xml       # Script de compilación de Ant
├── run.sh          # Script de ejecución rápida
├── LICENSE
└── README.md
```

## Problemas comunes

**Error `invalid target release`**

El proyecto está configurado para una versión de Java que no tienes. Abre el proyecto en NetBeans, ve a Properties → Build → Compile y selecciona una versión instalada en tu sistema.

**Error `ant: command not found`**

Instala Ant con el comando correspondiente a tu distribución (ver sección Requisitos).

## Autor

JavFloresDev — Jhonny Flores

## Licencia

MIT. Consulta el archivo [LICENSE](LICENSE).
