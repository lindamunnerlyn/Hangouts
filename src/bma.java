// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.MatrixCursor;

public final class bma extends MatrixCursor
    implements bgz
{

    private static final String a[] = {
        "DisplayName", "PhoneNumber"
    };
    private boolean b;

    public bma()
    {
        super(a);
        b = false;
    }

    public fqo a()
    {
        return null;
    }

    public void a(bgl bgl)
    {
    }

    public void a(String s, Context context)
    {
        if (!b)
        {
            String s1 = ebz.p(s);
            addRow(new Object[] {
                context.getResources().getString(l.R, new Object[] {
                    s1
                }), s
            });
            b = true;
            return;
        } else
        {
            ebw.g("Babel", "InputCallContactCursor.setPhone() was called more than once!");
            return;
        }
    }

    public bhj b()
    {
        return new bhj(new bho(getString(1), ""));
    }

    public bhb c()
    {
        return null;
    }

    public int d()
    {
        return 2;
    }

    public int e()
    {
        return 0;
    }

    public boolean f()
    {
        return true;
    }

}
