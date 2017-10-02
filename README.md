# Informatica 3
![Info3](https://i.gyazo.com/9eec324abd61b493d92c87b673a0657a.png)

## Guia 1 - Pilas y Colas con Arreglos
1. Implemente un apuntador de citas usando el concepto de cola circular implementada mediante el uso de un arreglo.
2. Implemente una calculadora de 4 funciones en notación polaca usando el concepto de pilas implementada mediante el uso de un arreglo.
3. Modifique el programa anterior para que la calculadora de 4 funciones trabaje con números en punto flotante.
4. Implemente un programa que ingresada una función matemática, verifique si la cantidad de (,[,{ que abren están balanceados con los que cierran.

## Guia 2 - Listas Enlazadas
1. Crear una función concatenar que dada dos listas enlazadas, pasadas como parámetro, devuelva una lista enlazada que es la unión de las otras dos.
2. Agregue el método Insertar Ordenado que permita realizar inserciones de datos pero mantener el orden dentro de la lista.
3. Implementar la función fnInvierte(lista). Esta función invertirá el orden original de los elementos en la lista, de tal forma que el último elemento será ahora el primero, el penúltimo será el segundo, y así hasta que el primero sea el último.
   Considere que la lista no está vacía y que no se construirá una nueva, sólo se invertirá el orden de los elementos de la lista original.
4. Implemente el metodo merge(lista) que agrega los elementos de lista a la lista original.

## Guia 3 - Recursion
1. (Visualización de la recursión ) Es interesante ver “en acción” a la recursión. 
   Modifique el método factrn ( factorial ) para que imprima su variable local y el parámetro de llamada de la recursión. Por cada llamada recursiva, presente su salida en una línea independiente y agregue un nivel de sangría.
   Haga su mejor esfuerzo por hacer que la salida sea clara, interesante y significativa.
   Su meta aquí es diseñare implementar un formato de salida que ayude a la gente a entender mejor la recursión.
   Tal vez desee agregar estas capacidades de presentación a los otros ejercicios del práctico.
2. Escribir un método power (base, exponente) que, al llamarla, devuelva baseexponente.
   Por ejemplo, power ( 3,2 ) = 32=3⋅(31)=3⋅(3⋅30)=3⋅(3⋅1)=3⋅3=9. 
   Suponga que exponente es un entero mayor o igual que 1.
3. Escriba un método recursivo que calcule el producto de dos números enteros usando sumas sucesivas.
4. Escriba un método recursivo que calcule el cociente de dos números enteros usando restas sucesivas.
5. Escriba un método recursivo que imprima los elementos de un arreglo en orden inverso.
6. Escriba un método recursivo que devuelva el número de unos en la representación binaria de N.
    Use el hecho de que es igual al número de unos en la representación binaria de N/2, más 1 si N es impar.
7. Escribir una función que introduzca un entero no negativo por teclado y lo imprima como una serie de dígitos separados por espacios.
Ej: fn(2345) -> 2 3 4 5

## Guia 4 - Ordenamiento
1. Implemente los métodos de ordenación de inserción, Shellsort y quicksort usando las implementaciones del teórico.
    Ejecútelos con los siguientes objetos:
    * Enteros.
    * Números reales de tipo double.
    * Cadena de caracteres.
    * Utilice los métodos de ordenación de inserción, Shellsort y quicksort para ordenar el archivo es.txt y evaluando el tiempo que demora cada algoritmo.

## Guia 5 - Pilas y Colas con Listas
1. Implemente un apuntador de citas usando el concepto de cola implementada mediante el uso de una lista enlazada.
2. Implemente una calculadora de 4 funciones en notación polaca usando el concepto de pilas implementada mediante el uso de una lista enlazada.
3. Implemente un programa que ingresada una función matemática, verifique si la cantidad de (,[,{ que abren están balanceados con los que cierran.
4. Utilizando una pila y una cola, realizar una función que reciba una cadena y devuelva el valor lógico verdadero si dicha cadena es un palidromo.
   No se deben tener en cuenta los espacios y signos de puntuación.
   > Ejemplos de palidromo:
   >> * anita lava la tina
   >> * la ruta natural
   >> * la ruta nos aporto otro paso natural

## Guia 6 - Arboles Binarios
1. Implementar un método contarPorNivel que devuelva el numero de nodos en el nivel iésimo de un árbol binario
2. Reconstruir un árbol binario a partir de los recorridos siguientes:
   * Arbol 1:
       - Preorden: 2, 5, 3, 9, 7, 1, 6, 4, 8.
       - Inorden: 9, 3, 7, 5, 1, 2, 6, 8, 4. 
   * Arbol 2:  
       - Inorden: 5, 6, 12, 10, 1, 9, 13, 4, 8, 2, 7, 3, 11.
       - Postorden: 6, 5, 10, 9, 1, 13, 12, 2, 8, 3, 11, 7, 4.
3. Escriba un método que devuelva la cantidad de nodos que posee un árbol.
4. Implementar una función no recursiva para recorrer un árbol binario en inOrden.
5. Escriba un programa para generar un árbol binario de 10 números de valores comprendidos entre 0 y 25.
6. Escriba un método de recorrido de árbol binario denominado inOrder para mostrar el árbol generado en forma ordenada.
7. Determine si el programa del ejercicio 1 permite que el árbol binario contenga valores duplicados.
   Cualquiera sea la respuesta, modifique el programa a fin de hacer lo opuesto.
8. Escriba un método _depth_ que recibe un árbol binario y determina cuántos niveles tiene.
9. Escriba un método llamado _dtree_, que toma como sus argumentos una referencia al nodo raíz del árbol y el valor a borrarse.
   El método deberá localizar el nodo que contenga el valor a borrarse y si no lo encuentra deberá imprimir un mensaje para indicarlo. 
   Después de borrar un elemento, llame al método inorder para confirmar que la operación de borrado fue correctamente ejecutada.

## Guia 7 - Arbol Binario AVL
1. Implementar un Árbol Binario AVL con los métodos de rotación simple y doble
2. Reconstruir un árbol binario insertando los siguientes valores.
   6, 5, 10, 9, 14, 13, 12, 2, 8, 3, 11, 7, 4,16,1,15.
   Muestre el valor de balanceo mas alejado de 0 del árbol.
   Reconstruya con los mismos valores un árbol AVL y muestre el valor de balanceo mas alejado de 0.
3. En el árbol anterior inserte el valor 0 y repita el análisis de balanceo.
4. En el árbol anterior elimine el valor 5 y repita el análisis de balanceo.

## Guia 8 - Tabla Hash
1. Dada una tabla de tamaño fijo 10 y la función Hash H(x) = X mod 10, implemente el método “esVacia” de modo que devuelva la expresión tamanyoActual == 0.
2. Con un arreglo de un solo subíndice resuelva el siguiente problema. Lea desde el teclado 20 números entre 10 y 100, inclusive. A medida que se lea cada número, imprímalo solo si no es un duplicado de algún número ya leído.
   Tome en cuenta el caso más desfavorable, cuando todos los números son diferentes. Resuelva este problema empleando el arreglo más pequeño posible.
3. Genere una tabla hash de tamaño fijo 10 y la función hash H(x) = X mod 10 con la siguiente secuencia de enteros: 
   5, 10, 15, 20, 25, 30. Resuelva las posibles colisiones con hashing enlazado.
4. Escribir un método eliminar que borre un elemento de la tabla hash del problema anterior.