/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

/* Generated By:JJTree: Do not edit this line. ASTSwitchLabeledRule.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */

package net.sourceforge.pmd.lang.java.ast;

public class ASTSwitchExpression extends AbstractJavaTypeNode {
    ASTSwitchExpression(int id) {
        super(id);
    }

    ASTSwitchExpression(JavaParser p, int id) {
        super(p, id);
    }

    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=8b1747ca53f66203ee212a3699a9a2f3 (do not edit this line) */