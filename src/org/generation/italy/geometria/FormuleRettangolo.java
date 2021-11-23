package org.generation.italy.geometria;


class FormuleRettangolo {
	FormuleRettangolo(){
		
	}
		int base;
		int altezza;
		
		void Area() {
			System.out.println("Area: "+base*altezza);
		}
		void Perimetro() {
			System.out.println("Perimetro: "+(base+altezza)*2);
		}
		
		FormuleRettangolo(int b, int a){
			
			this.base=b;
			this.altezza=a;
			
		}
		
}
