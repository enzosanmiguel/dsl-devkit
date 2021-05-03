/**
 */
package com.avaloq.tools.ddk.xtext.format.format.impl;

import com.avaloq.tools.ddk.xtext.format.format.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormatFactoryImpl extends EFactoryImpl implements FormatFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FormatFactory init()
  {
    try
    {
      FormatFactory theFormatFactory = (FormatFactory)EPackage.Registry.INSTANCE.getEFactory(FormatPackage.eNS_URI);
      if (theFormatFactory != null)
      {
        return theFormatFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FormatFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FormatPackage.FORMAT_CONFIGURATION: return createFormatConfiguration();
      case FormatPackage.CONSTANT: return createConstant();
      case FormatPackage.INT_VALUE: return createIntValue();
      case FormatPackage.STRING_VALUE: return createStringValue();
      case FormatPackage.RULE: return createRule();
      case FormatPackage.GRAMMAR_RULE: return createGrammarRule();
      case FormatPackage.WILDCARD_RULE: return createWildcardRule();
      case FormatPackage.GRAMMAR_RULE_DIRECTIVE: return createGrammarRuleDirective();
      case FormatPackage.WILDCARD_RULE_DIRECTIVE: return createWildcardRuleDirective();
      case FormatPackage.GRAMMAR_ELEMENT_REFERENCE: return createGrammarElementReference();
      case FormatPackage.GRAMMAR_ELEMENT_LOOKUP: return createGrammarElementLookup();
      case FormatPackage.CONTEXT_FREE_DIRECTIVE: return createContextFreeDirective();
      case FormatPackage.SPECIFIC_DIRECTIVE: return createSpecificDirective();
      case FormatPackage.MATCHER_LIST: return createMatcherList();
      case FormatPackage.GROUP_BLOCK: return createGroupBlock();
      case FormatPackage.KEYWORD_PAIR: return createKeywordPair();
      case FormatPackage.MATCHER: return createMatcher();
      case FormatPackage.LOCATOR: return createLocator();
      case FormatPackage.NO_FORMAT_LOCATOR: return createNoFormatLocator();
      case FormatPackage.SPACE_LOCATOR: return createSpaceLocator();
      case FormatPackage.RIGHT_PADDING_LOCATOR: return createRightPaddingLocator();
      case FormatPackage.LINEWRAP_LOCATOR: return createLinewrapLocator();
      case FormatPackage.COLUMN_LOCATOR: return createColumnLocator();
      case FormatPackage.OFFSET_LOCATOR: return createOffsetLocator();
      case FormatPackage.INDENT_LOCATOR: return createIndentLocator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FormatPackage.MATCHER_TYPE:
        return createMatcherTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FormatPackage.MATCHER_TYPE:
        return convertMatcherTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormatConfiguration createFormatConfiguration()
  {
    FormatConfigurationImpl formatConfiguration = new FormatConfigurationImpl();
    return formatConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GrammarRule createGrammarRule()
  {
    GrammarRuleImpl grammarRule = new GrammarRuleImpl();
    return grammarRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WildcardRule createWildcardRule()
  {
    WildcardRuleImpl wildcardRule = new WildcardRuleImpl();
    return wildcardRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GrammarRuleDirective createGrammarRuleDirective()
  {
    GrammarRuleDirectiveImpl grammarRuleDirective = new GrammarRuleDirectiveImpl();
    return grammarRuleDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WildcardRuleDirective createWildcardRuleDirective()
  {
    WildcardRuleDirectiveImpl wildcardRuleDirective = new WildcardRuleDirectiveImpl();
    return wildcardRuleDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GrammarElementReference createGrammarElementReference()
  {
    GrammarElementReferenceImpl grammarElementReference = new GrammarElementReferenceImpl();
    return grammarElementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GrammarElementLookup createGrammarElementLookup()
  {
    GrammarElementLookupImpl grammarElementLookup = new GrammarElementLookupImpl();
    return grammarElementLookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContextFreeDirective createContextFreeDirective()
  {
    ContextFreeDirectiveImpl contextFreeDirective = new ContextFreeDirectiveImpl();
    return contextFreeDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpecificDirective createSpecificDirective()
  {
    SpecificDirectiveImpl specificDirective = new SpecificDirectiveImpl();
    return specificDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MatcherList createMatcherList()
  {
    MatcherListImpl matcherList = new MatcherListImpl();
    return matcherList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GroupBlock createGroupBlock()
  {
    GroupBlockImpl groupBlock = new GroupBlockImpl();
    return groupBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public KeywordPair createKeywordPair()
  {
    KeywordPairImpl keywordPair = new KeywordPairImpl();
    return keywordPair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Matcher createMatcher()
  {
    MatcherImpl matcher = new MatcherImpl();
    return matcher;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Locator createLocator()
  {
    LocatorImpl locator = new LocatorImpl();
    return locator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NoFormatLocator createNoFormatLocator()
  {
    NoFormatLocatorImpl noFormatLocator = new NoFormatLocatorImpl();
    return noFormatLocator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpaceLocator createSpaceLocator()
  {
    SpaceLocatorImpl spaceLocator = new SpaceLocatorImpl();
    return spaceLocator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RightPaddingLocator createRightPaddingLocator()
  {
    RightPaddingLocatorImpl rightPaddingLocator = new RightPaddingLocatorImpl();
    return rightPaddingLocator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LinewrapLocator createLinewrapLocator()
  {
    LinewrapLocatorImpl linewrapLocator = new LinewrapLocatorImpl();
    return linewrapLocator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnLocator createColumnLocator()
  {
    ColumnLocatorImpl columnLocator = new ColumnLocatorImpl();
    return columnLocator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OffsetLocator createOffsetLocator()
  {
    OffsetLocatorImpl offsetLocator = new OffsetLocatorImpl();
    return offsetLocator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndentLocator createIndentLocator()
  {
    IndentLocatorImpl indentLocator = new IndentLocatorImpl();
    return indentLocator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatcherType createMatcherTypeFromString(EDataType eDataType, String initialValue)
  {
    MatcherType result = MatcherType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMatcherTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormatPackage getFormatPackage()
  {
    return (FormatPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FormatPackage getPackage()
  {
    return FormatPackage.eINSTANCE;
  }

} //FormatFactoryImpl
