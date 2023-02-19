package program;


interface Operation_RDBMS{
	
	void insertData();
	void updateData();
	void deleteData();
	void showData();
	
}


class Implimentor implements Operation_RDBMS
{

	@Override
	public void insertData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		
	}
	
	
}
	
	class Developer1 extends Implimentor
	{
		
		
		@Override
		public void insertData() {
			System.out.println("insert data ");
		}
		
		public void updateData() {
			System.out.println("update data ");
		}
	}
	
	class Developer2 extends Implimentor
	{
		public void deleteData() {
			System.out.println("delete data ");
		}
		
		public void showData() {
			System.out.println("show data ");
		}
		
		
	}

public class ProgramingByContract {

	public static void main(String[] args) {
		Developer1 dev1 = new Developer1();
		System.out.println("==="+dev1);
		dev1.updateData();
		dev1.insertData();
		
		Developer2 dev2 = new Developer2();
		System.out.println("----"+dev2);
		dev2.deleteData();
		dev2.showData();

	}

}
