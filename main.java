import java.util.Scanner;
import java.lang.Math; 

public class Main{
	public static void main(String[] args){
		int x, y, q, w;
		double xSin, xCos, ySin, yCos, xTan, yTan, xAcos, yAcos;
		float sum;
		System.out.println("Calculator by tupzapi. Type: 'help', for more information.");
		while(true){
			Scanner UserInput = new Scanner(System.in);
			System.out.print("~> ");

			String UserOutput = UserInput.nextLine();
			// System.out.println(UserOutput); just4test lmao

			if(UserOutput.equals("+")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				q = xInput.nextInt();
				Scanner yInput = new Scanner(System.in);
				System.out.print("y: ");
				w = yInput.nextInt();
				sum = q + w;
				System.out.println("sum: " + sum + "\n");
			}
			else if(UserOutput.equals("-")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				q = xInput.nextInt();
				Scanner yInput = new Scanner(System.in);
				System.out.print("y: ");
				w = yInput.nextInt();
				sum = q - w;
				System.out.println("sum: " + sum + "\n");
			}
			else if(UserOutput.equals("*")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				q = xInput.nextInt();
				Scanner yInput = new Scanner(System.in);
				System.out.print("y: ");
				w = yInput.nextInt();
				sum = q * w;
				System.out.println("sum: " + sum + "\n");
			}
			else if(UserOutput.equals("/")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				q = xInput.nextInt();
				Scanner yInput = new Scanner(System.in);
				System.out.print("y: ");
				w = yInput.nextInt();
				sum = q / w;
				System.out.println("sum: " + sum + "\n");
			}
			else if(UserOutput.equals("sqrt")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				q = xInput.nextInt();
				System.out.println("sum: " + Math.sqrt(q) + "\n");
			}
			else if(UserOutput.equals("log")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				q = xInput.nextInt();
				Scanner yInput = new Scanner(System.in);
				System.out.print("y: ");
				w = xInput.nextInt();
				double o = Math.log(q);
				double p = Math.log(w);
				double SumLog = o / p;
				System.out.println(SumLog + "\n");
			}
			else if(UserOutput.equals("sin")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				ySin = xInput.nextInt();
				xSin = Math.toRadians(ySin);
				System.out.println(Math.sin(xSin));
			}
			else if(UserOutput.equals("cos")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				yCos = xInput.nextInt();
				xCos = Math.toRadians(yCos);
				System.out.println(Math.cos(xCos));
			}
			else if(UserOutput.equals("tan")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				yTan = xInput.nextInt();
				xTan = Math.toRadians(yTan);
				System.out.println(Math.tan(xTan));
			}
			else if(UserOutput.equals("acos")){
				Scanner xInput = new Scanner(System.in);
				System.out.print("x: ");
				yAcos = xInput.nextInt();
				xAcos = Math.toRadians(yAcos);
				System.out.println(Math.acos(xAcos));
			}
			else if(UserOutput.equals("exit")){
				break;
			}
			else if(UserOutput.equals("dis")){
				int aDis, bDis, cDis, DDis;
				double x1Dis, x2Dis, dSqrtDis;
				Scanner aInput = new Scanner(System.in);
				System.out.print("a: ");
				aDis = aInput.nextInt();
				Scanner bInput = new Scanner(System.in);
				System.out.print("b: ");
				bDis = bInput.nextInt();
				Scanner cInput = new Scanner(System.in);
				System.out.print("c: ");
				cDis = cInput.nextInt();
				DDis = (bDis * bDis) - 4 * aDis * cDis;
				System.out.println("D: " + DDis);
				dSqrtDis = Math.sqrt(DDis);
				x1Dis = ((-bDis + dSqrtDis) / (2 * aDis));
				x2Dis = ((-bDis - dSqrtDis) / (2 * aDis));
				System.out.println("x1 (+): " + x1Dis);
				System.out.println("x2 (-): " + x2Dis + "\n");
			}
			else if(UserOutput.equals("help")){
				System.out.println("+ - plus.\n- - minus.\n* - multiplication.\n/ - division.\nsqrt - square root.\nlog - logarithm\nsin - sine.\ncos - cosine.\ntan - tangents.\nacos - acosine.\ndis - discriminant.\nhelp - all commands.\n");
			}
			else{
				System.out.println("incorrect command!\n");
			}
		}
	}
}
