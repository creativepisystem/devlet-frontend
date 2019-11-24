package devlet;

public class Mensagem {

	private String msg;

	public Mensagem() {
		super();
	}

	public Mensagem(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Mensagem [msg=" + msg + "]";
	}
	
}
