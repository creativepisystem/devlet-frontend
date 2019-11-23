package devlet;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Teste {

	public static void main(String[] args) {
		metodo();
	}
	public static void metodo() {
		RestTemplate rest = new RestTemplate();
		
		Adress response = rest.getForObject("https://viacep.com.br/ws/13336200/json/", Adress.class);
		System.out.println(response);
				
	}
	@JsonIgnoreProperties(ignoreUnknown = true)
	public class Adress{
		private String cep;
		private String logradouro;
		private String complemento;
		private String bairro;
		private String localidade;
		private String uf;
		private String ibge;
		private String gia;
		
		public Adress() {
			super();
		}
		public Adress(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
				String ibge, String gia) {
			super();
			this.cep = cep;
			this.logradouro = logradouro;
			this.complemento = complemento;
			this.bairro = bairro;
			this.localidade = localidade;
			this.uf = uf;
			this.ibge = ibge;
			this.gia = gia;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getLogradouro() {
			return logradouro;
		}
		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getLocalidade() {
			return localidade;
		}
		public void setLocalidade(String localidade) {
			this.localidade = localidade;
		}
		public String getUf() {
			return uf;
		}
		public void setUf(String uf) {
			this.uf = uf;
		}
		public String getIbge() {
			return ibge;
		}
		public void setIbge(String ibge) {
			this.ibge = ibge;
		}
		public String getGia() {
			return gia;
		}
		public void setGia(String gia) {
			this.gia = gia;
		}
		@Override
		public String toString() {
			return "Adress [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
					+ bairro + ", localidade=" + localidade + ", uf=" + uf + ", ibge=" + ibge + ", gia=" + gia + "]";
		}
	}
	
}
