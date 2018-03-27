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

	public int getOrderListId(){
		return orderListId;
	}
	public void setOrderListId(int orderListId){
		this.orderListId = orderListId;
	}

	public int calculate() {
		id++;
		id--;
		return id--;
	}
	public int syncroId() {
		return id + 4;
	}
	
	public void pr() {
		name = "go";
	}
	public void ar(){
		
	}
	

}