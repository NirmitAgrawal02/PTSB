/**
 * SER-515 Meat Product Menu responsible for bridge and factory patterns
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */

public class MeatProductMenu implements ProductMenu {

	public void showMenu() {

	}

	@Override
	public void showAddButton() {
		System.out.println();
	}
	@Override
	public void showViewButton() {
		System.out.println();

	}
	@Override
	public void showRadioButton() {
		System.out.println();

	}
	@Override
	public void showLabels() {
		System.out.println();

	}
	@Override
	public void showComboxes() {
		System.out.println();

	}
	public void selectProduct(int UserType)
	{
		System.out.println("Bridge Pattern for connection used");
		System.out.println("Meat Products Selected ....");
		Person person;
		if(UserType == 0)
		{
			person = personFactory.createObject("Buyer");
		}
		else
		{
			person = personFactory.createObject("Seller");
		}
		person.showMenu();
	}

}
