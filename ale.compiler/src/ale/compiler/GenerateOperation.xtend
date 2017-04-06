package ale.compiler

import ale.xtext.ale.Class
import fr.inria.diverse.objectalgebragenerator.GenerateAlgebra
import java.io.FileWriter
import java.io.IOException
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class GenerateOperation {

	def generate(EClass clazz, IProject project, String dslName, Class behavior, EPackage ePackage) {

		val fileContent = new GenerateAlgebra().generateOperation(clazz,  dslName, behavior, ePackage)

		val directoryAlgebra = project.getLocation().append("src").append(dslName).append("algebra").append(
			"operation").append(clazz.EPackage.name);
		directoryAlgebra.toFile().mkdirs();
		
		val fileName = dslName.toFirstUpper + clazz.name.toFirstUpper+"Operation";
		val fileJavaAlgebra = directoryAlgebra.append(fileName).addFileExtension("java");

		try {
			val FileWriter fileWriter = new FileWriter(fileJavaAlgebra.toFile());
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
