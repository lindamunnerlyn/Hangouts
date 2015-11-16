// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvk extends cvf
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cvk(String s)
    {
        a = s;
    }

    public kws a(String s, int i, int j)
    {
        jhs jhs1 = new jhs();
        jhs1.requestHeader = cvu.a(s, i, j, h);
        jhs1.a = a;
        return jhs1;
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public String f()
    {
        return "hangouts/query";
    }
}
