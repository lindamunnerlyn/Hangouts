// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public abstract class cep extends cfi
{

    static final boolean a = false;
    static cet g = new cet();
    public String b;
    public CharSequence c;
    public final long d;
    public int e;
    public String f;

    cep(Context context, int i, int j, edb edb1, long l)
    {
        super(context, i, edb1);
        c = null;
        e = j;
        if (l <= 0L)
        {
            l = System.currentTimeMillis();
        }
        d = l;
    }

    static void a(Context context, int i)
    {
        cfn.a(context, i, null);
        cfe.b(context, i);
    }

    protected Intent b()
    {
        return (new ceq()).a(o, p, q.b());
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
