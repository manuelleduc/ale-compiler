package ale.compiler;

import ale.xtext.ale.AleClass;
import ale.xtext.ale.Root;
import com.google.common.base.Objects;
import fr.inria.diverse.objectalgebragenerator.GenerateAlgebra;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateOperationInterface {
  public void generate(final EClass clazz, final IProject project, final AleClass behavior, final EPackage ePackage, final List<EPackage> dependencies, final List<AleClass> allAleClasses, final List<AleClass> aleScope) {
    EPackage _ePackage = clazz.getEPackage();
    final String packageName = _ePackage.getName();
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(behavior, null));
    if (_notEquals) {
      EObject _eContainer = behavior.eContainer();
      _xifexpression = ((Root) _eContainer).getName();
    } else {
      _xifexpression = "$default";
    }
    final String aleName = _xifexpression;
    GenerateAlgebra _generateAlgebra = new GenerateAlgebra();
    final String fileContent = _generateAlgebra.generateOperation(clazz, behavior, ePackage, dependencies, allAleClasses, aleScope);
    IPath _location = project.getLocation();
    IPath _append = _location.append("src");
    IPath _append_1 = _append.append(packageName);
    IPath _append_2 = _append_1.append(aleName);
    IPath _append_3 = _append_2.append("algebra");
    final IPath directoryAlgebra = _append_3.append(
      "operation");
    File _file = directoryAlgebra.toFile();
    _file.mkdirs();
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(packageName);
    _builder.append(_firstUpper, "");
    String _firstUpper_1 = StringExtensions.toFirstUpper(aleName);
    _builder.append(_firstUpper_1, "");
    String _name = clazz.getName();
    _builder.append(_name, "");
    _builder.append("Operation");
    final String fileName = _builder.toString();
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
