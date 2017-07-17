package br.projeto;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestPDF {
	public static void main(String args[]){
		System.out.println("Hi Testing");
		List employeeList = new ArrayList();
		//adiciona o caminho do template
		String templateFilePath ="C:/Users/Herivelton/workspace_eclipse_mars/GeneratorXSLtoPDF/src/";

		Employee e1= new Employee();
		e1.setName("Debasmita1 Sahoo");
		e1.setEmployeeId("10001");
		e1.setAddress("Pune");
		employeeList.add(e1);

		Employee e2= new Employee();
		e2.setName("Debasmita2 Sahoo");
		e2.setEmployeeId("10002");
		e2.setAddress("Test");
		employeeList.add(e2);

		Employee e3= new Employee();
		e3.setName("Debasmita3 Sahoo");
		e3.setEmployeeId("10003");
		e3.setAddress("Mumbai");
		employeeList.add(e3);

		Employee e4= new Employee();
		e4.setName("Debasmita3 Sahoo");
		e4.setEmployeeId("10003");
		e4.setAddress("Mumbai");
		employeeList.add(e4);
		
		Employee e5= new Employee();
		e5.setName("<b>Debasmita3 Sahoo </b>");
		e5.setEmployeeId("10003");
		e5.setAddress("Mumbai");
		employeeList.add(e5);
		
		Employee e6= new Employee();
		e6.setName("Debasmita3 Sahoo");
		e6.setEmployeeId("10003");
		e6.setAddress("Mumbai");
		employeeList.add(e6);
		
		Employee e7= new Employee();
		e7.setName("Debasmita3 Sahoo");
		e7.setEmployeeId("10003");
		e7.setAddress("Mumbai");
		employeeList.add(e7);
		
		EmployeeData data = new EmployeeData();
		data.setEemployeeList(employeeList);
		data.setCodigoHTML("<b>TESTE C�DIGO HTML</b>");
		PDFHandler handler = new PDFHandler();

		try {
			ByteArrayOutputStream streamSource = handler.getXMLSource(data);

			handler.createPDFFile(streamSource,templateFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}