public static void selectionSort(int[] x) {
        for (int i = 0; i < x.length - 1; i++) { //Man benötigt genau x.length -1 Durchläufe
            int minIndex = i;      // Index des momentanen kleinsten Wertes
            for (int j = i + 1; j < x.length; j++) { //Index wird um eins erhöht, wenn die Zahl an dem Index kleiner ist, als die Größe des Arrays erhöhe weiter,sodass er alle Zahlen durchgeht
                if (x[minIndex] > x[j]) { //Falls  das momentane Minimum kleiner ist als die Zahl am Index j
                    minIndex = j;  //Dann Speichere den Index des neuen minimalen Wertes
                }
            }
            if (minIndex != i) { //Falls der Index des minmalen Wertes nicht dem alten entspricht, also wenn ein neues Maximum gefunden wurde, dann
                //Tausche den Wert mit dem kleinsten verfügbaren Wert per Dreieckstausch
                int temp = x[i];
                x[i] = x[minIndex];
                x[minIndex] = temp;
            }
        }
    }