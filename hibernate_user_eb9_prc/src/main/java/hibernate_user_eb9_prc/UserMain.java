package hibernate_user_eb9_prc;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean flag = true;

		User user = new User();

		UserCRUD crud = new UserCRUD();

		do {
			System.out.println("Enter the choice \n 1.Signup user \n 2.Login user \n 3.Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("Enter the name");
				String name = scanner.next();
				System.out.println("Enter the email");
				String email = scanner.next();
				System.out.println("Enter the password");
				String password = scanner.next();
				System.out.println("Enter the address");
				String address = scanner.next();

				user.setId(id);
				user.setName(name);
				user.setEmail(email);
				user.setPassword(password);
				user.setAddress(address);

				crud.signupUser(user);
			}
				break;

			case 2: {
				System.out.println("Enter the email");
				String email = scanner.next();
				System.out.println("Enter the password");
				String password = scanner.next();

				boolean result = crud.loginUser(email, password);
				if (result == true) {
					System.out.println("Logged in successful");
					int choice1;
					boolean flag1 = true;
					do {
						System.out.println(
								"Enter the choice \n 1.Display Passwords \n 2.Update Facebook password \n 3.Update Instagram password \n 4.Update Snapchat password \n 5.Update Whatsapp password \n 6.Update Twitter password \n 7.Exit");
						choice1 = scanner.nextInt();
						switch (choice1) {
						case 1: {
							crud.displayPasswords(email);
						}
							break;

						case 2: {
							System.out.println("Enter the facebook password");
							String facebook = scanner.next();

							crud.facebookUser(email, facebook);
						}
							break;

						case 3: {
							System.out.println("Enter the instagram password");
							String instagram = scanner.next();

							crud.instagramUser(email, instagram);
						}
							break;

						case 4: {
							System.out.println("Enter the snapchat password");
							String snapchat = scanner.next();

							crud.snapchatUser(email, snapchat);
						}
							break;

						case 5: {
							System.out.println("Enter the whatsapp password");
							String whatsapp = scanner.next();

							crud.whatsappUser(email, whatsapp);
						}
							break;

						case 6: {
							System.out.println("Enter the twitter password");
							String twitter = scanner.next();

							crud.twitterUser(email, twitter);
						}
							break;
						default:
							flag1 = false;
						}
					} while (flag1);

				} else {
					System.out.println("Invalid password");
				}
			}
				break;

			default:
				flag = false;
			}

		} while (flag);

	}

}
