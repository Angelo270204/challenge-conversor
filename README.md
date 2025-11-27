# 💱 Challenge Conversor de Monedas

## 📋 Descripción del Proyecto

Este proyecto es un **Conversor de Monedas** desarrollado como parte del programa **Oracle Next Education (ONE)** en colaboración con **Alura Latam**. La aplicación permite realizar conversiones entre diferentes monedas utilizando tasas de cambio en tiempo real obtenidas a través de una API externa.

## ✨ Funcionalidades

- 🔄 Conversión de USD (Dólar) a ARS (Peso Argentino)
- 🔄 Conversión de ARS (Peso Argentino) a USD (Dólar)
- 🔄 Conversión de USD (Dólar) a BRL (Real Brasileño)
- 🔄 Conversión de BRL (Real Brasileño) a USD (Dólar)
- 🔄 Conversión de USD (Dólar) a COP (Peso Colombiano)
- 🔄 Conversión de COP (Peso Colombiano) a USD (Dólar)
- 📡 Tasas de cambio actualizadas en tiempo real mediante API
- 🖥️ Interfaz de consola interactiva y fácil de usar

## 🛠️ Tecnologías Utilizadas

- **Java 17+** - Lenguaje de programación principal
- **Gson 2.13.2** - Biblioteca para el manejo de JSON
- **HttpClient** - Cliente HTTP nativo de Java para consumo de API
- **ExchangeRate API** - API externa para obtener tasas de cambio actualizadas

## 📁 Estructura del Proyecto

```
challenge-conversor/
├── src/
│   └── lad/com/alura/conversor/
│       ├── Conversor.java          # Clase principal con la lógica del programa
│       ├── ConsultaConversion.java # Clase para consultar la API de conversión
│       ├── InterfazConsola.java    # Clase para mostrar el menú en consola
│       └── RespuestaPeticion.java  # Record para mapear la respuesta de la API
├── .gitignore
├── challenge-conversor.iml
└── README.md
```

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos

- Java JDK 17 o superior instalado
- Biblioteca Gson (gson-2.13.2.jar)

### Pasos de Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/Angelo270204/challenge-conversor.git
   ```

2. **Navegar al directorio del proyecto:**
   ```bash
   cd challenge-conversor
   ```

3. **Compilar el proyecto:**
   ```bash
   javac -cp .:gson-2.13.2.jar src/lad/com/alura/conversor/*.java
   ```

4. **Ejecutar la aplicación:**
   ```bash
   java -cp .:gson-2.13.2.jar:src lad.com.alura.conversor.Conversor
   ```

## 📖 Cómo Usar

1. Al iniciar la aplicación, se mostrará un menú con las opciones disponibles:

```
********************************************************************
Sea bienvenido/a al Conversor de Moneda =]

1) Dolar =>> Peso Argentino
2) Peso Argentino =>> Dolar
3) Dolar =>> Real brasileño
4) Real brasileño =>> Dolar
5) Dolar =>> Peso colombiano
6) Peso Colombiano =>> Dolar
7) Salir
Elija una opción válida:
********************************************************************
```

2. Ingrese el número de la opción deseada (1-6) o 7 para salir.
3. Ingrese la cantidad que desea convertir.
4. La aplicación mostrará el resultado de la conversión.
5. El menú se mostrará nuevamente para realizar más conversiones.

## 🎯 Ejemplo de Uso

```
Elija una opción válida: 1
Ingrese la cantidad que desea convertir: 100
El valor 100.0 [USD] corresponde al valor final de =>>> 85000.00 [ARS]
```

## 👨‍💻 Autor

Desarrollado por **Angelo** como parte del Challenge del programa **ONE - Oracle Next Education** en colaboración con **Alura Latam**.

## 📄 Licencia

Este proyecto fue desarrollado con fines educativos como parte del programa ONE.

---

⭐ ¡Si te gustó este proyecto, no olvides darle una estrella!
