# Practica: Algoritmos de Ordenamiento Burbuja

## 1. Descripcion del Proyecto
Este proyecto contiene una practica en Java donde se implementan e identifican las diferencias de rendimiento entre el algoritmo de ordenamiento Burbuja Tradicional y el Burbuja Mejorado (Optimizado). 

## 2. Ejemplo de Uso
El proyecto incluye una clase `Main` que sirve para poner a prueba los metodos. Cuenta con casos de prueba ejecutados sobre arreglos completamente desordenados y arreglos parcialmente ordenados. Al ejecutar el programa, la consola muestra el estado inicial, el estado final y el numero exacto de pasadas, comparaciones e intercambios para demostrar cual metodo es mas eficiente.

## 3. Complejidad Temporal (Big O)

### Burbuja Tradicional
* **Mejor Caso:** `O(n^2)`
* **Peor Caso:** `O(n^2)`
* **Explicacion de la Optimizacion:** Recorre siempre todos los ciclos anidados, sin importar si el arreglo ya estaba ordenado.

### Burbuja Mejorado
* **Mejor Caso:** `O(n)`
* **Peor Caso:** `O(n^2)`
* **Explicacion de la Optimizacion:** Utiliza una bandera para detener el ciclo si el arreglo ya esta ordenado. Al no registrar ningun intercambio en la primera pasada, se interrumpe de inmediato.