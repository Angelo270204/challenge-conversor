# 💱 Conversor de Monedas - Challenge Alura

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GSON](https://img.shields.io/badge/GSON-Library-blue?style=for-the-badge)
![API](https://img.shields.io/badge/ExchangeRate-API-green?style=for-the-badge)

## 📄 Descripción

Este proyecto es una aplicación de consola en **Java** que realiza conversiones de divisas en tiempo real. Fue desarrollado como parte del desafío del programa **Oracle Next Education (ONE) + Alura**.

La aplicación consume la API de **ExchangeRate-API** para obtener tasas de cambio actualizadas y permite al usuario convertir entre Dólares Estadounidenses (USD) y varias monedas latinoamericanas.

## ⚙️ Funcionalidades

* ✅ Conversión de moneda en tiempo real.
* ✅ Menú interactivo y fácil de usar.
* ✅ Soporte para las siguientes conversiones:
    * Dólar (USD) ↔️ Peso Argentino (ARS)
    * Dólar (USD) ↔️ Real Brasileño (BRL)
    * Dólar (USD) ↔️ Peso Colombiano (COP)
* ✅ Validación de entradas de usuario.
* ✅ Manejo de errores y excepciones.

## 🛠️ Tecnologías Utilizadas

* **Java 17+**: Uso de características modernas como `Records`, `Switch Expressions` y `HttpClient`.
* **Google Gson**: Librería para parsear el JSON recibido de la API a objetos Java.
* **ExchangeRate-API**: Servicio externo para obtener las tasas de cambio.

## 📂 Estructura del Proyecto

El código está organizado en las siguientes clases:

* `Conversor.java`: Clase principal (Main) que maneja el flujo del programa, el ciclo `while` y la lógica de interacción con el usuario.
* `ConsultaConversion.java`: Se encarga de realizar la petición HTTP a la API y retornar los datos mapeados.
* `RespuestaPeticion.java`: Un Java `Record` que modela la estructura de datos necesaria (DTO) proveniente del JSON.
* `InterfazConsola.java`: Clase dedicada a mostrar el menú de opciones en pantalla.

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos
1.  Tener instalado **Java JDK 17** o superior.
2.  Tener la librería **Gson** añadida a las dependencias del proyecto.

### Pasos
1.  Clona este repositorio:
    ```bash
    git clone [https://github.com/TU_USUARIO/TU_REPOSITORIO.git](https://github.com/TU_USUARIO/TU_REPOSITORIO.git)
    ```
2.  Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, etc.).
3.  Asegúrate de importar la librería `com.google.gson`.
4.  Ejecuta la clase `Conversor.java`.

## 📸 Ejemplo de Uso

Al ejecutar el programa, verás el siguiente menú en la consola:

```text
********************************************************************
Sea bienvenido/a al Conversor de Moneda =]

1) Dolar =>> Peso Argentino
2) Peso Argentino =>> Dolar
3) Dolar =>> Real brasileno
4) Real brasileno =>> Dolar
5) Dolar =>> Peso colombiano
6) Peso Colombiano =>> Dolar
7) Salir
Elija una opcion valida:
********************************************************************
````

Ejemplo de salida al convertir:
`El valor 50.0 [USD] corresponde al valor final de =>>> 250.00 [BRL]`

## 👤 Autor

Desarrollado por **Angelo Rubiños Ortiz**.
