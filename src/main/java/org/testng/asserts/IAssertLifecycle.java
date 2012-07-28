package org.testng.asserts;

public interface IAssertLifecycle {
  /**
   * Run the assert command in parameter.
   */
  void executeAssert(IAssert assertCommand);

  /**
   * Invoked when an assert succeeds.
   */
  void onAssertSuccess(IAssert assertCommand);

  /**
   * Invoked when an assert fails.
   */
  void onAssertFailure(IAssert assertCommand);

  /**
   * Invoked before an assert is run.
   */
  void onBeforeAssert(IAssert assertCommand);

  /**
   * Invoked after an assert is run.
   */
  void onAfterAssert(IAssert assertCommand);
}
