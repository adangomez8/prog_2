package trabajo_practico_2_p3;

public class Main_gastos {

	public static void main(String[] args) {

		Impuesto imp1 = new Impuesto("imp1", 10);
		Impuesto imp2 = new Impuesto("imp2", 20);
		Impuesto imp3 = new Impuesto("imp3", 30);
		Impuesto imp4 = new Impuesto("imp4", 40);
		Impuesto imp5 = new Impuesto("imp5", 50);

		Gasto_publico gasto1 = new Gasto_publico("gasto1", 100);
		Gasto_publico gasto2 = new Gasto_publico("gasto2", 150);
		Gasto_publico gasto3 = new Gasto_publico("gasto3", 160);

		Ciudad ciudad1 = new Ciudad("ciudad 1");
		Ciudad ciudad2 = new Ciudad("ciudad 2");
		Ciudad ciudad3 = new Ciudad("ciudad 3");
		Ciudad ciudad4 = new Ciudad("ciudad 4");
		Ciudad ciudad5 = new Ciudad("ciudad 5");
		Ciudad ciudad6 = new Ciudad("ciudad 6");
		Ciudad ciudad7 = new Ciudad("ciudad 7");
		Ciudad ciudad8 = new Ciudad("ciudad 8");
		Ciudad ciudad9 = new Ciudad("ciudad 9");
		Ciudad ciudad10 = new Ciudad("ciudad 10");
		Ciudad ciudad11 = new Ciudad("ciudad 11");
		Ciudad ciudad12 = new Ciudad("ciudad 11");
		Ciudad ciudad13 = new Ciudad("ciudad 12");

		Provincia prov1 = new Provincia("provincia 1");
		Provincia prov2 = new Provincia("provincia 2");
		Provincia prov3 = new Provincia("provincia 3");

		Pais pais1 = new Pais("pais1");

		ciudad1.agregarImpuestoAciudad(imp1);
		ciudad1.agregarImpuestoAciudad(imp2);
		ciudad1.agregarImpuestoAciudad(imp3);
		ciudad1.agregarImpuestoAciudad(imp4);
		ciudad1.agregarImpuestoAciudad(imp5);
		ciudad1.agregarGastoAciudad(gasto1);

		ciudad2.agregarImpuestoAciudad(imp1);
		ciudad2.agregarImpuestoAciudad(imp2);
		ciudad2.agregarImpuestoAciudad(imp3);
		ciudad2.agregarImpuestoAciudad(imp4);
		ciudad2.agregarImpuestoAciudad(imp5);
		ciudad2.agregarGastoAciudad(gasto2);

		ciudad3.agregarImpuestoAciudad(imp1);
		ciudad3.agregarImpuestoAciudad(imp2);
		ciudad3.agregarImpuestoAciudad(imp3);
		ciudad3.agregarImpuestoAciudad(imp4);
		ciudad3.agregarImpuestoAciudad(imp5);
		ciudad3.agregarGastoAciudad(gasto3);

		ciudad4.agregarImpuestoAciudad(imp1);
		ciudad4.agregarImpuestoAciudad(imp2);
		ciudad4.agregarImpuestoAciudad(imp3);
		ciudad4.agregarImpuestoAciudad(imp4);
		ciudad4.agregarImpuestoAciudad(imp5);
		ciudad4.agregarGastoAciudad(gasto3);

		ciudad5.agregarImpuestoAciudad(imp1);
		ciudad5.agregarImpuestoAciudad(imp2);
		ciudad5.agregarImpuestoAciudad(imp3);
		ciudad5.agregarImpuestoAciudad(imp4);
		ciudad5.agregarImpuestoAciudad(imp5);
		ciudad5.agregarGastoAciudad(gasto3);

		ciudad6.agregarImpuestoAciudad(imp1);
		ciudad6.agregarImpuestoAciudad(imp2);
		ciudad6.agregarImpuestoAciudad(imp3);
		ciudad6.agregarImpuestoAciudad(imp4);
		ciudad6.agregarImpuestoAciudad(imp5);
		ciudad6.agregarGastoAciudad(gasto3);

		ciudad7.agregarImpuestoAciudad(imp1);
		ciudad7.agregarImpuestoAciudad(imp2);
		ciudad7.agregarImpuestoAciudad(imp3);
		ciudad7.agregarImpuestoAciudad(imp4);
		ciudad7.agregarImpuestoAciudad(imp5);
		ciudad7.agregarGastoAciudad(gasto1);

		ciudad8.agregarImpuestoAciudad(imp1);
		ciudad8.agregarImpuestoAciudad(imp2);
		ciudad8.agregarImpuestoAciudad(imp3);
		ciudad8.agregarImpuestoAciudad(imp4);
		ciudad8.agregarImpuestoAciudad(imp5);
		ciudad8.agregarGastoAciudad(gasto1);

		prov1.agregarCiudadApais(ciudad1);
		prov1.agregarCiudadApais(ciudad2);
		prov1.agregarCiudadApais(ciudad3);
		prov1.agregarCiudadApais(ciudad4);
		prov1.agregarCiudadApais(ciudad5);

		prov2.agregarCiudadApais(ciudad6);

		prov3.agregarCiudadApais(ciudad7);
		prov3.agregarCiudadApais(ciudad8);

		pais1.agregarProvinciaApais(prov1);
		pais1.agregarProvinciaApais(prov2);
		pais1.agregarProvinciaApais(prov3);

		// GASTOS REALIZADOS
		System.out.println("Gastos realizados en " + ciudad1.getNombre());
		System.out.println(ciudad1.getGastos());

		// CIUDADES EN DEFICIT
		System.out.println("Ciudades en deficit en " + prov1.getNombre());
		System.out.println(prov1.getCiudadesEnDeficil());

		// PROVINCIAS CON MAS DE LA MITAD DE CIUDADES EN DEFICIT
		System.out.println("Provincias con mas de la mitad de las ciudades en deficit en " + pais1.getNombre());
		System.out.println(pais1.getProvinciasConMasDeLaMitadCiudadesEnDeficil());

	}

}
