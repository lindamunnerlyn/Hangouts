// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;

final class dtq extends gbm
{

    private static final SparseArray a;
    private static final int b[] = {
        5
    };
    private static final SparseArray c;
    private final String d;

    dtq(String s)
    {
        super(g.nS, b, c, a);
        d = s;
    }

    protected ArrayList a()
    {
        return null;
    }

    protected void a(ahf ahf1)
    {
        super.a(ahf1);
        ahf1.a("plid", d);
    }

    protected void a(jew jew1)
    {
        super.a(jew1);
        jew1.a = new jev();
        jew1.a.e = d;
    }

    static 
    {
        SparseArray sparsearray = new SparseArray();
        sparsearray.put(5, "start_call");
        a = sparsearray;
        sparsearray = new SparseArray();
        sparsearray.put(200, "fpnst");
        sparsearray.put(201, "fpnsu");
        sparsearray.put(202, "fpnf");
        sparsearray.put(203, "fpnt");
        c = sparsearray;
    }
}
