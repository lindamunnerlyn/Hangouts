// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.List;

public final class cwn
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final List b;

    public cwn(String s, List list)
    {
        a = s;
        b = list;
    }

    public jbf a()
    {
        jbf jbf1 = new jbf();
        jbf1.a = cvu.a(a);
        if (b != null && b.size() > 0)
        {
            jbf1.b = new String[b.size()];
            for (int i = 0; i < b.size(); i++)
            {
                jbf1.b[i] = (String)b.get(i);
            }

        }
        return jbf1;
    }
}
