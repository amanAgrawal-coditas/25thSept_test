package Test5_23rdSeptember;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuDriven
{

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            Scanner sc=new Scanner(System.in);
            boolean loop=true;
            int choice;
            JDBCTest jdbcTest=new JDBCTest();
            while(loop)
            {
                System.out.println("Press 1 to create a table");
                System.out.println("Press 2 to insert a value");
                System.out.println("Press 3 to Update salary");
                System.out.println("Press 4 to delete");
                System.out.println("Press 5 to arrange it last name wise");
                System.out.println("Press 6 for specific display");
                System.out.println("press 7 to exit");
                choice=sc.nextInt();
              switch (choice)
              {
                  case 1:
                  {
                    jdbcTest.create();
                    break;
                  }
                  case 2:
                  {
                      jdbcTest.insert();
                      break;
                  }
                  case 3:
                  {
                      jdbcTest.update();
                      break;
                  }
                  case 4:
                  {
                      jdbcTest.delete();
                      break;
                  }
                  case 5:
                  {
                     jdbcTest.SortByLastName();
                     break;
                  }
                  case 6:
                  {
                    jdbcTest.specificDisplay();
                  }
                  case 7:
                  {
                      System.exit(0);
                      break;
                  }
                  default:
                  {
                      System.out.println("enter a valid choice");
                  }
              }
            }

    }
}
