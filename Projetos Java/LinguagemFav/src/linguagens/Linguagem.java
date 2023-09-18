package linguagens;

	public class Linguagem {
		private String name;
		private int anoCriacao;
		private String IDE;
		
		
		public Linguagem(String name, int anoCriacao, String IDE) {
			this.name = name;
			this.anoCriacao = anoCriacao;
			this.IDE = IDE;
			
		}



		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Linguagem [name=" + name + ", anoCriacao=" + anoCriacao + ", IDE=" + IDE + "]";
		}


		public int getAnoCriacao() {
			return anoCriacao;
		}


		public String getIDE() {
			return IDE;
		}

		
		
	}
	
	
	
	

	
		
	
