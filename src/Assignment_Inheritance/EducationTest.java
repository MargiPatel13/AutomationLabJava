package Assignment_Inheritance;

public class EducationTest {

	public static void main(String[] args) {
		
		Seneca senaca = new Seneca();
		Sheridan sheridan = new Sheridan();
		Conestoga conest = new Conestoga();
		
		CMEC cmec = new CMEC();
		University uni = new University();
		College college = new College();
		
		//subclass level4
		senaca.engineering(); //overridden 
		senaca.computerScienceEngineering(); //individual
		senaca.dataScienceAnalytics(); //individual
		senaca.chemistry(); //inherited-GGP
		senaca.phd(); //inherited- GP
		senaca.machineLearning(); //inherited - p
		Seneca.businessInformationTechnology(); //static by classname
		senaca.aviation(); // inhe-final-P
		
		sheridan.engineering(); // overridden
		sheridan.mechanicalEngineering(); //individual
		sheridan.fireProtectionEngineering();
		Sheridan.businessInformationTechnology(); // static by classname

		conest.engineering(); //inherited
		conest.cyberSecurity();
		conest.engineering();
		conest.humanResourcesManagement();
		
		//superclass level1
		cmec.chemistry(); 
		//cmec.commerce(); //private
		CMEC.mathematics(); //Static
		cmec.bioMedical();
		
		//superclass level2
		University.pharmacy();  //static
		uni.bioMedical(); //overridden
		uni.chemistry(); //inherited 
		uni.mbbs(); 	//individual
		
		//superclass level3
		college.aviation(); //Final
		college.engineering(); //override
		college.machineLearning(); //individual
		college.mbbs(); 	//inherited
		College.businessInformationTechnology(); //static 
		
		//Top Casting
		College col = new Seneca();
		col.engineering();
		col.machineLearning();
		
		University uni1 = new Sheridan();
		uni1.bioMedical();
		uni1.laws();
		
		CMEC cmec1 = new Conestoga();
		cmec1.chemistry();
		cmec1.physics();
		
		//Down Casting
//		Seneca sen1 = (Seneca) new College();
//		sen1.aviation();
//		sen1.machineLearning();
		
		//Sheridan sh1 = (Sheridan) new University();
		//sh1.bioMedical();
		//sh1.engineering();
		//sh1.mbbs();
		
//		Conestoga con1 = (Conestoga) new CMEC();
//		con1.chemistry();
//		con1.cyberSecurity();
	}

}
