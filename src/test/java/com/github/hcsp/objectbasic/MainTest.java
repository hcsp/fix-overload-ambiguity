package com.github.hcsp.objectbasic;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import com.github.hcsp.test.helper.JavaASTReader;
import com.github.javaparser.ast.expr.CastExpr;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
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
