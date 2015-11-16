// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Surface;

public final class gmw
{

    private final Surface a;
    private final int b;
    private final int c;
    private final boolean d;

    public gmw(Surface surface, int i, int j, boolean flag)
    {
        a = surface;
        b = i;
        c = j;
        d = flag;
    }

    public Surface a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gmw)
        {
            flag = flag1;
            if (((gmw)obj).a == a)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(a);
        int i = b;
        int j = c;
        boolean flag = d;
        return (new StringBuilder(String.valueOf(s).length() + 69)).append("SurfaceInfo(surface=").append(s).append(",width=").append(i).append(",height=").append(j).append(",clip=").append(flag).append(")").toString();
    }
}
