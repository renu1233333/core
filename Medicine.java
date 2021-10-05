class Medicine{
public static void main(String[] med)
{
	float price=Float.parseFloat(med[2]);
	int quantity=Integer.parseInt(med[3]);
float total=MedicineDetails.getDetailsByMedicine(med[0],med[1],price,quantity);

System.out.println(total);
total=MedicineDetails.getDetailsByMedicine("L-Hist Total Tablet","Alkem Laboratories",price=12.2f,quantity=2);
System.out.println(total);
total=MedicineDetails.getDetailsByMedicine("Pacimol 500","lpca Laboratories",price=13.2f,quantity=7);
System.out.println(total);


}}