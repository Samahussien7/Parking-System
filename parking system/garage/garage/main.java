package garage ;
import java.util.Scanner;

public class main {


    public static void  main(String[] args) {

        // TODO Auto-generated method stub

        Scanner x = new Scanner(System.in);

        GarageMangement gdetails = new GarageMangement();
        int ii = 0;
        Owner oobj = new Owner();

        System.out.println("Enter the number of slots");
        int numslot = x.nextInt();
        gdetails.setNumOfSlots(numslot);

        System.out.println("Enter the information of each slot");
        gdetails.enterDetails();
        System.out.println("enter 0 if you want to end the program any num otherwise");
        while(true){
            int num = x.nextInt();
            if(num==0){break;}

                Driver dobj = new Driver();
                System.out.println("Enter Your Name");
                String name = x.next();

                System.out.println("Enter Your Phone Number");
                int phone = x.nextInt();
                dobj.enter_info(name, phone);
                System.out.println("Enter the number to select the type of vehicle Car=1 or Motorcycle=2 or Truck=3");
                int type = x.nextInt();
                System.out.println("Enter the vehicle information");

                System.out.println("Enter The name of the vehicle");
                String Mname = x.next();

                System.out.println("Enter The ID of the vehicle");
                int id = x.nextInt();


                System.out.println("Enter The Model year of the vehicle");
                int mYear = x.nextInt();


                System.out.println("Enter The width of the vehicle");
                int widt = x.nextInt();
                System.out.println("Enter The lenth of the vehicle");
                int len = x.nextInt();

                System.out.println("Enter The configration First serve=1,best fit=2");
                int c = x.nextInt();


                if (type == 1) {
                    Car objveh = new Car(Mname, id, mYear, len, widt);
                    ii = gdetails.pickSuitable(objveh, c);
                    if (ii != -1) {
                        System.out.println("suit id " + ii);
                    }

                } else if (type == 2) {
                    Motorcycle objveh = new Motorcycle(Mname, id, mYear, len, widt);
                    ii = gdetails.pickSuitable(objveh, c);
                    if (ii != -1) {
                        System.out.println("suit id " + ii);
                    }

                } else if (type == 3) {
                    Truck objveh = new Truck(Mname, id, mYear, len, widt);
                    ii = gdetails.pickSuitable(objveh, c);
                    if (ii != -1) {
                        System.out.println("suit id " + ii);
                    }

                }
                Parkin pobj = new Parkin();
                Parkout bobj = new Parkout();
                System.out.println("Click Park-in button=1,Park-out=2,-1 to exit");
                if (ii != -1) {
                    while (true) {
                        int nu = x.nextInt();
                        if (nu == 1) {
                            pobj.markArrival();
                        }
                        if (nu == 2) {
                            bobj.markDepature(gdetails);
                            System.out.println("the Fees is " + bobj.calFees(pobj));
                            break;
                        }
                        if (nu == -1) {
                            break;
                        }

                    }
                }
                System.out.println("Total Number Of Vehicle=1,Display Available=2,Total Income =3,Enter -1 to Exit");
                GarageData ggobj = new GarageData();
                while (true) {
                    int nu = x.nextInt();
                    if (nu == 1) {
                        System.out.println(ggobj.NumOfV(pobj));
                    }
                    if (nu == 2) {
                        oobj.DisplayAvailableSlot(gdetails);
                    }
                    if (nu == 3) {
                        System.out.println(ggobj.TotalIncome(bobj));
                    }
                    if (nu == -1) {
                        break;
                    }
                }
            System.out.println("enter 0 if you want to end the program any num otherwise");

            }

    }


    }


