
# Práctica 2 - Programación de Servicios y Procesos (PSP)

Este proyecto consiste en la creación de tres aplicaciones en **Java** que interactúan a través de la **entrada y salida estándar**, utilizando procesos encadenados mediante tuberías (`|`).  

La práctica permite afianzar conceptos básicos de programación y de comunicación entre procesos en el sistema operativo.

---

## 📂 Estructura de la práctica

El proyecto incluye **tres aplicaciones independientes**:

1. **lectorTexto**  
   - Lee el contenido de un archivo de texto (`entrada.txt`) y lo envía a la salida estándar línea por línea.  
   - Si el archivo no existe, muestra un mensaje de error y termina.

2. **filtraLineas**  
   - Recibe líneas de texto desde la entrada estándar.  
   - Muestra solo aquellas que tengan **más de 20 caracteres**.  

3. **contadorPalabras**  
   - Recibe líneas desde la entrada estándar.  
   - Calcula y muestra el **número total de palabras**.  
   - Se considera palabra cualquier secuencia separada por espacios.

---

## ⚙️ Requisitos

- **Java JDK 17+**  
- **IDE**: NetBeans, Eclipse o IntelliJ IDEA.  
- Sistema operativo con soporte para ejecución de programas vía línea de comandos y tuberías (`|`).

---

## ▶️ Ejecución de los programas

### 1. Ejecución independiente

- **lectorTexto**  
  ```bash
  java lectorTexto
````

* **filtraLineas**
  Introducir manualmente texto por consola:

  ```bash
  java filtraLineas
  ```

  Escribir varias líneas y finalizar con `Ctrl + D` (Linux/macOS) o `Ctrl + Z` (Windows).

* **contadorPalabras**

  ```bash
  java contadorPalabras
  ```

### 2. Ejecución encadenada con tuberías

Se pueden **combinar** los tres programas mediante el operador `|`.

Ejemplo completo:

```bash
java lectorTexto | java filtraLineas | java contadorPalabras
```

👉 Este comando realiza lo siguiente:

1. `lectorTexto` lee el archivo `entrada.txt` y envía su contenido.
2. `filtraLineas` recibe esas líneas y muestra solo las que tengan más de 20 caracteres.
3. `contadorPalabras` cuenta cuántas palabras contienen las líneas filtradas.

---

## 📖 Manual de uso y pruebas

1. Crear un archivo llamado `entrada.txt` en la misma carpeta del proyecto.
   Ejemplo de contenido:

   ```
   Hola
   Esto es una prueba de lectorTexto
   Línea corta
   Esta línea es suficientemente larga para ser filtrada
   ```

2. Ejecutar:

   ```bash
   java lectorTexto
   ```

   Salida esperada:

   ```
   Hola
   Esto es una prueba de lectorTexto
   Línea corta
   Esta línea es suficientemente larga para ser filtrada
   ```

3. Encadenar con `filtraLineas`:

   ```bash
   java lectorTexto | java filtraLineas
   ```

   Salida esperada:

   ```
   Esto es una prueba de lectorTexto
   Esta línea es suficientemente larga para ser filtrada
   ```

4. Encadenar con los tres programas:

   ```bash
   java lectorTexto | java filtraLineas | java contadorPalabras
   ```

   Salida esperada (ejemplo):

   ```
   Número total de palabras: 12
   ```

---

## 📝 Criterios de evaluación

* **lectorTexto** → 2.5 puntos
* **filtraLineas** → 2.5 puntos
* **contadorPalabras** → 3 puntos
* **Manual de uso con capturas y explicaciones** → 2 puntos

**Total: 10 puntos**

---

## 📸 Capturas

Imagenes en pdf

---

## ✍️ Autor

Práctica desarrollada como parte de la asignatura **Programación de Servicios y Procesos (PSP)**.

```

---

¿Quieres que también te prepare el documento de **manual de uso con capturas** en formato **.docx o .pdf** para que lo entregues directamente, además del README?
```
