# Normalización de Modelo de Datos

Una empresa de fintech necesita un modelo de datos eficiente y normalizado para gestionar sus transacciones financieras. El sistema debe almacenar información sobre clientes, cuentas, transacciones y productos financieros. Tu tarea es diseñar e implementar un modelo de datos normalizado que cumpla con las formas normales y utilice un modelo Entidad-Relación.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Diseño e Implementación de un Modelo de Datos Normalizado |
| **Nivel** | advanced-l1 |
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

### Fase 1: Diseño Inicial del Modelo de Datos

**Objetivo:** Crear un modelo de datos que represente las entidades y relaciones necesarias para el sistema.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica las entidades clave del sistema (clientes, cuentas, transacciones, productos financieros).
- Define las relaciones entre estas entidades.
- Crea un diagrama Entidad-Relación que represente el modelo de datos.

**Entregable:** Diagrama Entidad-Relación completo.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las formas normales ayudan a eliminar redundancias y mejorar la integridad de los datos.
- Piensa en cómo las relaciones entre entidades impactan la estructura del modelo de datos.

</details>

### Fase 2: Aplicación de Formas Normales

**Objetivo:** Aplicar las formas normales al modelo de datos para eliminar redundancias y mejorar la integridad.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Analiza tu modelo de datos y aplica las formas normales (1NF, 2NF, 3NF) para eliminar redundancias y mejorar la integridad.
- Identifica y corrige cualquier violación de las formas normales en tu modelo.

**Entregable:** Modelo de datos normalizado con formas normales aplicadas.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la primera forma normal elimina columnas repetidas, la segunda forma normal elimina dependencias parciales y la tercera forma normal elimina dependencias transitivas.
- Piensa en cómo las formas normales impactan la estructura y eficiencia del modelo de datos.

</details>

### Fase 3: Implementación del Modelo de Datos

**Objetivo:** Implementar el modelo de datos normalizado en una base de datos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Crea las tablas necesarias en la base de datos para representar tu modelo de datos normalizado.
- Define las claves primarias y extranjeras para establecer las relaciones entre las tablas.
- Inserta datos de prueba en las tablas para verificar la integridad y funcionalidad del modelo.

**Entregable:** Base de datos con el modelo de datos normalizado implementado y datos de prueba insertados.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las claves primarias y extranjeras son esenciales para mantener la integridad referencial en el modelo de datos.
- Piensa en cómo los datos de prueba pueden ayudarte a verificar la funcionalidad y eficiencia del modelo de datos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las formas normales y por qué son importantes en el diseño de un modelo de datos?
- **paraQueSirve**: ¿Para qué sirve un modelo Entidad-Relación en el diseño de un sistema de información?
- **comoSeUsa**: ¿Cómo aplicas las formas normales a un modelo de datos para mejorar su integridad y eficiencia?
- **erroresComunes**: ¿Cuáles son los errores comunes al aplicar las formas normales a un modelo de datos?

## Criterios de Evaluacion

- Diseño de un modelo de datos que representa las entidades y relaciones necesarias para el sistema.
- Aplicación de las formas normales al modelo de datos para eliminar redundancias y mejorar la integridad.
- Implementación del modelo de datos normalizado en una base de datos con datos de prueba insertados.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
