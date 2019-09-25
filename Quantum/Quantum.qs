namespace ICS.Quantum{
	open Microsoft.Quantum.Intrinsic;
	open Microsoft.Quantum.Canon;
    open Microsoft.Quantum.Math;
    open Microsoft.Quantum.Diagnostics;
	open Microsoft.Quantum.Measurement;
	open Microsoft.Quantum.Samples;
	
	
	operation HelloWorld(): Unit{
		Message("Hello, World!");
	}
	
	operation Hello(name: String): Unit{
		Message($"Hello, {name}"); // print("Hello, {}" .format(name))
	}
	
	operation HelloSeward(): Unit{
		Hello("Mr. Seward");
	}
	
	operation QubitPlay(): Unit{
		mutable count = 0;
		let maxCount = 10;
		
		using(qs = Qubit[maxCount]){
			for (i in 1 .. maxCount){
			
				X(qs[i - 1]);
				H(qs[i - 1]); //turns into a fifty/fifty chance of 0 and 1 
					
				if (M(qs[i - 1]) == Zero){
					//Message("It was zero!");
				} 
				else{ 
					//Message("It was one!");
						set count += 1;
				}
				// elif
			}
			ResetAll(qs);
		}
		Message($"There were {maxCount - count} zeros and {count} ones");	
	}
	
	operation Entangle(): Unit{
		let maxCount = 1000;
		mutable q0zeros = 0;
		mutable q1zeros = 0;
		mutable agree = 0;
		
		for(i in 1 ... maxCount){
			using(qs = Qubit[2]){
				H(qs[0]); 
				CNOT(qs[0], qs[1]);
				let r0 = M(qs[0]);
				let r1 = M(qs[1]);
				
				if (r0 == Zero){
					set q0Zeros += 1;
				}
				if (r1 == Zero){
					set q1Zeros += 1;
				}
				if (r0 == r1){
					set agree += 1;
				}
			ResetAll(qs)
			}
		}
		Message($"q0 was zero {q0zero}")
	}
}



