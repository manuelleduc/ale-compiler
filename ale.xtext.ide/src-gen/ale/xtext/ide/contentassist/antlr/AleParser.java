/*
 * generated by Xtext 2.10.0
 */
package ale.xtext.ide.contentassist.antlr;

import ale.xtext.ide.contentassist.antlr.internal.InternalAleParser;
import ale.xtext.services.AleGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class AleParser extends AbstractContentAssistParser {

	@Inject
	private AleGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAleParser createParser() {
		InternalAleParser result = new InternalAleParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
					put(grammarAccess.getConcreteMethodAccess().getAlternatives(), "rule__ConcreteMethod__Alternatives");
					put(grammarAccess.getAbstractMethodAccess().getAlternatives_2(), "rule__AbstractMethod__Alternatives_2");
					put(grammarAccess.getDefMethodAccess().getAlternatives_1(), "rule__DefMethod__Alternatives_1");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getLetStatementAccess().getBlockAlternatives_5_0(), "rule__LetStatement__BlockAlternatives_5_0");
					put(grammarAccess.getVarAssignAccess().getAlternatives(), "rule__VarAssign__Alternatives");
					put(grammarAccess.getBooleanOperationAccess().getAlternatives_1_0_0(), "rule__BooleanOperation__Alternatives_1_0_0");
					put(grammarAccess.getCompareOperationAccess().getAlternatives_1_0_0(), "rule__CompareOperation__Alternatives_1_0_0");
					put(grammarAccess.getMultOperationAccess().getAlternatives_1_0_0(), "rule__MultOperation__Alternatives_1_0_0");
					put(grammarAccess.getAddOperationAccess().getAlternatives_1_0_0(), "rule__AddOperation__Alternatives_1_0_0");
					put(grammarAccess.getSymbolAccess().getAlternatives(), "rule__Symbol__Alternatives");
					put(grammarAccess.getChaindedCallAccess().getAlternatives_1_0_0(), "rule__ChaindedCall__Alternatives_1_0_0");
					put(grammarAccess.getInfixOperationAccess().getAlternatives(), "rule__InfixOperation__Alternatives");
					put(grammarAccess.getAtomicLiteralAccess().getAlternatives(), "rule__AtomicLiteral__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getLiteralTypeAccess().getLitAlternatives_0(), "rule__LiteralType__LitAlternatives_0");
					put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
					put(grammarAccess.getImportAleAccess().getGroup(), "rule__ImportAle__Group__0");
					put(grammarAccess.getImportEcoreAccess().getGroup(), "rule__ImportEcore__Group__0");
					put(grammarAccess.getAleClassAccess().getGroup(), "rule__AleClass__Group__0");
					put(grammarAccess.getAleClassAccess().getGroup_4(), "rule__AleClass__Group_4__0");
					put(grammarAccess.getAleClassAccess().getGroup_4_2(), "rule__AleClass__Group_4_2__0");
					put(grammarAccess.getAleClassAccess().getGroup_5(), "rule__AleClass__Group_5__0");
					put(grammarAccess.getAbstractMethodAccess().getGroup(), "rule__AbstractMethod__Group__0");
					put(grammarAccess.getAbstractMethodAccess().getGroup_4(), "rule__AbstractMethod__Group_4__0");
					put(grammarAccess.getAbstractMethodAccess().getGroup_4_1(), "rule__AbstractMethod__Group_4_1__0");
					put(grammarAccess.getAbstractMethodAccess().getGroup_4_1_1(), "rule__AbstractMethod__Group_4_1_1__0");
					put(grammarAccess.getDefMethodAccess().getGroup(), "rule__DefMethod__Group__0");
					put(grammarAccess.getDefMethodAccess().getGroup_3(), "rule__DefMethod__Group_3__0");
					put(grammarAccess.getDefMethodAccess().getGroup_3_1(), "rule__DefMethod__Group_3_1__0");
					put(grammarAccess.getDefMethodAccess().getGroup_3_1_1(), "rule__DefMethod__Group_3_1_1__0");
					put(grammarAccess.getOverrideMethodAccess().getGroup(), "rule__OverrideMethod__Group__0");
					put(grammarAccess.getOverrideMethodAccess().getGroup_3(), "rule__OverrideMethod__Group_3__0");
					put(grammarAccess.getOverrideMethodAccess().getGroup_3_1(), "rule__OverrideMethod__Group_3_1__0");
					put(grammarAccess.getOverrideMethodAccess().getGroup_3_1_1(), "rule__OverrideMethod__Group_3_1_1__0");
					put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
					put(grammarAccess.getStatementAccess().getGroup_4(), "rule__Statement__Group_4__0");
					put(grammarAccess.getStatementAccess().getGroup_5(), "rule__Statement__Group_5__0");
					put(grammarAccess.getStatementAccess().getGroup_6(), "rule__Statement__Group_6__0");
					put(grammarAccess.getStatementAccess().getGroup_7(), "rule__Statement__Group_7__0");
					put(grammarAccess.getDebugStatementAccess().getGroup(), "rule__DebugStatement__Group__0");
					put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
					put(grammarAccess.getLetStatementAccess().getGroup(), "rule__LetStatement__Group__0");
					put(grammarAccess.getLetStatementAccess().getGroup_3(), "rule__LetStatement__Group_3__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_6(), "rule__IfStatement__Group_6__0");
					put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
					put(grammarAccess.getForLoopAccess().getGroup(), "rule__ForLoop__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getVarAssignAccess().getGroup_0(), "rule__VarAssign__Group_0__0");
					put(grammarAccess.getVarAssignAccess().getGroup_1(), "rule__VarAssign__Group_1__0");
					put(grammarAccess.getImpliesOperationAccess().getGroup(), "rule__ImpliesOperation__Group__0");
					put(grammarAccess.getImpliesOperationAccess().getGroup_1(), "rule__ImpliesOperation__Group_1__0");
					put(grammarAccess.getImpliesOperationAccess().getGroup_1_0(), "rule__ImpliesOperation__Group_1_0__0");
					put(grammarAccess.getImpliesOperationAccess().getGroup_1_0_0(), "rule__ImpliesOperation__Group_1_0_0__0");
					put(grammarAccess.getBooleanOperationAccess().getGroup(), "rule__BooleanOperation__Group__0");
					put(grammarAccess.getBooleanOperationAccess().getGroup_1(), "rule__BooleanOperation__Group_1__0");
					put(grammarAccess.getBooleanOperationAccess().getGroup_1_0(), "rule__BooleanOperation__Group_1_0__0");
					put(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_0(), "rule__BooleanOperation__Group_1_0_0_0__0");
					put(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_1(), "rule__BooleanOperation__Group_1_0_0_1__0");
					put(grammarAccess.getBooleanOperationAccess().getGroup_1_0_0_2(), "rule__BooleanOperation__Group_1_0_0_2__0");
					put(grammarAccess.getCompareOperationAccess().getGroup(), "rule__CompareOperation__Group__0");
					put(grammarAccess.getCompareOperationAccess().getGroup_1(), "rule__CompareOperation__Group_1__0");
					put(grammarAccess.getCompareOperationAccess().getGroup_1_0(), "rule__CompareOperation__Group_1_0__0");
					put(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_0(), "rule__CompareOperation__Group_1_0_0_0__0");
					put(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_1(), "rule__CompareOperation__Group_1_0_0_1__0");
					put(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_2(), "rule__CompareOperation__Group_1_0_0_2__0");
					put(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_3(), "rule__CompareOperation__Group_1_0_0_3__0");
					put(grammarAccess.getCompareOperationAccess().getGroup_1_0_0_4(), "rule__CompareOperation__Group_1_0_0_4__0");
					put(grammarAccess.getEqualityOperationAccess().getGroup(), "rule__EqualityOperation__Group__0");
					put(grammarAccess.getEqualityOperationAccess().getGroup_1(), "rule__EqualityOperation__Group_1__0");
					put(grammarAccess.getEqualityOperationAccess().getGroup_1_0(), "rule__EqualityOperation__Group_1_0__0");
					put(grammarAccess.getMultOperationAccess().getGroup(), "rule__MultOperation__Group__0");
					put(grammarAccess.getMultOperationAccess().getGroup_1(), "rule__MultOperation__Group_1__0");
					put(grammarAccess.getMultOperationAccess().getGroup_1_0(), "rule__MultOperation__Group_1_0__0");
					put(grammarAccess.getMultOperationAccess().getGroup_1_0_0_0(), "rule__MultOperation__Group_1_0_0_0__0");
					put(grammarAccess.getMultOperationAccess().getGroup_1_0_0_1(), "rule__MultOperation__Group_1_0_0_1__0");
					put(grammarAccess.getAddOperationAccess().getGroup(), "rule__AddOperation__Group__0");
					put(grammarAccess.getAddOperationAccess().getGroup_1(), "rule__AddOperation__Group_1__0");
					put(grammarAccess.getAddOperationAccess().getGroup_1_0(), "rule__AddOperation__Group_1_0__0");
					put(grammarAccess.getAddOperationAccess().getGroup_1_0_0_0(), "rule__AddOperation__Group_1_0_0_0__0");
					put(grammarAccess.getAddOperationAccess().getGroup_1_0_0_1(), "rule__AddOperation__Group_1_0_0_1__0");
					put(grammarAccess.getChaindedCallAccess().getGroup(), "rule__ChaindedCall__Group__0");
					put(grammarAccess.getChaindedCallAccess().getGroup_1(), "rule__ChaindedCall__Group_1__0");
					put(grammarAccess.getChaindedCallAccess().getGroup_1_0(), "rule__ChaindedCall__Group_1_0__0");
					put(grammarAccess.getChaindedCallAccess().getGroup_1_0_0_0(), "rule__ChaindedCall__Group_1_0_0_0__0");
					put(grammarAccess.getChaindedCallAccess().getGroup_1_0_0_1(), "rule__ChaindedCall__Group_1_0_0_1__0");
					put(grammarAccess.getInfixOperationAccess().getGroup_0(), "rule__InfixOperation__Group_0__0");
					put(grammarAccess.getInfixOperationAccess().getGroup_1(), "rule__InfixOperation__Group_1__0");
					put(grammarAccess.getInfixOperationAccess().getGroup_2(), "rule__InfixOperation__Group_2__0");
					put(grammarAccess.getInfixOperationAccess().getGroup_3(), "rule__InfixOperation__Group_3__0");
					put(grammarAccess.getInfixOperationAccess().getGroup_4(), "rule__InfixOperation__Group_4__0");
					put(grammarAccess.getInfixOperationAccess().getGroup_4_2(), "rule__InfixOperation__Group_4_2__0");
					put(grammarAccess.getInfixOperationAccess().getGroup_4_2_1(), "rule__InfixOperation__Group_4_2_1__0");
					put(grammarAccess.getInfixOperationAccess().getGroup_4_2_1_1(), "rule__InfixOperation__Group_4_2_1_1__0");
					put(grammarAccess.getParamCallAccess().getGroup(), "rule__ParamCall__Group__0");
					put(grammarAccess.getParamCallAccess().getGroup_0(), "rule__ParamCall__Group_0__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_0(), "rule__AtomicLiteral__Group_0__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_1(), "rule__AtomicLiteral__Group_1__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_2(), "rule__AtomicLiteral__Group_2__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_3(), "rule__AtomicLiteral__Group_3__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_4(), "rule__AtomicLiteral__Group_4__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_5(), "rule__AtomicLiteral__Group_5__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_6(), "rule__AtomicLiteral__Group_6__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_7(), "rule__AtomicLiteral__Group_7__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_8(), "rule__AtomicLiteral__Group_8__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_9(), "rule__AtomicLiteral__Group_9__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_10(), "rule__AtomicLiteral__Group_10__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_10_3(), "rule__AtomicLiteral__Group_10_3__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_10_3_1(), "rule__AtomicLiteral__Group_10_3_1__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_11(), "rule__AtomicLiteral__Group_11__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_11_3(), "rule__AtomicLiteral__Group_11_3__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_11_3_1(), "rule__AtomicLiteral__Group_11_3_1__0");
					put(grammarAccess.getAtomicLiteralAccess().getGroup_12(), "rule__AtomicLiteral__Group_12__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
					put(grammarAccess.getTypeAccess().getGroup_3(), "rule__Type__Group_3__0");
					put(grammarAccess.getQualifiedAccess().getGroup(), "rule__Qualified__Group__0");
					put(grammarAccess.getQualifiedAccess().getGroup_1(), "rule__Qualified__Group_1__0");
					put(grammarAccess.getRootAccess().getNameAssignment_1(), "rule__Root__NameAssignment_1");
					put(grammarAccess.getRootAccess().getImportEcoreAssignment_3(), "rule__Root__ImportEcoreAssignment_3");
					put(grammarAccess.getRootAccess().getImportsAleAssignment_4(), "rule__Root__ImportsAleAssignment_4");
					put(grammarAccess.getRootAccess().getClassesAssignment_5(), "rule__Root__ClassesAssignment_5");
					put(grammarAccess.getImportAleAccess().getRefAssignment_3(), "rule__ImportAle__RefAssignment_3");
					put(grammarAccess.getImportEcoreAccess().getRefAssignment_3(), "rule__ImportEcore__RefAssignment_3");
					put(grammarAccess.getAleClassAccess().getNameAssignment_3(), "rule__AleClass__NameAssignment_3");
					put(grammarAccess.getAleClassAccess().getSuperClassAssignment_4_1(), "rule__AleClass__SuperClassAssignment_4_1");
					put(grammarAccess.getAleClassAccess().getSuperClassAssignment_4_2_1(), "rule__AleClass__SuperClassAssignment_4_2_1");
					put(grammarAccess.getAleClassAccess().getMethodsAssignment_5_1(), "rule__AleClass__MethodsAssignment_5_1");
					put(grammarAccess.getAbstractMethodAccess().getTypeAssignment_2_0(), "rule__AbstractMethod__TypeAssignment_2_0");
					put(grammarAccess.getAbstractMethodAccess().getNameAssignment_3(), "rule__AbstractMethod__NameAssignment_3");
					put(grammarAccess.getAbstractMethodAccess().getParamsAssignment_4_1_0(), "rule__AbstractMethod__ParamsAssignment_4_1_0");
					put(grammarAccess.getAbstractMethodAccess().getParamsAssignment_4_1_1_1(), "rule__AbstractMethod__ParamsAssignment_4_1_1_1");
					put(grammarAccess.getDefMethodAccess().getTypeAssignment_1_0(), "rule__DefMethod__TypeAssignment_1_0");
					put(grammarAccess.getDefMethodAccess().getNameAssignment_2(), "rule__DefMethod__NameAssignment_2");
					put(grammarAccess.getDefMethodAccess().getParamsAssignment_3_1_0(), "rule__DefMethod__ParamsAssignment_3_1_0");
					put(grammarAccess.getDefMethodAccess().getParamsAssignment_3_1_1_1(), "rule__DefMethod__ParamsAssignment_3_1_1_1");
					put(grammarAccess.getDefMethodAccess().getBlockAssignment_4(), "rule__DefMethod__BlockAssignment_4");
					put(grammarAccess.getOverrideMethodAccess().getTypeAssignment_1(), "rule__OverrideMethod__TypeAssignment_1");
					put(grammarAccess.getOverrideMethodAccess().getNameAssignment_2(), "rule__OverrideMethod__NameAssignment_2");
					put(grammarAccess.getOverrideMethodAccess().getParamsAssignment_3_1_0(), "rule__OverrideMethod__ParamsAssignment_3_1_0");
					put(grammarAccess.getOverrideMethodAccess().getParamsAssignment_3_1_1_1(), "rule__OverrideMethod__ParamsAssignment_3_1_1_1");
					put(grammarAccess.getOverrideMethodAccess().getBlockAssignment_4(), "rule__OverrideMethod__BlockAssignment_4");
					put(grammarAccess.getDebugStatementAccess().getExprAssignment_3(), "rule__DebugStatement__ExprAssignment_3");
					put(grammarAccess.getReturnStatementAccess().getReturnedAssignment_2(), "rule__ReturnStatement__ReturnedAssignment_2");
					put(grammarAccess.getLetStatementAccess().getBindingsAssignment_2(), "rule__LetStatement__BindingsAssignment_2");
					put(grammarAccess.getLetStatementAccess().getBindingsAssignment_3_1(), "rule__LetStatement__BindingsAssignment_3_1");
					put(grammarAccess.getLetStatementAccess().getBlockAssignment_5(), "rule__LetStatement__BlockAssignment_5");
					put(grammarAccess.getIfStatementAccess().getConditionAssignment_3(), "rule__IfStatement__ConditionAssignment_3");
					put(grammarAccess.getIfStatementAccess().getThenBranchAssignment_5(), "rule__IfStatement__ThenBranchAssignment_5");
					put(grammarAccess.getIfStatementAccess().getElseBranchAssignment_6_1(), "rule__IfStatement__ElseBranchAssignment_6_1");
					put(grammarAccess.getWhileStatementAccess().getConditionAssignment_3(), "rule__WhileStatement__ConditionAssignment_3");
					put(grammarAccess.getWhileStatementAccess().getWhileBlockAssignment_5(), "rule__WhileStatement__WhileBlockAssignment_5");
					put(grammarAccess.getForLoopAccess().getTypeAssignment_3(), "rule__ForLoop__TypeAssignment_3");
					put(grammarAccess.getForLoopAccess().getNameAssignment_4(), "rule__ForLoop__NameAssignment_4");
					put(grammarAccess.getForLoopAccess().getCollectionAssignment_6(), "rule__ForLoop__CollectionAssignment_6");
					put(grammarAccess.getForLoopAccess().getBlockAssignment_8(), "rule__ForLoop__BlockAssignment_8");
					put(grammarAccess.getBlockAccess().getBodyAssignment_2(), "rule__Block__BodyAssignment_2");
					put(grammarAccess.getVarAssignAccess().getTypeAssignment_0_1(), "rule__VarAssign__TypeAssignment_0_1");
					put(grammarAccess.getVarAssignAccess().getNameAssignment_0_2(), "rule__VarAssign__NameAssignment_0_2");
					put(grammarAccess.getVarAssignAccess().getValueAssignment_0_4(), "rule__VarAssign__ValueAssignment_0_4");
					put(grammarAccess.getVarAssignAccess().getNameAssignment_1_1(), "rule__VarAssign__NameAssignment_1_1");
					put(grammarAccess.getVarAssignAccess().getValueAssignment_1_3(), "rule__VarAssign__ValueAssignment_1_3");
					put(grammarAccess.getImpliesOperationAccess().getRightAssignment_1_0_1(), "rule__ImpliesOperation__RightAssignment_1_0_1");
					put(grammarAccess.getBooleanOperationAccess().getRightAssignment_1_0_1(), "rule__BooleanOperation__RightAssignment_1_0_1");
					put(grammarAccess.getCompareOperationAccess().getRightAssignment_1_0_1(), "rule__CompareOperation__RightAssignment_1_0_1");
					put(grammarAccess.getEqualityOperationAccess().getOpAssignment_1_0_1(), "rule__EqualityOperation__OpAssignment_1_0_1");
					put(grammarAccess.getEqualityOperationAccess().getRightAssignment_1_0_2(), "rule__EqualityOperation__RightAssignment_1_0_2");
					put(grammarAccess.getMultOperationAccess().getRightAssignment_1_0_1(), "rule__MultOperation__RightAssignment_1_0_1");
					put(grammarAccess.getAddOperationAccess().getRightAssignment_1_0_1(), "rule__AddOperation__RightAssignment_1_0_1");
					put(grammarAccess.getChaindedCallAccess().getRightAssignment_1_0_1(), "rule__ChaindedCall__RightAssignment_1_0_1");
					put(grammarAccess.getInfixOperationAccess().getExpressionAssignment_0_2(), "rule__InfixOperation__ExpressionAssignment_0_2");
					put(grammarAccess.getInfixOperationAccess().getExpressionAssignment_1_2(), "rule__InfixOperation__ExpressionAssignment_1_2");
					put(grammarAccess.getInfixOperationAccess().getTypeAssignment_2_3(), "rule__InfixOperation__TypeAssignment_2_3");
					put(grammarAccess.getInfixOperationAccess().getNameAssignment_3_2(), "rule__InfixOperation__NameAssignment_3_2");
					put(grammarAccess.getInfixOperationAccess().getNameAssignment_4_1(), "rule__InfixOperation__NameAssignment_4_1");
					put(grammarAccess.getInfixOperationAccess().getParametersAssignment_4_2_1_0(), "rule__InfixOperation__ParametersAssignment_4_2_1_0");
					put(grammarAccess.getInfixOperationAccess().getParametersAssignment_4_2_1_1_1(), "rule__InfixOperation__ParametersAssignment_4_2_1_1_1");
					put(grammarAccess.getParamCallAccess().getLambdaAssignment_0_0(), "rule__ParamCall__LambdaAssignment_0_0");
					put(grammarAccess.getParamCallAccess().getExpressionAssignment_1(), "rule__ParamCall__ExpressionAssignment_1");
					put(grammarAccess.getAtomicLiteralAccess().getExpAssignment_1_3(), "rule__AtomicLiteral__ExpAssignment_1_3");
					put(grammarAccess.getAtomicLiteralAccess().getValueAssignment_4_1(), "rule__AtomicLiteral__ValueAssignment_4_1");
					put(grammarAccess.getAtomicLiteralAccess().getValueAssignment_5_1(), "rule__AtomicLiteral__ValueAssignment_5_1");
					put(grammarAccess.getAtomicLiteralAccess().getValueAssignment_6_1(), "rule__AtomicLiteral__ValueAssignment_6_1");
					put(grammarAccess.getAtomicLiteralAccess().getValueAssignment_7_1(), "rule__AtomicLiteral__ValueAssignment_7_1");
					put(grammarAccess.getAtomicLiteralAccess().getStartAssignment_9_2(), "rule__AtomicLiteral__StartAssignment_9_2");
					put(grammarAccess.getAtomicLiteralAccess().getStopAssignment_9_5(), "rule__AtomicLiteral__StopAssignment_9_5");
					put(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_0(), "rule__AtomicLiteral__ExpressionsAssignment_10_3_0");
					put(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_10_3_1_1(), "rule__AtomicLiteral__ExpressionsAssignment_10_3_1_1");
					put(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_11_3_0(), "rule__AtomicLiteral__ExpressionsAssignment_11_3_0");
					put(grammarAccess.getAtomicLiteralAccess().getExpressionsAssignment_11_3_1_1(), "rule__AtomicLiteral__ExpressionsAssignment_11_3_1_1");
					put(grammarAccess.getAtomicLiteralAccess().getValueAssignment_12_1(), "rule__AtomicLiteral__ValueAssignment_12_1");
					put(grammarAccess.getParamAccess().getTypeAssignment_0(), "rule__Param__TypeAssignment_0");
					put(grammarAccess.getParamAccess().getNameAssignment_1(), "rule__Param__NameAssignment_1");
					put(grammarAccess.getTypeAccess().getExternalClassAssignment_1_1(), "rule__Type__ExternalClassAssignment_1_1");
					put(grammarAccess.getTypeAccess().getSubTypeAssignment_2_3(), "rule__Type__SubTypeAssignment_2_3");
					put(grammarAccess.getTypeAccess().getSubTypeAssignment_3_3(), "rule__Type__SubTypeAssignment_3_3");
					put(grammarAccess.getLiteralTypeAccess().getLitAssignment(), "rule__LiteralType__LitAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAleParser typedParser = (InternalAleParser) parser;
			typedParser.entryRuleRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
