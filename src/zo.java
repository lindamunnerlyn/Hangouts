// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class zo
{

    int a;
    gz b;
    gz c;
    gz d;
    final List e = new ArrayList();
    int f;
    int g;
    int h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    private SparseArray m;

    public zo()
    {
        a = -1;
        b = new gz();
        c = new gz();
        d = new gz();
        f = 0;
        g = 0;
        h = 0;
        i = false;
        j = false;
        k = false;
        l = false;
    }

    void a(View view)
    {
        e.remove(view);
    }

    void a(zq zq1)
    {
        b.remove(zq1);
        c.remove(zq1);
        if (d == null) goto _L2; else goto _L1
_L1:
        gz gz1;
        int i1;
        gz1 = d;
        i1 = gz1.size() - 1;
_L7:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        if (zq1 != gz1.c(i1)) goto _L5; else goto _L4
_L4:
        gz1.d(i1);
_L2:
        e.remove(zq1.a);
        return;
_L5:
        i1--;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean a()
    {
        return j;
    }

    void b(View view)
    {
        if (!e.contains(view))
        {
            e.add(view);
        }
    }

    public boolean b()
    {
        return l;
    }

    public boolean c()
    {
        return a != -1;
    }

    public int d()
    {
        if (j)
        {
            return g - h;
        } else
        {
            return f;
        }
    }

    public String toString()
    {
        return (new StringBuilder("State{mTargetPosition=")).append(a).append(", mPreLayoutHolderMap=").append(b).append(", mPostLayoutHolderMap=").append(c).append(", mData=").append(m).append(", mItemCount=").append(f).append(", mPreviousLayoutItemCount=").append(g).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(h).append(", mStructureChanged=").append(i).append(", mInPreLayout=").append(j).append(", mRunSimpleAnimations=").append(k).append(", mRunPredictiveAnimations=").append(l).append('}').toString();
    }
}
