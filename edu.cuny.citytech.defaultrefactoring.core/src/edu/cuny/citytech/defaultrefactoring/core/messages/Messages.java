/**
 * 
 */
package edu.cuny.citytech.defaultrefactoring.core.messages;

import org.eclipse.osgi.util.NLS;

/**
 * @author raffi
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "edu.cuny.citytech.defaultrefactoring.core.messages.messages"; //$NON-NLS-1$

	public static String MigrateSkeletalImplementationToInferfaceRefactoring_Name;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_CategoryName;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_CategoryDescription;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_MethodsNotSpecified;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_CheckingPreconditions;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_CompilingSource;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_CreatingChange;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_CUContainsCompileErrors;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_MethodDoesNotExist;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_PreconditionFailed;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_RefactoringNotPossible;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_WrongType;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_CantChangeMethod;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoConstructors;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoAnnotations;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoStaticMethods;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInInterfaces;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInAnonymousTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInEnums;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInLambdas;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInLocals;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInMemberTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoLambdaMethods;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_MethodsOnlyInClasses;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInAnnotatedTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesWithFields;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesWithInitializers;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesWithMoreThanOneMethod;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesWithTypeParameters;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesWithType;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesWithSuperType;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesThatDontImplementInterfaces;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesThatExtendMultipleInterfaces;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsThatThrowExceptions;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInConcreteTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInStaticTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsWithParameters;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsWithReturnTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsWithTypeParameters;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsWithStatements;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInBinaryTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInReadOnlyTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesWithNoCandidateTargetTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMethodsInTypesWithMultipleCandidateTargetTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoNativeMethods;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoMoreThanOneMethod;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_IncompatibleLanguageConstruct;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationTypeMustBePureInterface;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInterfaceMustOnlyDeclareTheMethodToMigrate;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_NoDestinationInterface;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_TargetMethodIsAlreadyDefault;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInteraceHasAnnotations;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInteraceIsNotTopLevel;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInteraceDeclaresFields;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInteraceExtendsInterface;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInterfaceDeclaresTypeParameters;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInterfaceDeclaresMemberTypes;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInterfaceDoesNotExist;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInterfaceNotWritable;
	public static String MigrateSkeletalImplementationToInferfaceRefactoring_DestinationInterfaceIsMember;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		super();
	}
}
