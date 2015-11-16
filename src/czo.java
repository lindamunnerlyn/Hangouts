// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czo extends dfa
{

    private final String a;
    private final boolean d;

    public czo(ani ani, boolean flag, String s)
    {
        super(ani);
        d = flag;
        a = s;
    }

    public void a()
    {
        cuw cuw1 = new cuw(d, a);
        c.a(cuw1);
    }
}
