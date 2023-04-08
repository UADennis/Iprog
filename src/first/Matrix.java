package first;
/**
 *Aufgabe MATRIX:
 *
 * Definieren Sie eine Klasse Matrix für m  n-Matrizen von reellen Zahlen (double)
 * und testen Sie sie:
 * 1. Der Konstruktor Matrix (int m, int n) soll ein zweidimensionales mn
 * Matrix-Objekt (mit m Zeilen mit Indices (Nummern) von 1 bis m, und n Spalten mit
 * Indices von 1 bis n) mit Einträgen 0.0 initialisieren.
 * (Weitere Konstruktoren sind sinnvoll.)
 * 2. Mit toString() soll jede Matrix eine String-Darstellung von sich selbst
 * liefern (als Returnwert zur späteren Ausgabe).
 * 3. Mit setValue (int i, int j, double x)
 * soll der Eintrag an Position (i,j) auf den Wert x gesetzt werden.
 * 4. Mit getValue (int i, int j)
 * soll der Eintrag an Position (i,j) als Ergebnis geliefert werden.
 * 5. Mit add (Matrix other)
 * soll eine Matrix die Summe von sich selbst und dem Argument other als ReturnWert liefern, sofern das geht. (Eine mn-Matrix kann zu einer mn-Matrix addiert
 * werden.)
 * 6. Mit multiply (Matrix other)
 * soll eine Matrix das Produkt von sich selbst und dem Argument other als ReturnWert liefern, sofern das geht. (Eine mk-Matrix kann mit einer kn-Matrix
 * multipliziert werden.) [-> Matrix ]
 * Interaktive Programme (Java) Alois Heinz
 * 46
 * Übungsaufgaben (3  Abgabe)
 * 4. Testen Sie in der main-Methode Ihre Matrix-Klasse, indem Sie zuerst die Matrix
 * definieren. Anschließend sollen die ersten 20 Potenzen von M, also M1=M,
 * M2=MM, M3=MMM, ..., M20 jeweils berechnet und ausgegeben werden
 *
 * @author Olexander Cherniaiev, Dennis Mayer
 * @version 1, 14.11.2022
 **/

public class Matrix {
    private int m, n;
    private double[][] arr;

    public Matrix(int m, int n){
        this.m = m;
        this.n = n;
        arr = new double[m][n];
    }

    public Matrix(Matrix other){
        this.m = other.m;
        this.n = other.n;
        this.arr = other.arr;
    }

    public Matrix(double[][] arr){
        this.m = arr.length;
        this.n = arr[0].length;
        this.arr = arr;
    }
    public String toString(){
        String result = "";
        for(int i = 0; i < n; i++) {
            result += "[";
            for(int j = 0; j < m; j++){
                result += "\t" + arr[i][j] + ", ";
            }
            result +="]\n";
        }
        return result;
    }

    public void setValue(int i, int j, double x){
        arr[i][j] = x;
    }

    public double getValue(int i, int j){
        return arr[i][j];
    }

    public Matrix add(Matrix other){
        Matrix newMatrix = new Matrix(this.m, this.n);
        if(this.m != other.m || this.n != other.n){
            System.out.println("Error, m or n is not equals.");
        }
        else{
        for(int i = 0; i < newMatrix.m; i++)
            for(int j = 0; j < newMatrix.n; j++)
                newMatrix.arr[i][j] = this.arr[i][j] + other.arr[i][j];
        }
        return newMatrix;
    }

    public Matrix multiply(Matrix other){
        Matrix newMatrix = new Matrix(m,n);
        if(this.m != other.n || this.n != other.m){
            System.out.println("Error, m or n is not equals.");
        }
        else{
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    for(int k = 0; k < m; k++)
                        newMatrix.arr[i][j] += arr[i][k] * other.arr[k][j];
                }
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        double[][] arr1 = {{1,2}, {3,4}};
        double[][] arr2 = {{5,6}, {7,8}};

        Matrix matrix1 = new Matrix(arr1);
        Matrix matrix2 = new Matrix(arr2);
        Matrix matrix3 = new Matrix(2,2);
        System.out.println("Test getValue: " + matrix2.getValue(1, 0));
        matrix3.setValue(0, 0, 9);
        matrix3.setValue(0, 1, 10);
        matrix3.setValue(1, 0, 11);
        matrix3.setValue(1, 1, 12);
        matrix2 = matrix2.add(matrix1);
        matrix1 = matrix1.multiply(matrix3);
        System.out.println("Result of adding:\n" + matrix2.toString());
        System.out.println("Result of multiply:\n" + matrix1.toString());

        //Aufgabe 5
        double[][] arr4 = {
            {0,1,0,0,0,0},
            {0,0,1,0,0,0},
            {0,0,0,1,0,0},
            {0,0,0,0,1,0},
            {0,0,0,0,0,1},
            {1,0,-1,0,0,2}
        };
        Matrix matrix4 = new Matrix(arr4);
        System.out.println("Aufgabe 5: ");
        Matrix tempMatrix = new Matrix(matrix4);
        System.out.println(tempMatrix.toString());
        for(int i = 2; i < 21; i++){
            tempMatrix = tempMatrix.multiply(matrix4);
            System.out.println("M^" + i + "\n-------------------------\n" + tempMatrix.toString());
        }
    }
}
