/* This file was generated by SableCC (http://www.sablecc.org/). */

package tiny.node;

import tiny.analysis.*;

@SuppressWarnings("nls")
public final class APlusExp extends PExp
{
    private PExp _exp_;
    private TPlus _plus_;
    private PFactor _factor_;

    public APlusExp()
    {
        // Constructor
    }

    public APlusExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PFactor _factor_)
    {
        // Constructor
        setExp(_exp_);

        setPlus(_plus_);

        setFactor(_factor_);

    }

    @Override
    public Object clone()
    {
        return new APlusExp(
            cloneNode(this._exp_),
            cloneNode(this._plus_),
            cloneNode(this._factor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPlusExp(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    public PFactor getFactor()
    {
        return this._factor_;
    }

    public void setFactor(PFactor node)
    {
        if(this._factor_ != null)
        {
            this._factor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._factor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._plus_)
            + toString(this._factor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._factor_ == child)
        {
            this._factor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._factor_ == oldChild)
        {
            setFactor((PFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
