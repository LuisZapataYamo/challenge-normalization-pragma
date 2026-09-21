# Normalización de Modelo de Datos en una Base de Datos

El sistema de gestión de una empresa fintech necesita un modelo de datos normalizado para mejorar la eficiencia y reducir la redundancia. Tu tarea es diseñar e implementar un modelo de datos que cumpla con las formas normales y utilizar un modelo Entidad-Relación para representar la estructura de la base de datos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Diseño e Implementación de un Modelo de Datos Normalizado |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Análisis de Requerimientos

**Objetivo:** Identificar las entidades y relaciones necesarias para el modelo de datos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza los requerimientos del sistema y determina las entidades y relaciones necesarias.
- Crea un diagrama Entidad-Relación que represente la estructura del modelo de datos.

**Entregable:** Diagrama Entidad-Relación completo.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las reglas de negocio y las relaciones entre las entidades.
- Piensa en cómo las entidades se relacionan entre sí y cómo se pueden normalizar.

</details>

### Fase 2: Normalización del Modelo de Datos

**Objetivo:** Aplicar las formas normales al modelo de datos para eliminar la redundancia y mejorar la eficiencia.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Aplica las formas normales al modelo de datos creado en la fase anterior.
- Identifica y elimina la redundancia en el modelo de datos.

**Entregable:** Modelo de datos normalizado con las formas normales aplicadas.

<details>
<summary>Pistas de conocimiento</summary>

- Revisa las definiciones de las formas normales y cómo se aplican a tu modelo de datos.
- Considera cómo la normalización puede mejorar la eficiencia y reducir la redundancia.

</details>

### Fase 3: Implementación del Modelo de Datos

**Objetivo:** Implementar el modelo de datos normalizado en una base de datos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Crea las tablas necesarias en la base de datos para implementar el modelo de datos normalizado.
- Define las relaciones entre las tablas según el diagrama Entidad-Relación.

**Entregable:** Base de datos implementada con el modelo de datos normalizado.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza las definiciones de las entidades y relaciones para crear las tablas en la base de datos.
- Asegúrate de que las relaciones entre las tablas reflejen el diagrama Entidad-Relación.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un modelo de datos normalizado y por qué es importante?
- **paraQueSirve**: ¿Para qué sirve la normalización en un modelo de datos?
- **comoSeUsa**: ¿Cómo se aplican las formas normales a un modelo de datos?
- **erroresComunes**: ¿Cuáles son los errores comunes al normalizar un modelo de datos?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de un modelo de datos normalizado?

## Criterios de Evaluacion

- Identificar entidades y relaciones necesarias para el modelo de datos.
- Aplicar las formas normales al modelo de datos.
- Eliminar la redundancia en el modelo de datos.
- Implementar el modelo de datos normalizado en una base de datos.
- Definir las relaciones entre las tablas según el diagrama Entidad-Relación.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
