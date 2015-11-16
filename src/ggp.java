// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;

final class ggp extends gbm
{

    private static final SparseArray a;
    private static final SparseArray b;
    private static final int c[] = {
        4
    };
    private final String d;

    ggp(Context context, String s)
    {
        super(context, c, b, a);
        d = s;
    }

    protected ArrayList a()
    {
        return null;
    }

    protected void a(ahf ahf1)
    {
        super.a(ahf1);
        ahf1.a("sessionid", d);
    }

    protected void a(jew jew1)
    {
        super.a(jew1);
        jew1.a = new jev();
        jew1.a.k = d;
    }

    static 
    {
        SparseArray sparsearray = new SparseArray();
        sparsearray.put(4, "nms_join");
        a = sparsearray;
        sparsearray = new SparseArray();
        sparsearray.put(101, "pad");
        sparsearray.put(102, "paf");
        sparsearray.put(104, "nad");
        sparsearray.put(105, "naf");
        sparsearray.put(107, "sad");
        sparsearray.put(108, "saf");
        sparsearray.put(110, "mad");
        sparsearray.put(111, "maf");
        sparsearray.put(112, "bad");
        sparsearray.put(113, "baf");
        b = sparsearray;
    }
}
