// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.List;

public final class cun
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String a;
    private jsh b;

    public cun(String s, List list)
    {
        a = s;
        b = jsh.a(list);
    }

    public String a()
    {
        return a;
    }

    public List b()
    {
        return b;
    }
}
