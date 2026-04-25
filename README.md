# 2 Actividades — Android App

Proyecto de tarea: navegación entre dos actividades en Android con Jetpack Compose.

## 📱 Descripción

Esta app demuestra cómo navegar entre dos Activities usando **Intents** en Android, implementada con **Jetpack Compose** siguiendo las buenas prácticas de Material Design 3.

## ✨ Mejoras aplicadas sobre el proyecto base

| Aspecto | Original | Mejorado |
|---------|----------|----------|
| Fondo | Blanco plano | Gradiente azul oscuro / teal |
| Tipografía | Texto genérico | Jerarquía clara: badge, título, subtítulo |
| Botones | Material por defecto | Botón primario + botón outlined con ícono |
| Animación | Ninguna | Fade-in al cargar cada pantalla |
| Strings | Mínimos | Subtítulos y texto de tarjeta informativos |
| Tema | Default | Paleta custom oscura coherente |
| Navegación | Solo botón | Botón con flecha de regreso + ícono |

## 🎨 Paleta de colores

- **Actividad 1**: Gradiente `#0F2027 → #203A43 → #2C5364` con acento `#4FC3F7`
- **Actividad 2**: Gradiente `#1A0533 → #2D1B69 → #11998E` con acento `#80CBC4`

## 🏗️ Estructura del proyecto

```
app/src/main/
├── java/com/equipo1/a2actividades/
│   ├── MainActivity.kt          ← Actividad 1 con fade-in y tarjeta
│   ├── SecondActivity.kt        ← Actividad 2 con ícono de regreso
│   └── ui/theme/
│       ├── Color.kt             ← Paleta de colores
│       ├── Theme.kt             ← MaterialTheme dark/light
│       └── Type.kt              ← Tipografía
└── res/
    └── values/
        └── strings.xml          ← Textos localizables
```

## 🚀 Cómo abrir en Android Studio

1. Clonar o descomprimir el proyecto
2. Abrir Android Studio → **Open** → seleccionar la carpeta raíz
3. Esperar a que Gradle sincronice las dependencias
4. Ejecutar en un emulador o dispositivo con API 24+

## 📦 Dependencias principales

- `androidx.compose.bom:2024.12.01`
- `material3`
- `material-icons-extended` (para el ícono de flecha)
- `activity-compose:1.9.3`

## 👥 Equipo 1
# Comunicar-Actividades
