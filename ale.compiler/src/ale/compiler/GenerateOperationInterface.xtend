package ale.compiler

import fr.inria.diverse.objectalgebragenerator.GenerateAlgebra
import java.io.FileWriter
import java.io.IOException
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import ale.xtext.ale.AleClass
import java.util.List
import ale.xtext.ale.Root

class GenerateOperationInterface {

	def generate(EClass clazz, IProject project, AleClass behavior, EPackage ePackage, List<EPackage> dependencies, List<AleClass> allAleClasses, List<AleClass> aleScope) {


		val packageName = clazz.EPackage.name
		val aleName = if (behavior !=null) (behavior.eContainer as Root).name else "$default"
		val fileContent = new GenerateAlgebra().generateOperation(clazz, behavior, ePackage, dependencies, allAleClasses, aleScope)

		val directoryAlgebra = project.getLocation().append("src").append(packageName).append(aleName).append("algebra").append(
			"operation");
		directoryAlgebra.toFile().mkdirs();
		
		val fileName = '''«packageName.toFirstUpper»«aleName.toFirstUpper»«clazz.name»Operation''';
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
