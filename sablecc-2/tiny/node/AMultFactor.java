/* This file was generated by SableCC (http://www.sablecc.org/). */

package tiny.node;

import tiny.analysis.*;

@SuppressWarnings("nls")
public final class AMultFactor extends PFactor
{
    private PFactor _factor_;
    private TStar _star_;
    private PTerm _term_;

    public AMultFactor()
    {
        // Constructor
    }

    public AMultFactor(
        @SuppressWarnings("hiding") PFactor _factor_,
        @SuppressWarnings("hiding") TStar _star_,
        @SuppressWarnings("hiding") PTerm _term_)
    {
        // Constructor
        setFactor(_factor_);

        setStar(_star_);

        setTerm(_term_);

    }

    @Override
    public Object clone()
    {
        return new AMultFactor(
            cloneNode(this._factor_),
            cloneNode(this._star_),
            cloneNode(this._term_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultFactor(this);
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

    public TStar getStar()
    {
        return this._star_;
    }

    public void setStar(TStar node)
    {
        if(this._star_ != null)
        {
            this._star_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._star_ = node;
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._factor_)
            + toString(this._star_)
            + toString(this._term_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._factor_ == child)
        {
            this._factor_ = null;
            return;
        }

        if(this._star_ == child)
        {
            this._star_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._factor_ == oldChild)
        {
            setFactor((PFactor) newChild);
            return;
        }

        if(this._star_ == oldChild)
        {
            setStar((TStar) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
