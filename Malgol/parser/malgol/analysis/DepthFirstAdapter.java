/* This file was generated by SableCC (http://www.sablecc.org/). */

package malgol.analysis;

import java.util.*;
import malgol.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        if(node.getFunctionDef() != null)
        {
            node.getFunctionDef().apply(this);
        }
        if(node.getFunctionDefList() != null)
        {
            node.getFunctionDefList().apply(this);
        }
        outAProgram(node);
    }

    public void inASomeFunctionDefList(ASomeFunctionDefList node)
    {
        defaultIn(node);
    }

    public void outASomeFunctionDefList(ASomeFunctionDefList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomeFunctionDefList(ASomeFunctionDefList node)
    {
        inASomeFunctionDefList(node);
        if(node.getFunctionDef() != null)
        {
            node.getFunctionDef().apply(this);
        }
        if(node.getFunctionDefList() != null)
        {
            node.getFunctionDefList().apply(this);
        }
        outASomeFunctionDefList(node);
    }

    public void inANoneFunctionDefList(ANoneFunctionDefList node)
    {
        defaultIn(node);
    }

    public void outANoneFunctionDefList(ANoneFunctionDefList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneFunctionDefList(ANoneFunctionDefList node)
    {
        inANoneFunctionDefList(node);
        outANoneFunctionDefList(node);
    }

    public void inAFunctionDef(AFunctionDef node)
    {
        defaultIn(node);
    }

    public void outAFunctionDef(AFunctionDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionDef(AFunctionDef node)
    {
        inAFunctionDef(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getParamList() != null)
        {
            node.getParamList().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        outAFunctionDef(node);
    }

    public void inASomeParamList(ASomeParamList node)
    {
        defaultIn(node);
    }

    public void outASomeParamList(ASomeParamList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomeParamList(ASomeParamList node)
    {
        inASomeParamList(node);
        if(node.getDecl() != null)
        {
            node.getDecl().apply(this);
        }
        if(node.getParamListTail() != null)
        {
            node.getParamListTail().apply(this);
        }
        outASomeParamList(node);
    }

    public void inANoneParamList(ANoneParamList node)
    {
        defaultIn(node);
    }

    public void outANoneParamList(ANoneParamList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneParamList(ANoneParamList node)
    {
        inANoneParamList(node);
        outANoneParamList(node);
    }

    public void inASomeParamListTail(ASomeParamListTail node)
    {
        defaultIn(node);
    }

    public void outASomeParamListTail(ASomeParamListTail node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomeParamListTail(ASomeParamListTail node)
    {
        inASomeParamListTail(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getDecl() != null)
        {
            node.getDecl().apply(this);
        }
        if(node.getParamListTail() != null)
        {
            node.getParamListTail().apply(this);
        }
        outASomeParamListTail(node);
    }

    public void inANoneParamListTail(ANoneParamListTail node)
    {
        defaultIn(node);
    }

    public void outANoneParamListTail(ANoneParamListTail node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneParamListTail(ANoneParamListTail node)
    {
        inANoneParamListTail(node);
        outANoneParamListTail(node);
    }

    public void inABlockBlock(ABlockBlock node)
    {
        defaultIn(node);
    }

    public void outABlockBlock(ABlockBlock node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlockBlock(ABlockBlock node)
    {
        inABlockBlock(node);
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getDeclsStmts() != null)
        {
            node.getDeclsStmts().apply(this);
        }
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outABlockBlock(node);
    }

    public void inAPrintStmt(APrintStmt node)
    {
        defaultIn(node);
    }

    public void outAPrintStmt(APrintStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintStmt(APrintStmt node)
    {
        inAPrintStmt(node);
        if(node.getPrint() != null)
        {
            node.getPrint().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAPrintStmt(node);
    }

    public void inAAssignStmt(AAssignStmt node)
    {
        defaultIn(node);
    }

    public void outAAssignStmt(AAssignStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignStmt(AAssignStmt node)
    {
        inAAssignStmt(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getColonEquals() != null)
        {
            node.getColonEquals().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAAssignStmt(node);
    }

    public void inABlockStmt(ABlockStmt node)
    {
        defaultIn(node);
    }

    public void outABlockStmt(ABlockStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlockStmt(ABlockStmt node)
    {
        inABlockStmt(node);
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        if(node.getDeclsStmts() != null)
        {
            node.getDeclsStmts().apply(this);
        }
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outABlockStmt(node);
    }

    public void inASelectStmt(ASelectStmt node)
    {
        defaultIn(node);
    }

    public void outASelectStmt(ASelectStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASelectStmt(ASelectStmt node)
    {
        inASelectStmt(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getCond() != null)
        {
            node.getCond().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getTBranch() != null)
        {
            node.getTBranch().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getFBranch() != null)
        {
            node.getFBranch().apply(this);
        }
        outASelectStmt(node);
    }

    public void inAWhileStmt(AWhileStmt node)
    {
        defaultIn(node);
    }

    public void outAWhileStmt(AWhileStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileStmt(AWhileStmt node)
    {
        inAWhileStmt(node);
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        if(node.getCond() != null)
        {
            node.getCond().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getBody() != null)
        {
            node.getBody().apply(this);
        }
        outAWhileStmt(node);
    }

    public void inASkipStmt(ASkipStmt node)
    {
        defaultIn(node);
    }

    public void outASkipStmt(ASkipStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASkipStmt(ASkipStmt node)
    {
        inASkipStmt(node);
        if(node.getSkip() != null)
        {
            node.getSkip().apply(this);
        }
        outASkipStmt(node);
    }

    public void inAReturnStmt(AReturnStmt node)
    {
        defaultIn(node);
    }

    public void outAReturnStmt(AReturnStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReturnStmt(AReturnStmt node)
    {
        inAReturnStmt(node);
        if(node.getReturn() != null)
        {
            node.getReturn().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAReturnStmt(node);
    }

    public void inASomeDeclsDeclsStmts(ASomeDeclsDeclsStmts node)
    {
        defaultIn(node);
    }

    public void outASomeDeclsDeclsStmts(ASomeDeclsDeclsStmts node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomeDeclsDeclsStmts(ASomeDeclsDeclsStmts node)
    {
        inASomeDeclsDeclsStmts(node);
        if(node.getDecl() != null)
        {
            node.getDecl().apply(this);
        }
        if(node.getDeclsStmts() != null)
        {
            node.getDeclsStmts().apply(this);
        }
        outASomeDeclsDeclsStmts(node);
    }

    public void inANoDeclsDeclsStmts(ANoDeclsDeclsStmts node)
    {
        defaultIn(node);
    }

    public void outANoDeclsDeclsStmts(ANoDeclsDeclsStmts node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoDeclsDeclsStmts(ANoDeclsDeclsStmts node)
    {
        inANoDeclsDeclsStmts(node);
        if(node.getStmtList() != null)
        {
            node.getStmtList().apply(this);
        }
        outANoDeclsDeclsStmts(node);
    }

    public void inADecl(ADecl node)
    {
        defaultIn(node);
    }

    public void outADecl(ADecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecl(ADecl node)
    {
        inADecl(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outADecl(node);
    }

    public void inASomeStmtList(ASomeStmtList node)
    {
        defaultIn(node);
    }

    public void outASomeStmtList(ASomeStmtList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomeStmtList(ASomeStmtList node)
    {
        inASomeStmtList(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getStmtList() != null)
        {
            node.getStmtList().apply(this);
        }
        outASomeStmtList(node);
    }

    public void inANoneStmtList(ANoneStmtList node)
    {
        defaultIn(node);
    }

    public void outANoneStmtList(ANoneStmtList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneStmtList(ANoneStmtList node)
    {
        inANoneStmtList(node);
        outANoneStmtList(node);
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
    }

    public void inABoolType(ABoolType node)
    {
        defaultIn(node);
    }

    public void outABoolType(ABoolType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolType(ABoolType node)
    {
        inABoolType(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolType(node);
    }

    public void inAArrayType(AArrayType node)
    {
        defaultIn(node);
    }

    public void outAArrayType(AArrayType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayType(AArrayType node)
    {
        inAArrayType(node);
        if(node.getArrayOf() != null)
        {
            node.getArrayOf().apply(this);
        }
        if(node.getSize() != null)
        {
            node.getSize().apply(this);
        }
        if(node.getElements() != null)
        {
            node.getElements().apply(this);
        }
        outAArrayType(node);
    }

    public void inAOrExp(AOrExp node)
    {
        defaultIn(node);
    }

    public void outAOrExp(AOrExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExp(AOrExp node)
    {
        inAOrExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getBar() != null)
        {
            node.getBar().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAOrExp(node);
    }

    public void inABaseExp(ABaseExp node)
    {
        defaultIn(node);
    }

    public void outABaseExp(ABaseExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABaseExp(ABaseExp node)
    {
        inABaseExp(node);
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outABaseExp(node);
    }

    public void inAAndAndExp(AAndAndExp node)
    {
        defaultIn(node);
    }

    public void outAAndAndExp(AAndAndExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndAndExp(AAndAndExp node)
    {
        inAAndAndExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getAmp() != null)
        {
            node.getAmp().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAndAndExp(node);
    }

    public void inABaseAndExp(ABaseAndExp node)
    {
        defaultIn(node);
    }

    public void outABaseAndExp(ABaseAndExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABaseAndExp(ABaseAndExp node)
    {
        inABaseAndExp(node);
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outABaseAndExp(node);
    }

    public void inANotNotExp(ANotNotExp node)
    {
        defaultIn(node);
    }

    public void outANotNotExp(ANotNotExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotNotExp(ANotNotExp node)
    {
        inANotNotExp(node);
        if(node.getBang() != null)
        {
            node.getBang().apply(this);
        }
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outANotNotExp(node);
    }

    public void inABaseNotExp(ABaseNotExp node)
    {
        defaultIn(node);
    }

    public void outABaseNotExp(ABaseNotExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABaseNotExp(ABaseNotExp node)
    {
        inABaseNotExp(node);
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outABaseNotExp(node);
    }

    public void inALtRelExp(ALtRelExp node)
    {
        defaultIn(node);
    }

    public void outALtRelExp(ALtRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALtRelExp(ALtRelExp node)
    {
        inALtRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getLt() != null)
        {
            node.getLt().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALtRelExp(node);
    }

    public void inAGtRelExp(AGtRelExp node)
    {
        defaultIn(node);
    }

    public void outAGtRelExp(AGtRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGtRelExp(AGtRelExp node)
    {
        inAGtRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getGt() != null)
        {
            node.getGt().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGtRelExp(node);
    }

    public void inAEqRelExp(AEqRelExp node)
    {
        defaultIn(node);
    }

    public void outAEqRelExp(AEqRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqRelExp(AEqRelExp node)
    {
        inAEqRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAEqRelExp(node);
    }

    public void inANeqRelExp(ANeqRelExp node)
    {
        defaultIn(node);
    }

    public void outANeqRelExp(ANeqRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANeqRelExp(ANeqRelExp node)
    {
        inANeqRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getNeq() != null)
        {
            node.getNeq().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outANeqRelExp(node);
    }

    public void inAGeqRelExp(AGeqRelExp node)
    {
        defaultIn(node);
    }

    public void outAGeqRelExp(AGeqRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGeqRelExp(AGeqRelExp node)
    {
        inAGeqRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getGeq() != null)
        {
            node.getGeq().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGeqRelExp(node);
    }

    public void inALeqRelExp(ALeqRelExp node)
    {
        defaultIn(node);
    }

    public void outALeqRelExp(ALeqRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeqRelExp(ALeqRelExp node)
    {
        inALeqRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getLeq() != null)
        {
            node.getLeq().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALeqRelExp(node);
    }

    public void inAIntExpRelExp(AIntExpRelExp node)
    {
        defaultIn(node);
    }

    public void outAIntExpRelExp(AIntExpRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntExpRelExp(AIntExpRelExp node)
    {
        inAIntExpRelExp(node);
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outAIntExpRelExp(node);
    }

    public void inAPlusIntExp(APlusIntExp node)
    {
        defaultIn(node);
    }

    public void outAPlusIntExp(APlusIntExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusIntExp(APlusIntExp node)
    {
        inAPlusIntExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAPlusIntExp(node);
    }

    public void inAMinusIntExp(AMinusIntExp node)
    {
        defaultIn(node);
    }

    public void outAMinusIntExp(AMinusIntExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusIntExp(AMinusIntExp node)
    {
        inAMinusIntExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMinusIntExp(node);
    }

    public void inATermIntExp(ATermIntExp node)
    {
        defaultIn(node);
    }

    public void outATermIntExp(ATermIntExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermIntExp(ATermIntExp node)
    {
        inATermIntExp(node);
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outATermIntExp(node);
    }

    public void inAMultTerm(AMultTerm node)
    {
        defaultIn(node);
    }

    public void outAMultTerm(AMultTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultTerm(AMultTerm node)
    {
        inAMultTerm(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMultTerm(node);
    }

    public void inADivTerm(ADivTerm node)
    {
        defaultIn(node);
    }

    public void outADivTerm(ADivTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivTerm(ADivTerm node)
    {
        inADivTerm(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivTerm(node);
    }

    public void inAModTerm(AModTerm node)
    {
        defaultIn(node);
    }

    public void outAModTerm(AModTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModTerm(AModTerm node)
    {
        inAModTerm(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAModTerm(node);
    }

    public void inAFactorTerm(AFactorTerm node)
    {
        defaultIn(node);
    }

    public void outAFactorTerm(AFactorTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactorTerm(AFactorTerm node)
    {
        inAFactorTerm(node);
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outAFactorTerm(node);
    }

    public void inAIntNegFactor(AIntNegFactor node)
    {
        defaultIn(node);
    }

    public void outAIntNegFactor(AIntNegFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntNegFactor(AIntNegFactor node)
    {
        inAIntNegFactor(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outAIntNegFactor(node);
    }

    public void inAPrimeExpFactor(APrimeExpFactor node)
    {
        defaultIn(node);
    }

    public void outAPrimeExpFactor(APrimeExpFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrimeExpFactor(APrimeExpFactor node)
    {
        inAPrimeExpFactor(node);
        if(node.getArg() != null)
        {
            node.getArg().apply(this);
        }
        outAPrimeExpFactor(node);
    }

    public void inAIntPrimeExp(AIntPrimeExp node)
    {
        defaultIn(node);
    }

    public void outAIntPrimeExp(AIntPrimeExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntPrimeExp(AIntPrimeExp node)
    {
        inAIntPrimeExp(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outAIntPrimeExp(node);
    }

    public void inABoolPrimeExp(ABoolPrimeExp node)
    {
        defaultIn(node);
    }

    public void outABoolPrimeExp(ABoolPrimeExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolPrimeExp(ABoolPrimeExp node)
    {
        inABoolPrimeExp(node);
        if(node.getBoolean() != null)
        {
            node.getBoolean().apply(this);
        }
        outABoolPrimeExp(node);
    }

    public void inAVarPrimeExp(AVarPrimeExp node)
    {
        defaultIn(node);
    }

    public void outAVarPrimeExp(AVarPrimeExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarPrimeExp(AVarPrimeExp node)
    {
        inAVarPrimeExp(node);
        if(node.getVarExp() != null)
        {
            node.getVarExp().apply(this);
        }
        outAVarPrimeExp(node);
    }

    public void inAFunctionCallPrimeExp(AFunctionCallPrimeExp node)
    {
        defaultIn(node);
    }

    public void outAFunctionCallPrimeExp(AFunctionCallPrimeExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionCallPrimeExp(AFunctionCallPrimeExp node)
    {
        inAFunctionCallPrimeExp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getArgList() != null)
        {
            node.getArgList().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAFunctionCallPrimeExp(node);
    }

    public void inAParenPrimeExp(AParenPrimeExp node)
    {
        defaultIn(node);
    }

    public void outAParenPrimeExp(AParenPrimeExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenPrimeExp(AParenPrimeExp node)
    {
        inAParenPrimeExp(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAParenPrimeExp(node);
    }

    public void inAIdVarExp(AIdVarExp node)
    {
        defaultIn(node);
    }

    public void outAIdVarExp(AIdVarExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVarExp(AIdVarExp node)
    {
        inAIdVarExp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdVarExp(node);
    }

    public void inAArrayVarExp(AArrayVarExp node)
    {
        defaultIn(node);
    }

    public void outAArrayVarExp(AArrayVarExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayVarExp(AArrayVarExp node)
    {
        inAArrayVarExp(node);
        if(node.getArray() != null)
        {
            node.getArray().apply(this);
        }
        if(node.getLBracket() != null)
        {
            node.getLBracket().apply(this);
        }
        if(node.getIndex() != null)
        {
            node.getIndex().apply(this);
        }
        if(node.getRBracket() != null)
        {
            node.getRBracket().apply(this);
        }
        outAArrayVarExp(node);
    }

    public void inASomeArgList(ASomeArgList node)
    {
        defaultIn(node);
    }

    public void outASomeArgList(ASomeArgList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomeArgList(ASomeArgList node)
    {
        inASomeArgList(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getArgListTail() != null)
        {
            node.getArgListTail().apply(this);
        }
        outASomeArgList(node);
    }

    public void inANoneArgList(ANoneArgList node)
    {
        defaultIn(node);
    }

    public void outANoneArgList(ANoneArgList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneArgList(ANoneArgList node)
    {
        inANoneArgList(node);
        outANoneArgList(node);
    }

    public void inASomeArgListTail(ASomeArgListTail node)
    {
        defaultIn(node);
    }

    public void outASomeArgListTail(ASomeArgListTail node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomeArgListTail(ASomeArgListTail node)
    {
        inASomeArgListTail(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getArgListTail() != null)
        {
            node.getArgListTail().apply(this);
        }
        outASomeArgListTail(node);
    }

    public void inANoneArgListTail(ANoneArgListTail node)
    {
        defaultIn(node);
    }

    public void outANoneArgListTail(ANoneArgListTail node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneArgListTail(ANoneArgListTail node)
    {
        inANoneArgListTail(node);
        outANoneArgListTail(node);
    }
}
