# 🎟️ BoleteriaRoma

BoleteriaRoma es una aplicación de escritorio desarrollada en **Java** para la gestión de la venta de boletos en un cine. Permite administrar **clientes, películas, salas, proyecciones y boletos**, proporcionando una interfaz intuitiva para la gestión eficiente del cine.

---

## 📌 Características

- 📅 **Gestión de proyecciones**: Crear, editar y eliminar funciones de cine.
- 🎞️ **Administración de películas**: Registrar nuevas películas y administrar las existentes.
- 🏛️ **Manejo de salas**: Control sobre la distribución de butacas y disponibilidad.
- 🏷️ **Venta de boletos**: Emisión y gestión de tickets para clientes.
- 👤 **Registro de clientes**: Permite registrar clientes para gestionar reservas y compras.

---

## 🛠️ Tecnologías utilizadas

- 🖥️ **Lenguaje**: Java
- 💾 **Base de Datos**: MariaDB (conexión mediante `mariadb-java-client-2.3.0.jar`)
- 🎨 **Interfaz gráfica**: Swing (NetBeans GUI Builder)
- 📂 **IDE recomendado**: NetBeans

---

## 📁 Estructura del Proyecto

```bash
BoleteriaRoma/
│── src/                  # Código fuente principal
│   ├── Control/          # Clases de lógica de negocio
│   ├── Data/             # Clases de acceso a datos (DAO)
│   ├── VistaPrincipal/   # Interfaz gráfica (Swing)
│── build/                # Archivos compilados (.class)
│── dist/                 # Archivos distribuidos (JAR, librerías)
│── nbproject/            # Configuración de NetBeans
│── manifest.mf           # Archivo de manifiesto para JAR
│── build.xml             # Script de compilación de Ant
│── README.md             # Documentación del proyecto
```

---

## 🚀 Instalación y Uso

### 🔹 Requisitos previos

- Tener instalado **Java JDK 8 o superior**.
- Tener **MariaDB** instalado y configurado.
- **NetBeans** (opcional, recomendado para desarrollo).

### 🔹 Configuración de Base de Datos

1. Importar la base de datos desde el **script SQL** proporcionado.
2. Configurar la conexión en la clase `Conexion.java`.

### 🔹 Ejecutar la Aplicación

- Compilar y ejecutar en **NetBeans**.
- Alternativamente, ejecutar el JAR desde la terminal:

```sh
java -jar dist/BoleteriaRoma.jar
```

---

## 📌 Capturas de pantalla

![image](https://github.com/user-attachments/assets/c7dd7493-3972-4007-a23e-77ff8c3272bb)
![image](https://github.com/user-attachments/assets/877f74f8-e1cf-4276-8071-204e7e530679)
![image](https://github.com/user-attachments/assets/d73dc91f-1aee-4e39-b116-735ba8fcf396)
![image](https://github.com/user-attachments/assets/d3264fff-6074-48d0-8420-689159517d71)

---

## 📜 Licencia

Este proyecto es de uso libre bajo la licencia **MIT**.


