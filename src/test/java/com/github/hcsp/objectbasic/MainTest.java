
package com.github.hcsp.objectbasic;
org.junit.jupiter.api.Test;;org.hamcrest.Matchers;;com.github.javaparser.ast.expr.CastExpr;;com.github.hcsp.test.helper.JavaASTReader;;com.github.blindpirate.extensions.CaptureSystemOutput;;org.junit.jupiter.api.Assertions;

class MainTest {
@Test
public void hasCastExpr() {
    Assertions.assertTrue(JavaASTReader.findAll(Main.class, CastExpr.class).size() > 0);
}

@Test
@CaptureSystemOutput
public void correctMethodInvocation(CaptureSystemOutput.OutputCapture outputCapture) {
    outputCapture.expect(Matchers.containsString("I'm HashMap!"));
    Main.main(null);
}

}
