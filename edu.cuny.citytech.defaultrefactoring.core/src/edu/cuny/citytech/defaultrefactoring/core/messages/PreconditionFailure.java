package edu.cuny.citytech.defaultrefactoring.core.messages;

import org.eclipse.jdt.internal.corext.refactoring.RefactoringCoreMessages;

@SuppressWarnings("restriction")
public enum PreconditionFailure {
	NoMethodsInTypesWithNoCandidateTargetTypes(Messages.NoMethodsInTypesWithNoCandidateTargetTypes),
	NoMethodsInTypesWithMultipleCandidateTargetTypes(Messages.NoMethodsInTypesWithMultipleCandidateTargetTypes),
	SourceMethodHasNoTargetMethod(Messages.SourceMethodHasNoTargetMethod),
	MethodDoesNotExist(Messages.MethodDoesNotExist),
	PreconditionFailed(Messages.PreconditionFailed),
	RefactoringNotPossible(Messages.RefactoringNotPossible),
	WrongType(Messages.WrongType),
	CantChangeMethod(Messages.CantChangeMethod),
	NoConstructors(Messages.NoConstructors),
	NoAnnotations(Messages.NoAnnotations),
	NoStaticMethods(Messages.NoStaticMethods),
	NoAbstractMethods(Messages.NoAbstractMethods),
	NoMethodsInInterfaces(Messages.NoMethodsInInterfaces),
	NoMethodsInAnonymousTypes(Messages.NoMethodsInAnonymousTypes),
	NoMethodsInEnums(Messages.NoMethodsInEnums),
	NoMethodsInLambdas(Messages.NoMethodsInLambdas),
	NoMethodsInLocals(Messages.NoMethodsInLocals),
	NoMethodsInMemberTypes(Messages.NoMethodsInMemberTypes),
	NoLambdaMethods(Messages.NoLambdaMethods),
	MethodsOnlyInClasses(Messages.MethodsOnlyInClasses),
	NoMethodsInAnnotatedTypes(Messages.NoMethodsInAnnotatedTypes),
	NoMethodsInTypesWithFields(Messages.NoMethodsInTypesWithFields),
	NoMethodsInTypesWithInitializers(Messages.NoMethodsInTypesWithInitializers),
	NoMethodsInTypesWithMoreThanOneMethod(Messages.NoMethodsInTypesWithMoreThanOneMethod),
	NoMethodsInTypesWithTypeParameters(Messages.NoMethodsInTypesWithTypeParameters),
	NoMethodsInTypesWithType(Messages.NoMethodsInTypesWithType),
	NoMethodsInTypesWithSuperType(Messages.NoMethodsInTypesWithSuperType),
	NoMethodsInTypesThatDontImplementInterfaces(Messages.NoMethodsInTypesThatDontImplementInterfaces),
	NoMethodsInTypesThatExtendMultipleInterfaces(Messages.NoMethodsInTypesThatExtendMultipleInterfaces),
	NoMethodsThatThrowExceptions(Messages.NoMethodsThatThrowExceptions),
	NoMethodsInConcreteTypes(Messages.NoMethodsInConcreteTypes),
	NoMethodsInStaticTypes(Messages.NoMethodsInStaticTypes),
	NoMethodsWithParameters(Messages.NoMethodsWithParameters),
	NoMethodsWithReturnTypes(Messages.NoMethodsWithReturnTypes),
	NoMethodsWithTypeParameters(Messages.NoMethodsWithTypeParameters),
	NoMethodsWithStatements(Messages.NoMethodsWithStatements),
	NoMethodsInBinaryTypes(Messages.NoMethodsInBinaryTypes),
	NoMethodsInReadOnlyTypes(Messages.NoMethodsInReadOnlyTypes),
	NoNativeMethods(Messages.NoNativeMethods),
	NoMoreThanOneMethod(Messages.NoMoreThanOneMethod),
	IncompatibleLanguageConstruct(Messages.IncompatibleLanguageConstruct),
	DestinationTypeMustBePureInterface(Messages.DestinationTypeMustBePureInterface),
	DestinationInterfaceMustOnlyDeclareTheMethodToMigrate(
			Messages.DestinationInterfaceMustOnlyDeclareTheMethodToMigrate),
	NoDestinationInterface(Messages.NoDestinationInterface),
	TargetMethodIsAlreadyDefault(Messages.TargetMethodIsAlreadyDefault),
	DestinationInterfaceHasAnnotations(Messages.DestinationInterfaceHasAnnotations),
	DestinationInterfaceIsNotTopLevel(Messages.DestinationInterfaceIsNotTopLevel),
	DestinationInterfaceDeclaresFields(Messages.DestinationInterfaceDeclaresFields),
	DestinationInterfaceExtendsInterface(Messages.DestinationInterfaceExtendsInterface),
	DestinationInterfaceDeclaresTypeParameters(Messages.DestinationInterfaceDeclaresTypeParameters),
	DestinationInterfaceDeclaresMemberTypes(Messages.DestinationInterfaceDeclaresMemberTypes),
	DestinationInterfaceDoesNotExist(Messages.DestinationInterfaceDoesNotExist),
	DestinationInterfaceNotWritable(Messages.DestinationInterfaceNotWritable),
	DestinationInterfaceIsMember(Messages.DestinationInterfaceIsMember),
	DestinationInterfaceHierarchyContainsInvalidClass(Messages.DestinationInterfaceHierarchyContainsInvalidClass),
	DestinationInterfaceHierarchyContainsInvalidInterfaces(
			Messages.DestinationInterfaceHierarchyContainsInvalidInterfaces),
	DestinationInterfaceHierarchyContainsSubtype(Messages.DestinationInterfaceHierarchyContainsSubtype),
	DestinationInterfaceHierarchyContainsSuperInterface(Messages.DestinationInterfaceHierarchyContainsSuperInterface),
	DestinationInterfaceHierarchyContainsSupertype(Messages.DestinationInterfaceHierarchyContainsSupertype),
	DestinationInterfaceHasExtendingInterface(Messages.DestinationInterfaceHasExtendingInterface),
	DestinationInterfaceHasInvalidImplementingClass(Messages.DestinationInterfaceHasInvalidImplementingClass),
	DeclaringTypeHierarchyContainsInvalidClass(Messages.DeclaringTypeHierarchyContainsInvalidClass),
	DeclaringTypeHierarchyContainsInvalidInterface(Messages.DeclaringTypeHierarchyContainsInvalidInterface),
	DeclaringTypeContainsSubtype(Messages.DeclaringTypeContainsSubtype),
	DeclaringTypeContainsInvalidSupertype(Messages.DeclaringTypeContainsInvalidSupertype),
	DestinationInterfaceIsFunctional(Messages.DestinationInterfaceIsFunctional),
	MethodContainsInconsistentParameterAnnotations(Messages.MethodContainsInconsistentParameterAnnotations),
	NoSynchronizedMethods(Messages.NoSynchronizedMethods),
	NoFinalMethods(Messages.NoFinalMethods),
	DestinationInterfaceIsStrictFP(Messages.DestinationInterfaceIsStrictFP),
	ExceptionTypeMismatch(Messages.ExceptionTypeMismatch),
	AnnotationMismatch(Messages.AnnotationMismatch),
	AnnotationNameMismatch(Messages.AnnotationNameMismatch),
	AnnotationValueMismatch(Messages.AnnotationValueMismatch),
	NoMethodsHavePassedThePreconditions(Messages.NoMethodsHavePassedThePreconditions),
	NoMethodsInAnnotationTypes(Messages.NoMethodsInAnnotationTypes),
	SourceMethodAccessesInstanceField(Messages.SourceMethodAccessesInstanceField),
	DestinationProjectIncompatible(Messages.DestinationProjectIncompatible),
	SourceMethodImplementsMultipleMethods(Messages.SourceMethodImplementsMultipleMethods),
	SourceMethodOverridesMethod(Messages.SourceMethodOverridesMethod),
	TypeNotAccessible(RefactoringCoreMessages.PullUpRefactoring_type_not_accessible),
	FieldNotAccessible(RefactoringCoreMessages.PullUpRefactoring_field_not_accessible),
	MethodNotAccessible(RefactoringCoreMessages.PullUpRefactoring_method_not_accessible),
	TypeVariableNotAvailable(RefactoringCoreMessages.PullUpRefactoring_Type_variable_not_available),
	TypeVariable2NotAvailable(RefactoringCoreMessages.PullUpRefactoring_Type_variable2_not_available),
	TypeVariable3NotAvailable(RefactoringCoreMessages.PullUpRefactoring_Type_variable3_not_available),
	TypeVariablesNotAvailable(RefactoringCoreMessages.PullUpRefactoring_Type_variables_not_available),
	TargetMethodHasMultipleSourceMethods(Messages.TargetMethodHasMultipleSourceMethods);

	private String message;

	private PreconditionFailure(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

}
