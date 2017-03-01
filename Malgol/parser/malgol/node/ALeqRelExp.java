/* This file was generated by SableCC (http://www.sablecc.org/). */

package malgol.node;

import malgol.analysis.*;

@SuppressWarnings("nls")
public final class ALeqRelExp extends PRelExp
{
    private PIntExp _left_;
    private TLeq _leq_;
    private PIntExp _right_;

    public ALeqRelExp()
    {
        // Constructor
    }

    public ALeqRelExp(
        @SuppressWarnings("hiding") PIntExp _left_,
        @SuppressWarnings("hiding") TLeq _leq_,
        @SuppressWarnings("hiding") PIntExp _right_)
    {
        // Constructor
        setLeft(_left_);

        setLeq(_leq_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ALeqRelExp(
            cloneNode(this._left_),
            cloneNode(this._leq_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeqRelExp(this);
    }

    public PIntExp getLeft()
    {
        return this._left_;
    }

    public void setLeft(PIntExp node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TLeq getLeq()
    {
        return this._leq_;
    }

    public void setLeq(TLeq node)
    {
        if(this._leq_ != null)
        {
            this._leq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leq_ = node;
    }

    public PIntExp getRight()
    {
        return this._right_;
    }

    public void setRight(PIntExp node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._leq_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._leq_ == child)
        {
            this._leq_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PIntExp) newChild);
            return;
        }

        if(this._leq_ == oldChild)
        {
            setLeq((TLeq) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PIntExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
