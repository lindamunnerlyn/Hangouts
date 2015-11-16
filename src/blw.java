// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class blw extends bfk
{

    private blz i;

    public blw()
    {
    }

    static blz a(blw blw1)
    {
        return blw1.i;
    }

    public void a(blz blz1)
    {
        i = blz1;
    }

    public void a(dmn dmn, fqp fqp, fqy fqy)
    {
        super.a(dmn, fqp, fqy);
        if (dmn == c)
        {
            a(0, ((bgz) (new dlu(fqp))));
            if (i != null)
            {
                i.e();
            }
        }
    }

    protected bha[] a()
    {
        return (new bha[] {
            new bha(), new bha(), new bha()
        });
    }

    protected void b(CharSequence charsequence)
    {
        super.b(charsequence);
        Object obj = null;
        bma bma1 = obj;
        if (!TextUtils.isEmpty(charsequence))
        {
            charsequence = ebz.g(charsequence.toString());
            bma1 = obj;
            if (charsequence != null)
            {
                bma1 = new bma();
                bma1.a(charsequence, getActivity());
            }
        }
        a(2, bma1);
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
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle, g.gY);
        b().setOnTouchListener(new blx(this));
        f.setOnTouchListener(new bly(this));
        return layoutinflater;
    }
}
