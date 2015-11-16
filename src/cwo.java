// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwo extends cwe
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final String k;

    public cwo(String s, String s1, int i, int j)
    {
        super(s1, s);
        a = i;
        b = j;
        k = s1;
    }

    public kws a(String s, int i, int j)
    {
        s = new jbu();
        izg izg1 = new izg();
        izg1.b = aow.c(this.j);
        izg1.a = cvu.a(k);
        izg1.e = Integer.valueOf(9);
        s.b = Integer.valueOf(a);
        s.a = izg1;
        s.requestHeader = new jdk();
        ((jbu) (s)).requestHeader.a = h.e();
        return s;
    }

    public String f()
    {
        return "conversations/modifyotrstatus";
    }

    public cdl m()
    {
        return new dfs(this);
    }
}
