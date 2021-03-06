// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import intellij.haskell.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HaskellModuleBodyImpl extends HaskellCompositeElementImpl implements HaskellModuleBody {

    public HaskellModuleBodyImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull HaskellVisitor visitor) {
        visitor.visitModuleBody(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof HaskellVisitor) accept((HaskellVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public HaskellImportDeclarations getImportDeclarations() {
        return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellImportDeclarations.class));
    }

    @Override
    @Nullable
    public HaskellModuleDeclaration getModuleDeclaration() {
        return PsiTreeUtil.getChildOfType(this, HaskellModuleDeclaration.class);
    }

    @Override
    @Nullable
    public HaskellTopDeclaration getTopDeclaration() {
        return PsiTreeUtil.getChildOfType(this, HaskellTopDeclaration.class);
    }

    @Override
    @NotNull
    public List<HaskellTopDeclarationLine> getTopDeclarationLineList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTopDeclarationLine.class);
    }

}
