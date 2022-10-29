import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    public class Keyboard {
        public int product_ID(int pro_id){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter The Product ID:");
            pro_id = scan.nextInt();
            return pro_id;
        }

        public void FileCheck () throws FileNotFoundException {
            int a = 0;
            a = product_ID(123);
            System.out.println("The Product Id Entered is: "+a);
            System.out.println("PLease find the Product and it's Price listed next to the Product_ID");
            String line;
            if (a == 12128) {
                FileReader rd = new FileReader("C:\\Users\\patel\\Desktop\\Software Design and Architech\\Class.Exercise.3\\Product_Price.txt");
                Scanner myReader = new Scanner(rd);
                try (BufferedReader br = new BufferedReader(rd)) {
                    for (int i = 0; i < 0; i++)
                        br.readLine();
                    line = br.readLine();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
            if (a == 12345) {
                FileReader rd = new FileReader("C:\\Users\\patel\\Desktop\\Software Design and Architech\\Class.Exercise.3\\Product_Price.txt");
                Scanner myReader = new Scanner(rd);
                try (BufferedReader br = new BufferedReader(rd)) {
                    for (int i = 0; i < 1; i++)
                        br.readLine();
                    line = br.readLine();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
            if (a == 22211) {
                FileReader rd = new FileReader("C:\\Users\\patel\\Desktop\\Software Design and Architech\\Class.Exercise.3\\Product_Price.txt");
                Scanner myReader = new Scanner(rd);
                try (BufferedReader br = new BufferedReader(rd)) {
                    for (int i = 0; i < 2; i++)
                        br.readLine();
                    line = br.readLine();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println("Error");
                }

            }
        }
    }

