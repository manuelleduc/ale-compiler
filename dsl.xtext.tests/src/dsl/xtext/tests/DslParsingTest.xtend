/*
 * generated by Xtext 2.10.0
 */
package dsl.xtext.tests

import com.google.inject.Inject
import dsl.xtext.dsl.DSL
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(DslInjectorProvider)
class DslParsingTest{

	@Inject
	ParseHelper<DSL> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
