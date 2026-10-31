package BusHasMap;

import java.util.Scanner;

public class Metodos {
    
    public static void Ordenamiento(){
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        
        while(opc!= 21){
            System.out.println("1.- Quick Sort.");
            System.out.println("2.- Radix Sort.");
            System.out.println("3.- Mezcla Natural.");
            System.out.println("4.- Merge Sort Direct.");
            System.out.println("5.- Bitonic Sort.");
            System.out.println("6.- Cocktail Sort.");
            System.out.println("7.- Comb Sort.");
            System.out.println("8.- Intercalacion.");
            System.out.println("9.- Gnome Sort.");
            System.out.println("10.- Bubble Sort.");
            System.out.println("11.- Bucket Sort.");
            System.out.println("12.- Heap Sort");
            System.out.println("13.- Merge Sort");
            System.out.println("14.- Pigeonhole Sort");
            System.out.println("15.- Shell Sort");
            System.out.println("16.- Tim Sort");
            System.out.println("17.- Cycle Sort");
            System.out.println("18.- Selection Sort");
            System.out.println("19.- Counting Sort");
            System.out.println("20.- Insertion Sort.");
            System.out.println("21.- Volver.");
            opc= cs.nextByte();
            switch(opc){
                case 1:
                    QuickSort.quicksort(Lector.LeerTxt());
                break;
                case 2:
                    RadixSort.RadixSort(Lector.LeerTxt());
                break;
                case 3:
                    MezclaNatural.MezclaNatural(Lector.LeerTxt());
                break;
                case 4:
                    MergeSortDirect.MergeSorDirect(Lector.LeerTxt());
                break;
                case 5:
                    BitonicSort.BitonicSort(Lector.LeerTxt());
                break;
                case 6:
                    CocktailSort.CoctailSort(Lector.LeerTxt());
                break;
                case 7:
                    CombSort.CombSort(Lector.LeerTxt());
                break;
                case 8:
                    Intercalacion.Intercalacion(Lector.LeerTxt());
                break;
                case 9:
                    GnomeSort.GnomeSort(Lector.LeerTxt());
                break;
                case 10:
                    BubbleSort.BubbleSort(Lector.LeerTxt());
                break;
                case 11:
                    BucketSort.BucketSort(Lector.LeerTxt());
                break;
                case 12:
                    HeapSort.HeapSort(Lector.LeerTxt());
                break;
                case 13:
                    MergeSort.MergeSort(Lector.LeerTxt());
                break;
                case 14:
                    PigeonholeSort.PigeonholeSort(Lector.LeerTxt());
                break;
                case 15:
                    ShellSort.ShellSort(Lector.LeerTxt());
                break;
                case 16:
                    Timsort.TimSort(Lector.LeerTxt());
                break;
                case 17:
                    CycleSort.CycleSort(Lector.LeerTxt());
                break;
                case 18:
                    SelectionSort.SelectionSort(Lector.LeerTxt());
                break;
                case 19:
                    CountingSort.CountingSort(Lector.LeerTxt());
                break;
                case 20:
                    InsertionSort.InsertionSort(Lector.LeerTxt());
                break;
                case 21:
                    System.out.println("Volviste...");
                    break;
                default:
                    System.err.println("Opcion No Valida");
            }
        }
        
    }
    
}
