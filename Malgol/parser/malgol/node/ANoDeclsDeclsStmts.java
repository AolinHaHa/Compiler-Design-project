/* This file was generated by SableCC (http://www.sablecc.org/). */

package malgol.node;

import malgol.analysis.*;

@SuppressWarnings("nls")
public final class ANoDeclsDeclsStmts extends PDeclsStmts
{
    private PStmtList _stmtList_;

    public ANoDeclsDeclsStmts()
    {
        // Constructor
    }

    public ANoDeclsDeclsStmts(
        @SuppressWarnings("hiding") PStmtList _stmtList_)
    {
        // Constructor
        setStmtList(_stmtList_);

    }

    @Override
    public Object clone()
    {
        return new ANoDeclsDeclsStmts(
            cloneNode(this._stmtList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANoDeclsDeclsStmts(this);
    }

    public PStmtList getStmtList()
    {
        return this._stmtList_;
    }

    public void setStmtList(PStmtList node)
    {
        if(this._stmtList_ != null)
        {
            this._stmtList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmtList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stmtList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stmtList_ == child)
        {
            this._stmtList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stmtList_ == oldChild)
        {
            setStmtList((PStmtList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
