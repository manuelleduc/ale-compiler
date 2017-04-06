package ale.compiler;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;

final class NullMonitorImplementation implements Monitor {
	/**
	 * 
	 */
	private final AleCompiler NullMonitorImplementation;

	/**
	 * @param compiler
	 */
	NullMonitorImplementation(AleCompiler compiler) {
		NullMonitorImplementation = compiler;
	}

	@Override
	public void worked(int work) {
	}

	@Override
	public void subTask(String name) {
	}

	@Override
	public void setTaskName(String name) {
	}

	@Override
	public void setCanceled(boolean value) {
	}

	@Override
	public void setBlocked(Diagnostic reason) {
	}

	@Override
	public boolean isCanceled() {
		return false;
	}

	@Override
	public void internalWorked(double work) {
	}

	@Override
	public void done() {
	}

	@Override
	public void clearBlocked() {
	}

	@Override
	public void beginTask(String name, int totalWork) {

	}
}