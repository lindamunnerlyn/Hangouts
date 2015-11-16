// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class dfv
    implements dmf
{

    private static final long serialVersionUID = 1L;
    private int a;
    private String b;
    private int c;
    private int d;
    private int e[];
    private List f;

    public dfv(int i, int j, Integer integer, Collection collection)
    {
        a = 0;
        f = new ArrayList();
        c = i;
        d = 0;
        if (integer == null)
        {
            e = new int[0];
        } else
        {
            e = new int[1];
            e[0] = g.a(integer, 0);
        }
        f.addAll(collection);
    }

    public int a()
    {
        return c;
    }

    public void a(int i)
    {
        a = i;
    }

    public int b()
    {
        return d;
    }

    public void b(String s)
    {
        b = s;
    }

    public int[] c()
    {
        return e;
    }

    public List d()
    {
        return Collections.unmodifiableList(f);
    }

    public int k()
    {
        return a;
    }

    public cdl m()
    {
        return new dfu(this);
    }

    public String toString()
    {
        int i = a;
        int j = c;
        int l = d;
        String s = String.valueOf(Arrays.toString(e));
        String s1 = String.valueOf(f);
        return (new StringBuilder(String.valueOf(s).length() + 118 + String.valueOf(s1).length())).append("OzMergedPersonLookupRequest{requestId=").append(i).append(", lookupType=").append(j).append(", matchType=").append(l).append(", requestTypes=").append(s).append(", ids=").append(s1).append("}").toString();
    }
}
