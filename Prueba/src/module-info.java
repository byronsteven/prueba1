/**
 * 
 */
/**
 * @author Byron
 *
 */
module Prueba {
	System.out.println("Datos de la Matriz A:");
	for(int i=0;i<filas;i++){
	        for(int j=0;j<columnas;j++){
	                System.out.print("Ingrese un valor para la posicion A["+i+"]["+j+"]: ");
	                ma=leer.nextInt();
		matrizA=ma;
	                System.out.print(matrizA[i][j]+" ");
	    }
	        System.out.println();
	    }
	    for (int i=0; i < matrizA.length; i++) {
	    System.out.print();
	    for (int j=0; j < matrizA[i].length; j++) {
	      System.out.print (matrizA[i][j]);
	      if (j!=matrizA[i].length-1) System.out.print("\t");
	    }
	    System.out.println();
	    }

	System.out.println("Datos de la Matriz B:");
	for(int i=0;i<filas;i++){
	        for(int j=0;j<columnas;j++){
	                System.out.print("Ingrese un valor para la posicion A["+i+"]["+j+"]: ");
	                mb=leer.nextInt();
		matrizB=mb;
	                System.out.print(matrizB[i][j]+" ");
	        }
	        System.out.println();
	    }
	    for (int i=0; i < matrizB.length; i++) {    
	    System.out.print();
	    for (int j=0; j < matrizB[i].length; j++) {
	      System.out.print (matrizB[i][j]);
	      if (j!=matrizB[i].length-1) System.out.print("\t");
	    }
	    System.out.println();
	    }

	System.out.println("Suma de las dos matrices:");
	for(int i=0;i<filas;i++){
	    System.out.print();
	        for(int j=0;j<columnas;j++){
	                matrizRes1[i][j]=matrizA[i][j]+matrizB[i][j];                            
	                System.out.print(matrizRes1[i][j]+" ");
	        }
	        System.out.println();
	}
}