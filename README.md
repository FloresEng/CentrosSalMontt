# Evaluación Formativa S6 - DOO I

## Autor del Proyecto
- **Nombre:** Javier Flores Soriano
- **Sección:** 003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## Descripción de Proyecto
Este proyecto modela y gestiona distintas unidades operativas dentro de la industria salmonera, tales como Centros de Cultivo y Plantas de Proceso, utilizando principios de POO, herencia, composición y polimorfismo.

---

🛠️ Tecnologías utilizadas

Java 17+

- Programación Orientada a Objetos
- Javadoc
- Patrón de diseño: Composición + Herencia

## Estructura del Proyecto

```plaintext
📁src/
 └──  📁com.duoc
       ├──  📁model
       │     ├── UnidadOperativa.java
       │     ├── CentroCultivo.java
       │     ├── PlantaProceso.java
       │     └── JefeZonal.java
       ├──  📁data
       │     └── GestorUnidades.java
       └──  📁ui
             └── Main.java
````
### **Model**
- **UnidadOperativa**: Superclase que contiene:
  - nombre.
  - comuna.
  Valida que los campos no sean **null** ni los espacios en blanco (**isBlank()**).

- **CentroCultivo**: Subclase que extiende de UnidadOperativa e incorpora:
  - tipoSalmon.
  - JefeZonal (Composición).
  Valida que tipo de salmón no esté vacío y jefe zonal sea válido.

- **PlantaProceso**: Subclase que extiende de UnidadOperativa e incorpora:
  - tonProducto.
  - JefeZonal.
  Valida que toneladas no sean negativas.

- **JefeZonal**: Clase compuesta que se crea en CentroCultivo y PlantaProceso. Contiene:
  - Nombre del jefe.
  - Zona a cargo.
  Valida que los campos no sean **null** ni los espacios en blanco (**isBlank()**).

### **Data**
Contiene **GestorUnidades** que gestiona y administra unidades operativas.

### **UI: Main**
Ejecutable que permite imprimir instancias creadas en GestorUnidades.


## 🖥 Ejemplo de salida por consola
<img width="1785" height="654" alt="imagen" src="https://github.com/user-attachments/assets/bb85546a-7a5a-4ee0-80ef-1d7e72120e09" />

## Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:
   
```bash
git clone https://github.com/FloresEng/CentrosSalMontt.git
```
2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que los archivos `.txt` estén correctamente ubicados.

4. Ejecuta el archivo `Main.java` desde el paquete `UI`.

5. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).


---

**Repositorio GitHub:** \[https://github.com/FloresEng/CentrosSalMontt.git]
**Fecha de entrega:** \[12/01/2025]

---




