public class Order {
	
	private int id;
	private String name;
	private int orderListId;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public int getName(){
		return name;
	}
	public void setName(int name){
		this.name = name;
	}

	public int calc() {
		return id++;
	}
	public int syncroId() {
		return id + 5;
	}
	public void pr(){
	}

}