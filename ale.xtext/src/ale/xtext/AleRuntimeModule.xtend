/*
 * generated by Xtext 2.10.0
 */
package ale.xtext

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class AleRuntimeModule extends AbstractAleRuntimeModule {
	
	public def Class<? extends AleType> bindAleType() {
		return typeof(AleType)
	}
}