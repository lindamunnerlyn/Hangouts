// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.MatrixCursor;

public final class bmj extends MatrixCursor
    implements bhl
{

    private static final String a[] = {
        "DisplayName", "PhoneNumber"
    };
    private boolean b;

    public bmj()
    {
        super(a);
        b = false;
    }

    public fth a()
    {
        return null;
    }

    public void a(bgx bgx)
    {
    }

    public void a(String s, Context context)
    {
        if (!b)
        {
            String s1 = eey.p(s);
            addRow(new Object[] {
                context.getResources().getString(l.O, new Object[] {
                    s1
                }), s
            });
            b = true;
            return;
        } else
        {
            eev.g("Babel", "InputCallContactCursor.setPhone() was called more than once!");
            return;
        }
    }

    public bhv b()
    {
        return new bhv(new bia(getString(1), ""));
    }

    public bhn c()
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
