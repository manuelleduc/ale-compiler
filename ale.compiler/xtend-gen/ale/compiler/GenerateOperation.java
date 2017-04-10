package ale.compiler;

import ale.xtext.ale.AleClass;
import fr.inria.diverse.objectalgebragenerator.GenerateAlgebra;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateOperation {
  public void generate(final EClass clazz, final IProject project, final String dslName, final AleClass behavior, final EPackage ePackage, final List<EPackage> dependencies) {
    GenerateAlgebra _generateAlgebra = new GenerateAlgebra();
    final String fileContent = _generateAlgebra.generateOperation(clazz, dslName, behavior, ePackage, dependencies);
    IPath _location = project.getLocation();
    IPath _append = _location.append("src");
    IPath _append_1 = _append.append(dslName);
    IPath _append_2 = _append_1.append("algebra");
    IPath _append_3 = _append_2.append(
      "operation");
    EPackage _ePackage = clazz.getEPackage();
    String _name = _ePackage.getName();
    final IPath directoryAlgebra = _append_3.append(_name);
    File _file = directoryAlgebra.toFile();
    _file.mkdirs();
    String _firstUpper = StringExtensions.toFirstUpper(dslName);
    String _name_1 = clazz.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    String _plus = (_firstUpper + _firstUpper_1);
    final String fileName = (_plus + "Operation");
    IPath _append_4 = directoryAlgebra.append(fileName);
    final IPath fileJavaAlgebra = _append_4.addFileExtension("java");
    try {
      File _file_1 = fileJavaAlgebra.toFile();
      final FileWriter fileWriter = new FileWriter(_file_1);
      fileWriter.write(fileContent);
      fileWriter.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
