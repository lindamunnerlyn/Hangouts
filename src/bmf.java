// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class bmf extends bfw
{

    private bmi i;

    public bmf()
    {
    }

    static bmi a(bmf bmf1)
    {
        return bmf1.i;
    }

    public void a(bmi bmi1)
    {
        i = bmi1;
    }

    public void a(dph dph, fti fti, ftp ftp)
    {
        super.a(dph, fti, ftp);
        if (dph == c)
        {
            a(0, ((bhl) (new dos(fti))));
            if (i != null)
            {
                i.e();
            }
        }
    }

    protected bhm[] a()
    {
        return (new bhm[] {
            new bhm(), new bhm(), new bhm()
        });
    }

    protected void b(CharSequence charsequence)
    {
        super.b(charsequence);
        Object obj = null;
        bmj bmj1 = obj;
        if (!TextUtils.isEmpty(charsequence))
        {
            charsequence = eey.g(charsequence.toString());
            bmj1 = obj;
            if (charsequence != null)
            {
                bmj1 = new bmj();
                bmj1.a(charsequence, getActivity());
            }
        }
        a(2, bmj1);
    }

    protected boolean e()
    {
        return d() != null;
    }

    protected boolean isEmpty()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle, g.gQ);
        b().setOnTouchListener(new bmg(this));
        f.setOnTouchListener(new bmh(this));
        return layoutinflater;
    }
}
